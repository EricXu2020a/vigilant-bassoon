package winterScene;


//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

//extend the AbstractShape class to make a FancySnowFlake class
public class FancySnowFlake extends AbstractShape {

	public FancySnowFlake(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
	}

	public FancySnowFlake(int x, int y, int wid, int ht, Color col) {
		super(x, y, wid, ht, col);
	}

	public FancySnowFlake(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
		super(x, y, wid, ht, col, xSpd, ySpd);
	}

	public void draw(Graphics window) {
		window.fillOval(super.getXPos(), super.getYPos(), super.getWidth(), super.getHeight());
		window.fillOval(super.getXPos()-super.getWidth(), super.getYPos()+super.getHeight(), super.getHeight(), super.getWidth());
		window.fillOval(super.getXPos()-super.getWidth(), super.getYPos(), super.getWidth(), super.getHeight());
		window.fillOval(super.getXPos(), super.getYPos()-super.getHeight(), super.getHeight(), super.getWidth());
	}

	
	public void moveAndDraw(Graphics window) {
		draw(window);
		setXPos(getXPos() + getXSpeed());
		setYPos(getYPos() + getYSpeed());
	}

}

