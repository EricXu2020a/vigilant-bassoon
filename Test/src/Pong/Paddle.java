package Pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block {

	
	private int speed;

	public Paddle() {
		super(10, 10);
		speed = 5;
	}
	
	public Paddle(int x, int y) {
		super(x, y);
		speed = 5;
	}

	public Paddle(int x, int y, int spd) {
		super(x, y);
		speed = spd;
	}

	public Paddle(int x, int y, int width, int height, int spd) {
		super(x, y, width, height);
		speed = spd;
	}

	public Paddle(int x, int y, int width, int height, Color color, int spd) {
		super(x, y, width, height, color);
		speed = spd;
	}

	public void moveUpAndDraw(Graphics window) {
		draw(window, Color.white);
		setY(getY() - speed);
		draw(window, super.getColor());
	}

	public void moveDownAndDraw(Graphics window) {
		draw(window, Color.white);
		setY(getY() + speed);
		draw(window, super.getColor());
	}

	public int getSpeed() {
		return speed;
	}
	
	public String toString() {
		return super.toString() + " " + speed;
	}
}