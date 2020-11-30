package com.engine.input;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInput extends JPanel {
    public KeyboardInput()
    {
        KeyListener listener = new MyKeyListener();
        addKeyListener(listener);
        setFocusable( true );
    }

    public class MyKeyListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ESCAPE){
                System.exit(0);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
