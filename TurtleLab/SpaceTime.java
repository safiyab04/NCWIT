
/**
 * Creates solar system with sun, stars, venus, mercury and earth
 * using two turtle objects
 * 
 * @safiyab04
 * @september 4th, 2019
 */
import java.awt.Color;
public class SpaceTime
{
    public static void main(String[] args)
    {
        World space = new World(1000, 1000);
        Turtle buzzaldrin = new Turtle(space);
        Turtle neilarmstrong = new Turtle (space);
        
        //setting background as black
        buzzaldrin.setPenWidth(1000);
        buzzaldrin.setPenColor(Color.BLACK);
        buzzaldrin.forward(1000);
        
        //making stars
        buzzaldrin.moveTo(100, 300);
        buzzaldrin.setPenColor(Color.WHITE);
        buzzaldrin.setPenWidth(1);
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        buzzaldrin.penUp();
        buzzaldrin.moveTo(400, 170);
        buzzaldrin.penDown();
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        buzzaldrin.penUp();
        buzzaldrin.moveTo(140, 500);
        buzzaldrin.penDown();
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        buzzaldrin.penUp();
        buzzaldrin.moveTo(125, 200);
        buzzaldrin.penDown();
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        buzzaldrin.penUp();
        buzzaldrin.moveTo(70, 450);
        buzzaldrin.penDown();
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        buzzaldrin.penUp();
        buzzaldrin.moveTo(215, 100);
        buzzaldrin.penDown();
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        buzzaldrin.penUp();
        buzzaldrin.moveTo(50, 50);
        buzzaldrin.penDown();
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        buzzaldrin.penUp();
        buzzaldrin.moveTo(230, 550);
        buzzaldrin.penDown();
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        buzzaldrin.penUp();
        buzzaldrin.moveTo(200, 330);
        buzzaldrin.penDown();
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        buzzaldrin.penUp();
        buzzaldrin.moveTo(300, 200);
        buzzaldrin.penDown();
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        buzzaldrin.penUp();
        buzzaldrin.moveTo(350, 60);
        buzzaldrin.penDown();
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        buzzaldrin.penUp();
        buzzaldrin.moveTo(570, 155);
        buzzaldrin.penDown();
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        buzzaldrin.penUp();
        buzzaldrin.moveTo(445, 63);
        buzzaldrin.penDown();
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        buzzaldrin.penUp();
        buzzaldrin.moveTo(680, 55);
        buzzaldrin.penDown();
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        buzzaldrin.penUp();
        buzzaldrin.moveTo(580, 25);
        buzzaldrin.penDown();
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        buzzaldrin.penUp();
        buzzaldrin.moveTo(544, 600);
        buzzaldrin.penDown();
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        buzzaldrin.penUp();
        buzzaldrin.moveTo(900, 300);
        buzzaldrin.penDown();
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        buzzaldrin.penUp();
        buzzaldrin.moveTo(850, 450);
        buzzaldrin.penDown();
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        buzzaldrin.penUp();
        buzzaldrin.moveTo(750, 300);
        buzzaldrin.penDown();
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        buzzaldrin.penUp();
        buzzaldrin.moveTo(600, 413);
        buzzaldrin.penDown();
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        buzzaldrin.penUp();
        buzzaldrin.moveTo(710, 523);
        buzzaldrin.penDown();
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        buzzaldrin.penUp();
        buzzaldrin.moveTo(750, 423);
        buzzaldrin.penDown();
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        buzzaldrin.penUp();
        buzzaldrin.moveTo(894, 617);
        buzzaldrin.penDown();
        for (int x = 1; x<= 24; x++)
        {   buzzaldrin.turn(15);
            buzzaldrin.forward(10);
            buzzaldrin.backward(10);
        }
        
        //make venus
        neilarmstrong.penUp();
        neilarmstrong.moveTo(770, 200);
        neilarmstrong.penDown();
        neilarmstrong.setPenWidth(10);
        neilarmstrong.setPenColor(Color.GRAY);
        for (int x = 1; x <= 360; x++)
        {
            neilarmstrong.forward(40);
            neilarmstrong.backward(40);
            neilarmstrong.turn(1);
        }
        
        //make mercury
        neilarmstrong.penUp();
        neilarmstrong.moveTo(600, 300);
        neilarmstrong.penDown();
        neilarmstrong.setPenWidth(10);
        neilarmstrong.setPenColor(Color.ORANGE);
        for (int x = 1; x <= 360; x++)
        {
            neilarmstrong.forward(60);
            neilarmstrong.backward(60);
            neilarmstrong.turn(1);
        }
                
        //make sun
        neilarmstrong.setPenColor(Color.YELLOW);
        neilarmstrong.setPenWidth(10);
        neilarmstrong.penUp();
        neilarmstrong.moveTo(900, 100);
        neilarmstrong.penDown();
        for (int x = 1; x <= 360; x++)
        {
            neilarmstrong.forward(70);
            neilarmstrong.setPenWidth(1);
            neilarmstrong.forward(15); //makes little rays
            neilarmstrong.backward(15);
            neilarmstrong.setPenWidth(10);
            neilarmstrong.backward(70);
            neilarmstrong.turn(1);
        }

        //making earth
        neilarmstrong.penUp();
        neilarmstrong.moveTo(350, 450);
        neilarmstrong.penDown();
        neilarmstrong.setPenWidth(10);
        neilarmstrong.setPenColor(Color.BLUE);
        for (int x = 1; x <= 360; x++)
        {
            neilarmstrong.forward(150);
            neilarmstrong.backward(150);
            neilarmstrong.turn(1);
        }
            
        //make landmasses
        neilarmstrong.penUp();
        neilarmstrong.moveTo(300, 450);
        neilarmstrong.penDown();
        neilarmstrong.setPenWidth(10);
        neilarmstrong.setPenColor(Color.GREEN);
        for (int x = 1; x <= 360; x++)
        {
            neilarmstrong.forward(40);
            neilarmstrong.backward(40);
            neilarmstrong.turn(1);
        }
        neilarmstrong.forward(30);
        for (int x = 1; x <= 360; x++)
        {
            neilarmstrong.forward(30);
            neilarmstrong.backward(30);
            neilarmstrong.turn(1);
        }
        neilarmstrong.forward(20);
        neilarmstrong.turnRight();
        neilarmstrong.forward(15);
        for (int x = 1; x <= 360; x++)
        {
            neilarmstrong.forward(30);
            neilarmstrong.backward(30);
            neilarmstrong.turn(1);
        }
        neilarmstrong.turn(180);
        neilarmstrong.forward(20);
        neilarmstrong.turnRight();
        neilarmstrong.forward(20);
        for (int x = 1; x <= 360; x++)
        {
            neilarmstrong.forward(45);
            neilarmstrong.backward(45);
            neilarmstrong.turn(1);
        }
        neilarmstrong.penUp();
        neilarmstrong.moveTo(410, 510);
        neilarmstrong.penDown();
        for (int x = 1; x <= 360; x++)
        {
            neilarmstrong.forward(20);
            neilarmstrong.backward(20);
            neilarmstrong.turn(1);
        }
        neilarmstrong.forward(30);
        neilarmstrong.turn(90);
        neilarmstrong.forward(15);
        for (int x = 1; x <= 360; x++)
        {
            neilarmstrong.forward(30);
            neilarmstrong.backward(30);
            neilarmstrong.turn(1);
        }
        neilarmstrong.turn(270);
        neilarmstrong.forward(34);
        for (int x = 1; x <= 360; x++)
        {
            neilarmstrong.forward(25);
            neilarmstrong.backward(25);
            neilarmstrong.turn(1);
        }
        neilarmstrong.moveTo(420, 510);
        for (int x = 1; x <= 360; x++)
        {
            neilarmstrong.forward(40);
            neilarmstrong.backward(40);
            neilarmstrong.turn(1);
        }
        neilarmstrong.penUp();
        neilarmstrong.moveTo(290, 560);
        neilarmstrong.penDown();
        for (int x = 1; x <= 360; x++)
        {
            neilarmstrong.forward(24);
            neilarmstrong.backward(24);
            neilarmstrong.turn(1);
        }
        neilarmstrong.penUp();
        neilarmstrong.moveTo(430, 400);
        neilarmstrong.penDown();
        for (int x = 1; x <= 360; x++)
        {
            neilarmstrong.forward(54);
            neilarmstrong.backward(54);
            neilarmstrong.turn(1);
        }
    }
}
