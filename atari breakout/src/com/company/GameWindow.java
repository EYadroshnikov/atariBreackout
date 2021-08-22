package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class GameWindow extends JFrame {
    private static GameWindow gameWindow;
    private static long last_frame_time;
    private static Image background;
    private static Image plate;
    private static Image ball;

    public static void main(String[] args) throws IOException {
        background = ImageIO.read(GameWindow.class.getResourceAsStream("background.png"));
        gameWindow = new GameWindow();
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.setLocation(0, 0);
        gameWindow.setSize(1280, 720);
        gameWindow.setResizable(false);
        last_frame_time = System.nanoTime();
    }

}
