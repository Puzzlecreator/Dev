package com.engine.apphost;

import com.engine.input.KeyboardInput;

import javax.swing.*;
import java.awt.*;

public class InitWindow extends JPanel {

    // Tells if debug is needed
    private boolean debug = false;

    // Creates Window Frame
    public void createWindow(String Title)
    {
        int Height;
        int Width;

        Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();

        Width = (int) ScreenSize.getWidth();
        Height = (int) ScreenSize.getHeight();

        JFrame fr = new JFrame(Title);
        JPanel jp = new JPanel();
        KeyboardInput KI = new KeyboardInput();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.add(KI);

        jp.setBackground(Color.BLACK);
        fr.add(jp);
        fr.setSize(Width, Height);

        fr.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fr.setUndecorated(true);

        fr.setVisible(true);
        if (debug == true)
        {
            System.out.println(fr.getSize());
            System.out.println(fr.getExtendedState());
        }

    }
}