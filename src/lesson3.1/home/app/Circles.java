package module3.lesson1.app;

import module3.lesson1.app.objects.Circle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 11.03.2025
 */

public class Circles extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int POS_X = 500;
    private static final int POS_Y = 260;
    private static final int START_COUNT = 10;

    ArrayList<Circle> sprites = new ArrayList<>();

    public Circles() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setTitle("Circles");
        setLocation(POS_X, POS_Y);

        Canvas canvas = new Canvas(this);
        add(canvas, BorderLayout.CENTER);
        addSprites();

        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                Circle circle = new Circle();
                circle.setLeft(e.getX());
                circle.setTop(e.getY());
                sprites.add(circle);
            }
        });

        setVisible(true);
    }

    private void addSprites() {
        for (int i = 0; i < START_COUNT; i++) {
            sprites.add(new Circle());
        }
    }

    public void onRenderFrame(Canvas canvas, Graphics g, float deltaTime) {
        update(canvas, deltaTime);
        render(canvas, g);
    }

    private void update(Canvas canvas, float deltaTime) {
        for (int i = 0; i < sprites.size(); i++) {
            sprites.get(i).updateCoordinations(canvas, deltaTime);
        }
        for (int i = 0; i < sprites.size(); i++) {
            sprites.get(i).updateVector(canvas, deltaTime, sprites);
        }
    }

    private void render(Canvas canvas, Graphics g) {
        for (int i = 0; i < sprites.size(); i++) {
            sprites.get(i).render(canvas, g);
        }
    }
}
