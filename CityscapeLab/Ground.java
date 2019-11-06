import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * draws ground
 *
 * @author safiyab04
 * @version 10/14/19
 */
public class Ground
{
    private int x;
    private int y;
    
    /**
     * Constructor
     */
    public Ground()
    {
        x = 0;
        y = 0;
    }
    
    /**
     * Draws ground
     * 
     * @param g2, Graphics2D object
     */
    public void draw(Graphics2D g2)
    {
        Color color = new Color(51, 102, 0);
        g2.setColor(color);
        Rectangle ground = new Rectangle(0, 0, 800, 600);
        g2.draw(ground);
        g2.fill(ground);
    }
}
