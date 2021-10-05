import shapes.MyPanel;

import javax.swing.*;
import java.awt.*;

public class App {

    public final static int WIDTH = 1100;
    public final static int HEIGHT = 1080;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab 3");
        MyPanel display = new MyPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(display);
        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
