import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    private Ground ground;
    private River river;
    private Boat smallBoat;
    
    private Building building1;
    private Building building2;
    private Building building3;
    private Building building4;
    private Building building5;
    private Building building6;
    private Building building7;
    private Building building8;
    private Building building9;
    private Building building10;
    private Building building11;
    private Building building12;
    private Building building13;
    private Building building14;
    private Building building15;
    private Building building16;
    private Building building17;
    private Building building18;
    private Building building19;
    private Building building20;
    private Building building21;
    private Building building22;
    private Building building23;
    private Building building24;
    private Building building25;
    private Building building26;
    private Building building27;
    private Building building28;
    private Building building29;
    private Building building30;
    private Building building31;
    private Building building32;
    private Building endBuilding;
    
    private Tree tree1;
    private Tree tree2;
    private Tree tree3;
    private Tree tree4;
    private Tree tree5;
    private Tree tree6;
    private Tree tree7;
    private Tree tree8;
    private Tree tree9;
    private Tree tree10;
    private Tree tree11;
    private Tree tree12;
    private Tree tree13;
    private Tree tree14;
    private Tree tree15;
    private Tree tree16;
    private Tree tree17;
    private Tree tree18;
    private Tree tree19;
    private Tree tree20;
    private Tree tree21;
    private Tree tree22;
    private Tree tree23;
    private Tree tree24;
    private Tree tree25;
    private Tree tree26;
    private Tree tree27;
    private Tree tree28;
    private Tree tree29;
    private Tree tree30;
    private Tree tree31;
    private Tree tree32;
    private Tree tree33;
    private Tree tree34;
    private Tree tree35;
    private Tree tree36;
    private Tree tree37;
    private Tree tree38;
    private Tree tree39;
    private Tree tree40;
    private Tree tree41;
    private Tree tree42;
    private Tree tree43;
    private Tree tree44;
    private Tree tree45;
    private Tree tree46;
    private Tree tree47;
    private Tree tree48;
    private Tree tree49;
    private Tree tree50;
    private Tree tree51;
    private Tree tree52;
    private Tree tree53;
    private Tree tree54;
    private Tree tree55;
    private Tree tree56;
    private Tree tree57;
    private Tree tree58;
    private Tree tree59;
    private Tree tree60;
    private Tree tree61;
    private Tree tree62;
    private Tree tree63;
    private Tree tree64;
    private Tree tree65;
    private Tree tree66;
    private Tree tree67;
    private Tree tree68;
    private Tree tree69;
    private Tree tree70;

    private final Color RED;
    private final Color GREEN;
    private final Color TAN;
    private final Color DARKGRAY;
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    public CityscapeComponent()
    {
        RED = new Color(51, 0, 0);
        GREEN = new Color(25, 51, 0);
        TAN = new Color(153, 153, 0);
        DARKGRAY = new Color(32, 32, 32);
        
        ground = new Ground();
        river = new River();
        smallBoat = new Boat(320, 230, 1);

        
        building1 = new Building(RED, 540, 0, 0, 50);
        building2 = new Building(GREEN, 300, 30, 170, 80);
        building3 = new Building(TAN, 370, 40, 40, 130); 
        building4 = new Building(Color.GRAY, 230, 60, 130, 150);
        building5 = new Building(GREEN, 160, 140, 170, 100);
        building6 = new Building(RED, 140, 210, 150, 60); 
        building7 = new Building(TAN, 140, 240, 120, 60);
        building8 = new Building(DARKGRAY, 100, 260, 120, 70);
        building9 = new Building(GREEN, 80, 310, 110, 50);
        building10 = new Building(TAN, 500, 740, 40, 100);
        building11 = new Building(DARKGRAY, 400, 670, 70, 80);
        building12 = new Building(RED, 400, 600, 0, 100);
        building13 = new Building(GREEN, 300, 550, 50, 100);
        building14 = new Building(TAN, 250, 510, 60, 100); 
        building15 = new Building(Color.GRAY, 190, 480, 90, 100);
        building16 = new Building(DARKGRAY, 190, 460, 70, 100);
        building17 = new Building(RED, 150, 440, 90, 100); 
        building18 = new Building(GREEN, 100, 420, 120, 100);
        building19 = new Building(RED, 80, 400, 130, 100);
        building20 =  new Building(TAN, 180, 390, 20, 80);
        building21 = new Building(Color.GRAY, 100, 40, 0, 70); 
        building22 = new Building(RED, 190, 100, 0, 90);
        building23 = new Building(GREEN, 200, 170, 20, 60);
        building24 = new Building(DARKGRAY, 200, 230, 30, 60);
        building25 = new Building(RED, 90, 290, 60, 70);
        building26 = new Building(Color.GRAY, 100, 680, 0, 150); 
        building27 = new Building(DARKGRAY, 100, 530, 0, 100);
        building28 = new Building(GREEN, 100, 470, 10, 100);
        building29 = new Building(Color.GRAY, 100, 190, 0, 90);
        building30 = new Building(GREEN, 100, 260, 0, 100);
        building31 = new Building(RED, 100, 390, 0, 60);
        building32 = new Building(Color.GRAY, 100, 440, 0, 100);
        tree1 = new Tree(10, 530, 5);
        tree2 = new Tree(20, 520, 5);
        tree3 = new Tree(30, 510, 5);
        tree4 = new Tree(5, 500, 5);
        tree5 = new Tree(60, 470, 4.5);
        tree6 = new Tree(70, 460, 4.5);
        tree7 = new Tree(80, 450, 4.5);
        tree8 = new Tree(90, 440, 4.5);
        tree9 = new Tree(100, 430, 4.5);
        tree10 = new Tree(120, 410, 4.3);
        tree11 = new Tree(130, 400, 4.3);
        tree12 = new Tree(140, 390, 4.3);
        tree13 = new Tree(150, 380, 4.3);
        tree14 = new Tree(180, 350, 4.1);
        tree15 = new Tree(190, 340, 4.1);
        tree16 = new Tree(200, 330, 4.1);
        tree17 = new Tree(175, 340, 4.1);
        tree18 = new Tree(210, 320, 3.7);
        tree19 = new Tree(220, 310, 3.7);
        tree20 = new Tree(230, 300, 3.7);
        tree21 = new Tree(240, 290, 3.3);
        tree22 = new Tree(250, 280, 3.3);
        tree23 = new Tree(260, 270, 3.3);
        tree24 = new Tree(273, 260, 2.9);
        tree25 = new Tree(280, 250, 2.9);
        tree26 = new Tree(290, 240, 2.9);
        tree27 = new Tree(300, 235, 2.5);
        tree28 = new Tree(310, 225, 2.5);
        tree29 = new Tree(320, 215, 2.5);
        tree30 = new Tree(325, 205, 2.5);
        tree31 = new Tree(335, 195, 2.1);
        tree32 = new Tree(345, 185, 2.1);
        tree33 = new Tree(355, 175, 2.1);
        tree34 = new Tree(365, 175, 2.1);
        tree35 = new Tree(375, 175, 2.1);
        tree36 = new Tree(770, 520, 5);
        tree37 = new Tree(760, 510, 5);
        tree38 = new Tree(750, 500, 5);
        tree39 = new Tree(730, 480, 4.5);
        tree40 = new Tree(720, 470, 4.5);
        tree41 = new Tree(710, 460, 4.5);
        tree42 = new Tree(700, 450, 4.5);
        tree43 = new Tree(690, 440, 4.5);
        tree44 = new Tree(680, 430, 4.5);
        tree45 = new Tree(660, 410, 4.3);
        tree46 = new Tree(650, 400, 4.3);
        tree47 = new Tree(640, 390, 4.3);
        tree48 = new Tree(630, 380, 4.3);
        tree49 = new Tree(620, 370, 4.3);
        tree50 = new Tree(600, 360, 4.1);
        tree51 = new Tree(590, 350, 4.1);
        tree52 = new Tree(580, 340, 4.1);
        tree53 = new Tree(570, 330, 4.1);
        tree54 = new Tree(560, 320, 4.1);
        tree55 = new Tree(540, 310, 3.7);
        tree56 = new Tree(530, 300, 3.7);
        tree57 = new Tree(520, 290, 3.7);
        tree58 = new Tree(510, 280, 3.7);
        tree59 = new Tree(500, 270, 3.3);
        tree60 = new Tree(490, 260, 3.3);
        tree61 = new Tree(480, 250, 3.3);
        tree62 = new Tree(470, 250, 2.9);
        tree63 = new Tree(460, 240, 2.9);
        tree64 = new Tree(460, 240, 2.5);
        tree65 = new Tree(450, 230, 2.5);
        tree66 = new Tree(440, 220, 2.5);
        tree67 = new Tree(430, 210, 2.5);
        tree68 = new Tree(420, 210, 2.1);
        tree69 = new Tree(410, 200, 2.1);
        tree70 = new Tree(400, 190, 2.1);
        endBuilding = new Building(Color.GRAY, 200, 350, 0, 50);
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     * 
     * @param g a reference to the Graphics object used for all drawing operations
     *
     */
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        // invoke the draw method on each object in your Cityscape
        ground.draw(g2);
        river.draw(g2);
        smallBoat.draw(g2);
        
        building32.draw(g2);
        building31.draw(g2);
        building30.draw(g2);
        building29.draw(g2);
        building28.draw(g2);
        building27.draw(g2);
        building26.draw(g2);
        building21.draw(g2);
        building25.draw(g2);
        building24.draw(g2);
        building23.draw(g2);
        building22.draw(g2);
        building20.draw(g2);
        building9.draw(g2);
        building8.draw(g2);
        building7.draw(g2);
        building6.draw(g2);
        building5.draw(g2);
        building4.draw(g2);
        building3.draw(g2);
        building2.draw(g2);
        building1.draw(g2);
        building19.draw(g2);
        building18.draw(g2);
        building17.draw(g2);
        building16.draw(g2);
        building15.draw(g2);
        building14.draw(g2);
        building13.draw(g2);
        building12.draw(g2);
        building11.draw(g2);
        building10.draw(g2);
        
        endBuilding.draw(g2);
        
        tree70.draw(g2);
        tree69.draw(g2);
        tree68.draw(g2);
        tree67.draw(g2);
        tree66.draw(g2);
        tree65.draw(g2);
        tree64.draw(g2);
        tree63.draw(g2);
        tree62.draw(g2);
        tree61.draw(g2);
        tree60.draw(g2);
        tree59.draw(g2);
        tree58.draw(g2);
        tree57.draw(g2);
        tree56.draw(g2);
        tree55.draw(g2);
        tree54.draw(g2);
        tree53.draw(g2);
        tree52.draw(g2);
        tree51.draw(g2);
        tree50.draw(g2);
        tree49.draw(g2);
        tree48.draw(g2);
        tree47.draw(g2);
        tree46.draw(g2);
        tree45.draw(g2);
        tree44.draw(g2);
        tree43.draw(g2);
        tree42.draw(g2);
        tree41.draw(g2);
        tree40.draw(g2);
        tree39.draw(g2);
        tree38.draw(g2);
        tree37.draw(g2);
        tree36.draw(g2);
        tree32.draw(g2);
        tree31.draw(g2);
        tree30.draw(g2);
        tree29.draw(g2);
        tree28.draw(g2);
        tree27.draw(g2);
        tree26.draw(g2);
        tree25.draw(g2);
        tree24.draw(g2);
        tree23.draw(g2);
        tree22.draw(g2);
        tree21.draw(g2);
        tree20.draw(g2);
        tree19.draw(g2);
        tree18.draw(g2);
        tree17.draw(g2);
        tree16.draw(g2);
        tree15.draw(g2);
        tree14.draw(g2);
        tree13.draw(g2);
        tree12.draw(g2);
        tree11.draw(g2);
        tree10.draw(g2);
        tree9.draw(g2);
        tree8.draw(g2);
        tree7.draw(g2);
        tree6.draw(g2);
        tree5.draw(g2);
        tree4.draw(g2);
        tree3.draw(g2);
        tree2.draw(g2);
        tree1.draw(g2);
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when
     *      they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        smallBoat.move();
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }

}
