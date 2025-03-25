package module3.lesson2.app.common;

import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 11.03.2025
 */

public abstract class Sprite implements CanvasObject {

    protected float x;
    protected float y;
    protected float halfWidth;
    protected float halfHeight;

    public void setLeft(float left) {
        x = left + halfWidth;
    }

    public void setRight(float right) {
        x = right - halfWidth;
    }

    public void setTop(float top) {
        y = top + halfHeight;
    }

    public void setBottom(float bottom) {
        y = bottom - halfHeight;
    }

    public float getLeft() {
        return x - halfWidth;
    }

    public float getRight() {
        return x + halfWidth;
    }

    public float getTop() {
        return y - halfHeight;
    }

    public float getBottom() {
        return y + halfHeight;
    }

    public float getWidth() {
        return 2f * halfWidth;
    }

    public float getHeight() {
        return 2f * halfHeight;
    }

    public abstract void render(Canvas canvas, Graphics g);
    public abstract void update(Canvas canvas, float deltaTime);


}
