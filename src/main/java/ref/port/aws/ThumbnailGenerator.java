package ref.port.aws;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.coobird.thumbnailator.Thumbnails;

public class ThumbnailGenerator {

    // 썸네일의 너비와 높이.
    private final static int dw = 150;
    private final static int dh = 150;

    public File generate(File target, String newFileName, String extension) throws IOException {
        BufferedImage srcImg =  ImageIO.read(target);
        // 원본 이미지의 너비와 높이.
        int ow = srcImg.getWidth();
        int oh = srcImg.getHeight();

        // 원본 너비를 기준으로 하여 썸네일의 비율로 높이를 계산.
        int nw = ow; int nh = (ow * dh) / dw;
        // 계산된 높이가 원본보다 높다면 crop이 안되므로 원본 높이를 기준으로 썸네일의 비율로 너비를 계산합니다.
        if(nh > oh) {
            nw = (oh * dw) / dh; nh = oh;
        }

        File thumbnail = new File(newFileName + "." + extension);
        if (target.exists()) {
            Thumbnails.of(target).size(nw, nh).outputFormat(extension).toFile(thumbnail);
        }

        return thumbnail;
    }
}
