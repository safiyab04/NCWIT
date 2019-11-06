import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Polygon;

/**
 * Draws "Chicago River"
 *
 * @author safiyab04
 * @version (a version number or a date)
 */
public class River
{
    //no constructor as river position is pre-determined
    
    /**
     * Draws river
     * 
     * @param g2, Graphics2D object
     */
    public void draw(Graphics2D g2)
    {
        Color color = new Color(0, 51, 102);
        g2.setColor(color);
        int x[] = {0, 360, 390, 800};
        int y[] = {600, 200, 200, 600};
        Polygon river = new Polygon(x, y, 4);
        g2.draw(river);
        g2.fill(river);
    }
}
