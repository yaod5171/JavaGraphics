package GraphicsUnit2;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color; 
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;
        private Color back;
	private int xSpeed;
	private int ySpeed;

   /*
    *The constructor is used to initialize all instance variables.
    *The constructor makes the object.
    */
   public Shape(int x, int y, int wid, int ht, Color col, Color bck, int xSpd, int ySpd)
   {
		xPos = x;
		yPos = y;
                width = wid;
                height = ht;
                color = col; 
                back = bck;
                xSpeed = xSpd;
                ySpeed = ySpd;
   }

      /*
    *The draw method draws the shape on the screen.
    */
   public void draw(Graphics window)
   {
      
      window.setColor(color);
      
      window.fillArc(xPos-width/6, yPos, width/2, height*2/3, -90, 180);
      window.setColor(back);
      window.fillArc(xPos-width/12, yPos+height/12, width/3, height*1/2, -90, 180);
      window.setColor(color);
      window.fillRect(xPos+width/12, yPos+height/10, width/12, height/2);
      
      window.fillOval(xPos, yPos + height*2/3, width, height/3);
      
      

   }

   /*
    *This draw method will be used to erase the shape.
    */
   public void draw(Graphics window, Color col)
   {
      window.setColor(col);
      window.fillRect(xPos, yPos, width, height);
   }

   public void moveAndDraw(Graphics window)
   {
    	//not needed yet
   }

   //add in set and get methods for xPos, yPos, xSpeed, and ySpeed
   public int getX()
   {
   	return 0;
   }

   public void setX( int x )
   {
   	//add code here
   }

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color+" "+xSpeed+" "+ySpeed;
   }
}