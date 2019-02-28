package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      head(window);
      upperBody(window);
      lowerBody(window);
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.LIGHT_GRAY);

      window.fillRect(325, 100, 150, 100);
      window.fillRect(315, 120, 170, 30);
      
      window.setColor(Color.DARK_GRAY);
      window.fillOval(365, 125, 20, 20);
      window.fillOval(415, 125, 20, 20);
      window.fillRect(365, 165, 70, 15);
      
      
				
   }

   public void upperBody( Graphics window )
   {
       window.setColor(Color.LIGHT_GRAY);
       window.fillRect(350, 225, 100, 150);
       window.fillRect(300, 250, 25, 100);
       window.fillRect(475, 250, 25, 100);
       
       window.setColor(Color.DARK_GRAY);
       window.fillRect(295, 350, 35, 35);
       window.fillRect(470, 350, 35, 35);
       
       window.setColor(Color.WHITE);
       window.fillRect(305, 360, 15, 25);
       window.fillRect(480, 360, 15, 25);

   }

   public void lowerBody( Graphics window )
   {
       window.setColor(Color.LIGHT_GRAY);
       window.fillRect(355, 375, 40, 125);
       window.fillRect(405, 375, 40, 125);
       
       window.setColor(Color.DARK_GRAY);
       window.fillRect(340, 500, 55, 10);
       window.fillRect(405, 500, 55, 10);

   }
}