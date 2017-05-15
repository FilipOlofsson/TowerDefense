import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    int width;
    int height;

    JFrame frame;


    public GUI(int width, int height, String title) {
        this.width = width;
        this.height = height;
        frame = new JFrame();
        frame.setSize(width, height);
        frame.setTitle(title);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {

    }
}
