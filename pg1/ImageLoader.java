package pg1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageLoader {
    static Image imgX, imgO, img, imgne, imgvs, imgre, imgdr, imgdr2;
    static ImageIcon icon;
    public ImageLoader() {
        try {
            imgX = ImageIO.read(new File("res/X.png"));
            imgO = ImageIO.read(new File("res/O.png"));
            img = ImageIO.read(new File("res/src/bg.jpg"));
            imgne = ImageIO.read(new File("res/src/ne.png"));
            imgvs = ImageIO.read(new File("res/src/vs.png"));
            imgre = ImageIO.read(new File("res/src/re.jpg"));
            imgdr = ImageIO.read(new File("res/src/dr.png"));
            imgdr2 = ImageIO.read(new File("res/src/dr2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
