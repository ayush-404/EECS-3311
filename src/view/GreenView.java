package view;
import model.GreenViewInfo;

import javax.swing.*;
import java.awt.*;

public class GreenView extends JTextArea {
    private GreenViewInfo viewInfo;
    private AppPanel panel;
    public GreenView(AppPanel panel, Font font) {
        super(5,20);
        this.panel = panel;
        viewInfo = new GreenViewInfo(panel.getYellowView().getViewInfo());
        super.setBounds(100,10, 200,200);
        super.setBackground(Color.GREEN);
        super.setFont(font);
        super.setEditable(false);
    }

    public void update() {
        viewInfo.observe();
        super.setText(viewInfo.getInfo());
    }

    public GreenViewInfo getViewInfo() {
        return viewInfo;
    }
}
