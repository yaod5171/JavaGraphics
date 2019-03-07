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
      //window.setColor(Color.GRAY);
      //window.fillRect(xPos, yPos, width, height);
      
      window.setColor(color);
      window.fillArc(xPos-width/6, yPos, width/2, height*2/3, -90, 180);
      window.setColor(back);
      window.fillArc(xPos-width/12, yPos+height/12, width/3, height*1/2, -90, 180);
      window.setColor(color);
      window.fillRect(xPos+width/12, yPos+height/6, width/12, height/2);
      
      window.setColor(color);
      window.fillPolygon(new int[]{xPos+width/12+1, xPos+width/3, xPos+width/2, xPos+width/2, xPos+width/3},
                         new int[]{yPos, yPos, yPos+height/2, yPos+height*2/3, yPos+height/6}, 5);
      window.fillPolygon(new int[]{xPos+width*3/4, xPos+width*2/3, xPos+width/2, xPos+width/2, xPos+width*3/4},
                         new int[]{yPos, yPos, yPos+height/2, yPos+height*2/3, yPos+height/12}, 5);
      
      window.setColor(color);
      window.fillArc(xPos+width/2, yPos, width/2, height*2/3, -90, 180);
      window.setColor(back);
      window.fillArc(xPos+width*7/12, yPos+height/12, width/3, height*1/2, -90, 180);
      window.setColor(color);
      window.fillRect(xPos+width*3/4, yPos+height/6, width/12, height/2);
      
      window.setColor(color);
      window.fillOval(xPos, yPos + height*2/3, width, height/3);
      window.setColor(back);
      window.fillOval(xPos + width*2/5, yPos + height*4/5, width/5, height/15);

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
    	xPos+=getXSpeed();
        yPos+=getYSpeed();
        draw(window);
   }

   //add in set and get methods for xPos, yPos, xSpeed, and ySpeed
   public int getX()
   {
   	return xPos;
   }
   public int getY()
   {
   	return yPos;
   }
   public int getXSpeed()
   {
   	return xSpeed;
   }
   public int getYSpeed()
   {
   	return ySpeed;
   }

   public void setX( int x )
   {
   	xPos = x;
   }
   public void setY( int y )
   {
   	yPos = y;
   }
   public void setXSpeed( int x )
   {
   	xSpeed = x;
   }
   public void setYSpeed( int y )
   {
   	ySpeed = y;
   }

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color+" "+xSpeed+" "+ySpeed;
   }
}