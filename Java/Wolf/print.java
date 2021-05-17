package Java.Wolf;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class print {

    private final String path;

    public print(String path) {
        this.path = "C:/";
    }

    public void getPrint(int timeToWait) throws Exception {
        Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit()
            .getScreenSize());
        Robot robot = new Robot();
        BufferedImage img = robot.createScreenCapture(rectangle);
        ImageIO.write(img, "jpg", new File(path));
    }
}