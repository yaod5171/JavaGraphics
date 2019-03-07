package GraphicsUnit2;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color; 
import java.awt.Graphics;

public class Shape2
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
        
        private int xCenter = 400;
        private int yCenter = 300;

   /*
    *The constructor is used to initialize all instance variables.
    *The constructor makes the object.
    */
   public Shape2(int x, int y, int wid, int ht, Color col, Color bck, int xSpd, int ySpd)
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
   private void outlineRect(Graphics window, int xPos,int yPos,int width,int height, Color col) {
       
       window.setColor(col);
       window.fillRect(xPos,yPos,width,height);
       window.setColor(Color.black);
       window.drawRect(xPos, yPos, width, height);
       window.setColor(col);
   }
   public void draw(Graphics window)
   {
      //window.setColor(Color.GRAY);
      //window.fillRect(xPos, yPos, width, height);

      outlineRect(window,xPos,yPos,width,height,color);
      
      window.setColor(Color.BLACK);
      window.drawLine(xPos, yPos, xPos+(int)((xPos-xCenter)*0.05), yPos+(int)((yPos-yCenter)*0.05));
      window.drawLine(xPos+width, yPos, xPos+(int)((xPos-xCenter)*0.05)+width, yPos+(int)((yPos-yCenter)*0.05));
      window.drawLine(xPos, yPos+height, xPos+(int)((xPos-xCenter)*0.05), yPos+(int)((yPos-yCenter)*0.05)+height);
      window.drawLine(xPos+width, yPos+height, xPos+(int)((xPos-xCenter)*0.05)+width, yPos+(int)((yPos-yCenter)*0.05)+height);
      
      outlineRect(window,xPos+(int)((xPos-xCenter)*0.05),yPos+(int)((yPos-yCenter)*0.05),width,height,color);
      
      
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