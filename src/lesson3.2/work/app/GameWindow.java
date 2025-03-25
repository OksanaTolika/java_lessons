package module3.lesson2.app;

import module3.lesson2.app.common.Canvas;
import module3.lesson2.app.common.CanvasObject;
import module3.lesson2.app.common.RenderListener;
import module3.lesson2.app.objects.Circle;
import module3.lesson2.app.objects.GameRectangle;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 11.03.2025
 */

public class GameWindow extends JFrame implements RenderListener {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int POS_X = 500;
    private static final int POS_Y = 260;

    private CanvasObject[] sprites = new CanvasObject[5];

    public GameWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setTitle("Circles");
        setLocation(POS_X, POS_Y);

        Canvas canvas = new Canvas(this);
        add(canvas, BorderLayout.CENTER);
        addSprites();

        setVisible(true);
    }

    private void addSprites() {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i] = new GameRectangle();
        }
    }

    public void onRenderFrame(Canvas canvas, Graphics g, float deltaTime) {
        update(canvas, deltaTime);
        render(canvas, g);
    }

    private void update(Canvas canvas, float deltaTime) {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].update(canvas, deltaTime);
        }
    }

    private void render(Canvas canvas, Graphics g) {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].render(canvas, g);
        }
    }
}
