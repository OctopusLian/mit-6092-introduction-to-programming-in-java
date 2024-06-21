package GraphicsStrikesBack;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    Bouncer movingSprite;
    Bouncer movingOval;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        // 绘制矩形
        Rectangle box = new Rectangle(15, 20, Color.RED);
        movingSprite = new Bouncer(100, 170, box);
        movingSprite.setMovementVector(3, 1);
        // 绘制椭圆形
        Oval oval = new Oval(20, 20, Color.GREEN);
        movingOval = new Bouncer(120, 170, oval);
        movingOval.setMovementVector(3, 1);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        movingSprite.draw(surface);
        movingOval.draw(surface);
    }
}
