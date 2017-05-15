import javax.swing.*;
import java.awt.*;

public class GUI extends Canvas {

    int width;
    int height;

    JFrame frame;
    Map map;


    public GUI(int width, int height, String title) {
        this.width = width;
        this.height = height;
        frame = new JFrame();
        frame.setSize(width, height);
        frame.setTitle(title);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        map = new Map();
    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(50, 50, 100, 100);
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                g.fillRect(i * 64, j * 64, 64, 64);
            }
        }
    }
}
