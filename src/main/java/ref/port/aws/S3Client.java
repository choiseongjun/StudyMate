package ref.port.aws;

import static org.apache.commons.lang3.StringUtils.isEmpty;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;

public final class S3Client {
    private final AmazonS3 amazonS3;
    private final String url;
    private final String bucketName;

    public S3Client(AmazonS3 amazonS3, String url, String bucketName) {
        this.amazonS3 = amazonS3;
        this.url = url;
        this.bucketName = bucketName;
    }

    public S3Object get(String key) {
        GetObjectRequest request = new GetObjectRequest(bucketName, key);
        return amazonS3.getObject(request);
    }

    public String upload(File file) {
        PutObjectRequest request = new PutObjectRequest(bucketName, file.getName(), file);
        return executePut(request);
    }

    public String upload(byte[] bytes, String basePath, Map<String, String> metadata) {
        String name = isEmpty(basePath) ? UUID.randomUUID().toString() : basePath + "/" + UUID.randomUUID().toString();
        return upload(new ByteArrayInputStream(bytes), bytes.length, name + ".jpeg", "image/jpeg", metadata);
    }

    public String upload(InputStream in, long length, String key, String contentType, Map<String, String> metadata) {
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setContentLength(length);
        objectMetadata.setContentType(contentType);
        if (metadata != null && !metadata.isEmpty())
            objectMetadata.setUserMetadata(metadata);

        PutObjectRequest request = new PutObjectRequest(bucketName, key, in, objectMetadata);
        return executePut(request);
    }

    public void delete(String url) {
        String key = FilenameUtils.getName(url);
        DeleteObjectRequest request = new DeleteObjectRequest(bucketName, key);
        executeDelete(request);
    }

    private String executePut(PutObjectRequest request) {
        amazonS3.putObject(request.withCannedAcl(CannedAccessControlList.PublicRead));

        StringBuilder sb = new StringBuilder(url);
        if (!url.endsWith("/"))
            sb.append("/"); 
        sb.append(bucketName);
        sb.append("/");
        sb.append(request.getKey());
        return sb.toString();
    }

    private void executeDelete(DeleteObjectRequest request) {
        amazonS3.deleteObject(request);
    }
}
