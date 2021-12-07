package view;

import model.OrangeViewInfo;
import javax.swing.*;
import java.awt.*;

public class OrangeView extends JTextArea {

    private OrangeViewInfo viewInfo;
    private AppPanel panel;

    public OrangeView(AppPanel panel, Font font) {
        super();
        viewInfo = new OrangeViewInfo(panel.getYellowView().getViewInfo());
        super.setBounds(310,10, 200,200);
        super.setBackground(Color.ORANGE);
        super.setFont(font);
        super.setEditable(false);
    }

    public void update() {
        viewInfo.observe();
        super.setText(viewInfo.getInfo());
    }

    public OrangeViewInfo getViewInfo() {
        return viewInfo;
    }
}
