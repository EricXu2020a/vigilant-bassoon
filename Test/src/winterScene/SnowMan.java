package winterScene;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class SnowMan extends AbstractShape
{
   public SnowMan(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.WHITE, 0, 0);
   }

   public void draw(Graphics window)
   {
	   int x = getXPos();
		int y = getYPos();
		int w = getWidth();
		int h = getHeight();
		
		// color the Snowman, and draw its 3 sections
		window.setColor(getColor());
		window.fillOval(x + (w / 6), y + (h / 2), 2*w/3, 2*h/3 );
		window.fillOval(x + (w / 4), y + (h / 4), w / 2, h / 2);
		window.fillOval(x + (w / 3), y, w / 3, h / 3);	      	
   }

   public void moveAndDraw(Graphics window)
   {
      draw(window);   
   }
}