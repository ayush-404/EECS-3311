// Name: Ayush Sharma





import shapes.MyPanel;

import javax.swing.*;
import java.awt.*;

public class App {

    public final static int WIDTH = 1000;
    public final static int HEIGHT = 1000;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab 3");
        MyPanel display = new MyPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(display);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
