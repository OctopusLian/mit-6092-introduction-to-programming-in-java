package Graphics;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    //BouncingBox box;
    private ArrayList<BouncingBox> boxes;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        //box = new BouncingBox(200, 50, Color.RED);
        boxes = new ArrayList<BouncingBox>();
        boxes.add(new BouncingBox(50, 50, Color.RED));
        boxes.add(new BouncingBox(100, 100, Color.BLUE));
        boxes.add(new BouncingBox(150, 150, Color.GREEN));

        boxes.get(0).setMovementVector(1, 2);
        boxes.get(1).setMovementVector(2, 1);
        boxes.get(2).setMovementVector(1, 1);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
//        surface.drawLine(50, 50, 250, 250);
//        box.draw(surface);
        for (BouncingBox box : boxes) {
            box.draw(surface);
        }

        // Draw additional shapes
        surface.setColor(Color.ORANGE);
        surface.fillOval(200, 200, 30, 30);

        surface.setColor(Color.MAGENTA);
        surface.fillRect(50, 200, 40, 20);

        surface.setColor(Color.CYAN);
        surface.drawLine(0, 0, SimpleDraw.WIDTH, SimpleDraw.HEIGHT);
    }
}
