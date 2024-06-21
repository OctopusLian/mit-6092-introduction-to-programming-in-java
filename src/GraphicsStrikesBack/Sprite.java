package GraphicsStrikesBack;

import java.awt.Graphics;

// Sprite 是计算机图形学中的一个术语，指的是一个小的动画对象
public interface Sprite {
    /**
     * Draws this sprite on surface, with the coordinate (leftX, topY) as the
     * top left corner.
     */
    void draw(Graphics surface, int leftX, int topY);

    /** Returns the width of the sprite. */
    int getWidth();

    /** Returns the height of the sprite. */
    int getHeight();
}
