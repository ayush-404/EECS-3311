package controller;

import model.Command;
import model.SaveInputCentiCommand;
import view.AppPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class AppInputListener implements KeyListener {
    private final AppPanel panel;
    private boolean altPressed;
    private boolean fPressed;
    private Command command;

    public AppInputListener(AppPanel panel) {
        this.panel = panel;
        command = new SaveInputCentiCommand(panel);
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_ALT) {
            altPressed = true;
        }
        if(e.getKeyCode() == KeyEvent.VK_F) {
            fPressed = true;
        }

        if(altPressed && fPressed) {
            command.invoke();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ALT) {
            altPressed = false;
        }
        if(e.getKeyCode() == KeyEvent.VK_F) {
            fPressed = false;
        }
    }
}
