package view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class AppMenuBar extends JMenuBar {

    public AppMenuBar(ActionListener menubarListener) {
        super();
        JMenu appMenu = new JMenu("Update Model");
        JMenuItem menuItem = new JMenuItem("Save input centimeters");
        menuItem.addActionListener(menubarListener);
        KeyStroke shortCut = KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.ALT_DOWN_MASK);
        menuItem.setAccelerator(shortCut);
        appMenu.add(menuItem);
        super.add(appMenu);
    }
}
