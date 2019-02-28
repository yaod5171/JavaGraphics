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

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.BLUE);

      window.fillRect( 200, 200, 400, 400 );
      
      
      window.setColor(Color.LIGHT_GRAY);
      window.fillOval(525, 45, 50, 50);
      window.fillOval(520, 0, 65, 65);
      window.fillOval(515, -45, 80, 80);
      
      window.setColor(Color.BLUE);
      
      window.fillRect(525, 75, 50, 100);
      
      
      window.setColor(Color.RED);
      
      window.fillPolygon(new int[]{100, 700, 400}, new int[]{200, 200, 50}, 3);
      
      window.fillRect(250, 400, 100, 200);
      
      window.setColor(Color.ORANGE);
      window.fillRect(450, 350, 100, 100);
      window.fillArc(250, 325, 100, 100, 0, 180);
      window.fillRect(250, 375, 100, 5);
      
      window.setColor(Color.BLACK);
      window.fillRect(460, 360, 35, 35);
      window.fillRect(505, 360, 35, 35);
      window.fillRect(460, 405, 35, 35);
      window.fillRect(505, 405, 35, 35);
      window.fillArc(255, 330, 90, 90, 0, 180);
      
      window.setColor(Color.ORANGE);
      window.drawLine(300, 375, 300, 325);
      window.drawLine(300, 375, 335, 340);
      window.drawLine(300, 375, 265, 340);

   }
}