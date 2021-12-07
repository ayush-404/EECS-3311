package model;

import view.AppPanel;
import view.YellowView;

public class SaveInputCentiCommand implements Command{
    private final AppPanel panel;
    public SaveInputCentiCommand(AppPanel panel) {
        this.panel = panel;
    }

    public void invoke() {
        YellowView yellow = panel.getYellowView();
        yellow.getViewInfo().update(yellow.getText());
        panel.getGreenView().update();
        panel.getOrangeView().update();
    }
}
