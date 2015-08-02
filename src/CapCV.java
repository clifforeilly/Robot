import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

import java.awt.image.BufferedImage;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

public class CapCV {


    public static void main(String[] argv) throws Exception {

        Robot robot = new Robot();
        int x = 100;
        int y = 100;
        int width = 200;
        int height = 200;
        Rectangle area = new Rectangle(x, y, width, height);
        BufferedImage bufferedImage = robot.createScreenCapture(area);

        int rgb1 = bufferedImage.getRGB(90,90);

        System.out.println((Integer.toString(rgb1)));


        // Capture the whole screen
//        area = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
  //      bufferedImage = robot.createScreenCapture(area);

    }

}
