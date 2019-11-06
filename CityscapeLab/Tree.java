import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.geom.Rectangle2D.Double;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;


/**
 * Draws a tree
 *
 * @author safiyab04
 * @version 10/14/19
 */
public class Tree
{
    private double x; //top right corner of trunk
    private double y; //top left corner of trunk
    private double z; //size
    
    /**
     * Constructor method for tree
     * 
     * @param xTopLeft, the x coordinate of the top left corner of the trunk
     * @param yTopLeft, the y coordinate of the top left corner of the trunk
     * @param size, size factor of tree
     */
    public Tree(double xTopLeft, double yTopLeft, double size)
    {
        this.x = xTopLeft;
        this.y = yTopLeft;
        this.z = size;
    }
    
    /**
     * Draws tree
     * 
     * @param g2, Graphics2D object
     */
    public void draw(Graphics2D g2)
    {
        Color brown = new Color(102, 51, 0);
        g2.setColor(brown);
        RoundRectangle2D.Double trunk = new RoundRectangle2D.Double(this.x, this.y, z*2, z*10, z, z);
        g2.draw(trunk);
        g2.fill(trunk);
        
        Color green = new Color(0, 102, 51);
        g2.setColor(green);
        Ellipse2D.Double leaves = new Ellipse2D.Double(this.x - (z*3), this.y - (z*6), z*8, z*8);
        g2.draw(leaves);
        g2.fill(leaves);
        Color darkGreen = new Color(0, 102, 0);
        g2.setColor(darkGreen);
        Ellipse2D.Double outline = new Ellipse2D.Double(this.x - (z*3), this.y - (z*6), z*8, z*8);
        g2.draw(outline);
    }
}
