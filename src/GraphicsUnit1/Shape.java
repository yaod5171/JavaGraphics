package GraphicsUnit1;

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

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
                yPos = y;
                width = wid;
                height = ht;
                color = col;
   }


   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillPolygon(new int[]{xPos, xPos+width, xPos+(width/2)}, 
              new int[]{yPos+(int)(height*0.2), yPos+(int)(height*0.2), yPos}, 3);
      window.fillRect(xPos+(int)(width*0.25), yPos+(int)(height*0.2), (int)(width*0.5), (int)(height*0.8));
      
      window.setColor(Color.GREEN);
      window.fillPolygon(new int[]{xPos+(int)(width*0.25), xPos+(int)(width*0.75), xPos+(width/2)}, 
              new int[]{yPos+(int)(height*0.15), yPos+(int)(height*0.15), yPos+(int)(height*0.05)}, 3);
      window.fillRect(xPos+(int)(width*0.375), yPos+(int)(height*0.15), (int)(width*0.25), (int)(height*0.5));

   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}