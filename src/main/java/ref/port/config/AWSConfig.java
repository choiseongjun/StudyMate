//package ref.port.config;
//
//import com.amazonaws.auth.AWSStaticCredentialsProvider;
//import com.amazonaws.auth.BasicAWSCredentials;
//import com.amazonaws.regions.Regions;
//import com.amazonaws.services.s3.AmazonS3;
//import com.amazonaws.services.s3.AmazonS3ClientBuilder;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import ref.port.aws.S3Client;
// 
//@Configuration
//public class AWSConfig {
//    @Value("${cloud.aws.region}") private String region;
//    @Value("${cloud.aws.credentials.accessKey}") private String accessKey;
//    @Value("${cloud.aws.credentials.secretKey}") private String secretKey;
//
//    @Value("${cloud.s3.url}") private String url;
//    @Value("${cloud.s3.bucketName}") private String bucketName;
//
//    @Bean
//    public AmazonS3 amazonS3(){
//        return AmazonS3ClientBuilder
//            .standard()
//            .withRegion(Regions.fromName(region))
//            .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(accessKey, secretKey)))
//            .build();
//    }
//
//    @Bean
//    public S3Client s3Client(AmazonS3 amazonS3) {
//        return new S3Client(amazonS3, url, bucketName);
//    }
//
//
//}
