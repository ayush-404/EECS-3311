package view;

import javax.swing.*;
import java.awt.*;

public class AppPanel extends JPanel {
    private String input="";
    private final Font font;
    private YellowView yellow;
    private GreenView green;
    private OrangeView orange;
    public AppPanel() {
        super(null);
        super.setBackground(Color.WHITE);
        font = new Font("UI", Font.BOLD, 15);
        initViews();
        this.add(green);
        this.add(orange);
        this.add(yellow);
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 8);
    }

    private void initViews() {
        yellow = new YellowView(this, font);
        green = new GreenView(this, font);
        orange = new OrangeView(this, font);
        yellow.getViewInfo().attach(orange.getViewInfo());
        yellow.getViewInfo().attach(green.getViewInfo());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public YellowView getYellowView() {
        return yellow;
    }

    public OrangeView getOrangeView() {
        return orange;
    }

    public GreenView getGreenView() {
        return green;
    }

    public void convert() {
        yellow.getViewInfo().update(yellow.getText());
        orange.update();
        green.update();
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
