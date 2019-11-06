import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.geom.Rectangle2D;

/**
 * draws one window (to be used in building class)
 *
 * @author safiyab04
 * @version 10/14/19
 */
public class Window
{
    //no constructor because no instance variables are used
    //parameters are used in draw method for compatability in for loop
    /**
     * Draws one window
     * 
     * @param g2; Graphics2D object
     * @param x; x-coordinate of top left of window
     * @param y; y-coordinate of top left of window
     * @param height; height of window
     * @param width; width of window
     */
    public void draw(Graphics2D g2, double x, double y, double height, double width)
    {
        Color color = new Color(224, 224, 224);
        g2.setColor(color);
       
        Rectangle2D.Double window = new Rectangle2D.Double(x, y, width, height);
        g2.draw(window);
        g2.fill(window);
    }
}
