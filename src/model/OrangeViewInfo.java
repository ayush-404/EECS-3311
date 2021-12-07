package model;

import javax.swing.*;

public class OrangeViewInfo extends JTextArea implements Observer{
    private final Subject subject;
    private String info;

    public OrangeViewInfo(Subject subject) {
        this.subject = subject;
    }
    @Override
    public void observe() {
        info = subject.notifyObserver(this);
        double m = Double.parseDouble(info)/100;
        info = String.format("%.2f", m) + " m";
    }

    public String getInfo() {
        return info;
    }
}
