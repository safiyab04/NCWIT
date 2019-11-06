import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Polygon;


/**
 * Draws a boat
 *
 * @author safiyab04
 * @version 10/2/19
 */
public class Boat
{
    private int xTopLeft; // x-value of position of middle of boat
    private int yTopLeft; // y-value of position of middle of boat
    private int z; //size
    
    /**
     * Constructor
     * 
     * @param x, the x-value of the top left of the middle of the boat
     * @param y, the y-value of the top left of the middle of the boat
     * @param size, the size factor
     */
    public Boat(int x, int y, int size)
    {
        this.xTopLeft = x;
        this.yTopLeft = y;
        this.z = size;
    }
    
    
    /**
     * Draws boat
     * 
     * @param g2, Graphics2D object
     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.GRAY);
        int xTop[] = {xTopLeft + (z*10), xTopLeft + (z*15), xTopLeft + (z*35), xTopLeft + (z*40)};
        int yTop[] = {yTopLeft, yTopLeft - (z*15), yTopLeft - (z*15), yTopLeft};
        Polygon topOfBoat = new Polygon(xTop, yTop, 4);
        g2.draw(topOfBoat);
        g2.fill(topOfBoat);
        
        g2.setColor(Color.BLUE);
        int xWindow1[] = {xTopLeft + (z*11), xTopLeft + (z*16), xTopLeft + (z*24), xTopLeft + (z*24)};
        int yWindow1[] = {yTopLeft - (z*1), yTopLeft - (z*14), yTopLeft - (z*14), yTopLeft - (z*1)};
        Polygon window1 = new Polygon(xWindow1, yWindow1, 4);
        g2.draw(window1);
        g2.fill(window1);
        int xWindow2[] = {xTopLeft + (z*39), xTopLeft + (z*34), xTopLeft + (z*26),xTopLeft + (z*26)};
        int yWindow2[] = {yTopLeft - (z*1), yTopLeft - (z*14), yTopLeft - (z*14), yTopLeft - (z*1)};
        Polygon window2 = new Polygon(xWindow2, yWindow2, 4);
        g2.draw(window2);
        g2.fill(window2);
        
        Color darkRed = new Color(153, 0, 0);
        g2.setColor(darkRed);
        int xArray[] = {xTopLeft, xTopLeft + (z*10), xTopLeft + (z*40), xTopLeft + (z*50)};
        int yArray[] = {yTopLeft, yTopLeft + (z*16), yTopLeft + (z*16), yTopLeft};
        Polygon bottomOfBoat = new Polygon(xArray, yArray, 4);
        g2.draw(bottomOfBoat);
        g2.fill(bottomOfBoat);
        g2.fillOval(xTopLeft, yTopLeft - (z*5), (z*50), (z*10));
        int xTriArray[] = {xTopLeft + (z*10), xTopLeft + (z*25), xTopLeft + (z*40)};
        int yTriArray[] = {yTopLeft + (z*16), yTopLeft + (z*21), yTopLeft + (z*16)};
        Polygon triangle = new Polygon(xTriArray, yTriArray, 3);
        g2.draw(triangle);
        g2.fill(triangle);
        
    }
    
    
    
    /**
     * Moves boat down river
     */
    public void move()
    {
        this.xTopLeft -= 15;
        this.yTopLeft += 45;
        this.z +=1;
    }
}
