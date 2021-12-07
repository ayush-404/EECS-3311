package main;

import controller.AppInputListener;
import controller.AppMenuBarListener;
import view.AppMenuBar;
import view.AppPanel;

import javax.swing.*;

public class ConverterApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Converter App");
        AppPanel panel = new AppPanel();
        AppInputListener inputListener = new AppInputListener(panel);
        AppMenuBarListener menubarListener = new AppMenuBarListener(panel);
        AppMenuBar menubar = new AppMenuBar(menubarListener);
        frame.add(panel);
        frame.addKeyListener(inputListener);
        frame.setJMenuBar(menubar);
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
