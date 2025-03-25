package module3.lesson1.app.objects;

import module3.lesson1.app.Canvas;
import module3.lesson1.app.models.Sprite;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 11.03.2025
 */

public class Circle extends Sprite {

    private float vectorX = (float) (100 + Math.random() * 250f);
    private float vectorY = (float) (100 + Math.random() * 250f);
    private final Color color = new Color(
            (int) (Math.random() * 255),
            (int) (Math.random() * 255),
            (int) (Math.random() * 255)
    );

    public Circle() {
        halfWidth = 10 + (float) (Math.random() * 50f);
        halfHeight = halfWidth;
    }

    @Override
    public void render(Canvas canvas, Graphics g) {
        g.setColor(color);
        g.fillOval((int) getLeft(),
                (int) getTop(),
                (int) getWidth(),
                (int) getHeight()
        );
    }

    @Override
    public void updateCoordinations(Canvas canvas, float deltaTime) {
        x += vectorX * deltaTime;
        y += vectorY * deltaTime;
    }

    @Override
    public void updateVector(Canvas canvas, float deltaTime, ArrayList<Circle> circles) {
        if (getLeft() < canvas.getLeft() && vectorX < 0) {
            vectorX = -vectorX;
        }
        if (getRight() > canvas.getRight() && vectorX > 0) {
            vectorX = -vectorX;
        }
        if (getTop() < canvas.getTop() && vectorY < 0) {
            vectorY = -vectorY;
        }
        if (getBottom() > canvas.getBottom() && vectorY > 0) {
            vectorY = -vectorY;
        }

        for (int i = 0; i < circles.size(); i++) {
            if (circles.get(i) != this) {
                float dx = x - circles.get(i).x;
                float dy = y - circles.get(i).y;
                if ((halfHeight + circles.get(i).halfWidth) >= (Math.sqrt(dx * dx + dy * dy))) {
                    if ((vectorX < 0 && dx > 0) || (vectorX > 0 && dx < 0)) {
                        vectorX = -vectorX;
                    }
                    if ((vectorY < 0 && dy > 0) || (vectorY > 0 && dy < 0)) {
                        vectorY = -vectorY;
                    }
                }
            }
        }
    }


}
