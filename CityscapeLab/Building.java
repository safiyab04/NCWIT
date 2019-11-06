import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Polygon;

/**
 * draws a building
 *
 * @author safiyab04
 * @version 10/14/19
 */
public class Building
{
    private Color color;
    private int height;
    private int x;
    private int y;
    private int width;
    Window window = new Window();
    
    /**
     * Constructor
     * 
     * @param newColor; color of building
     * @param newHeight; height of building
     * @param topLeftX; top left x-coordinate of building
     * @param topLeftY; top left y-coordinate of building
     * @param newWidth; width of building
     */
    public Building(Color newColor, int newHeight, int topLeftX, int topLeftY, int newWidth)
    {
        this.color = newColor;
        this.height = newHeight;
        this.x = topLeftX;
        this.y = topLeftY;
        this.width = newWidth;
    }
    
    /**
     * Draws building
     * 
     * @param g2, Graphics2D object
     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(color);
        Rectangle main = new Rectangle(this.x, this.y, this.width, this.height);
        g2.draw(main);
        g2.fill(main);
        int widthnum = width / 17;
        int heightnum = height / 17;
        double widthbetween = 10;
        double heightbetween = 10;
        for (double i=1; i<=widthnum; i++)
        {
            for (double j=1; j<=heightnum; j++)
           {
               double xz = this.x;
               double yz = this.y;
               double newx = xz + (i * widthbetween) + ((i-1)*7.0) ;
               double newy = yz + (j * heightbetween) + ((j-1)*7.0);
               
              
               window.draw(g2, newx, newy, 7.0, 7.0);
           }
        }
        //^uses for loop to draw windows in building
    }
}
