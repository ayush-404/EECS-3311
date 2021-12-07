package view;

import model.YellowViewInfo;

import javax.swing.*;
import java.awt.*;

public class YellowView extends JTextArea {
    private YellowViewInfo viewInfo;
    private AppPanel panel;
    public YellowView(AppPanel panel, Font font) {
        super();
        viewInfo = new YellowViewInfo();
        this.panel = panel;
        super.setBounds(200,220,210, 200);
        super.setBackground(Color.YELLOW);
        super.setFont(font);
    }

    public void setState(String state) {
        viewInfo.update(state);
    }

    public String getState() {
        return viewInfo.getState();
    }

    public YellowViewInfo getViewInfo() {
        return viewInfo;
    }
}
