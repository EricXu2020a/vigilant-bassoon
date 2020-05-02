package Pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable{
	private int xSpeed;
	private int ySpeed;

	public Ball() {
		super(200, 200);
		xSpeed = 1;
		ySpeed = 1;
	}

	public Ball(int x, int y) {
		super(x, y);
		xSpeed = 1;
		ySpeed = 1;
	}

	public Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
		xSpeed = 1;
		ySpeed = 1;
	}

	public Ball(int x, int y, int width, int height, Color color) {
		super(x, y, width, height, color);
		xSpeed = 1;
		ySpeed = 1;
	}

	public Ball(int x, int y, int width, int height, Color color, int xS, int yS) {
		super(x, y, width, height, color);
		xSpeed = xS;
		ySpeed = yS;
	}

	
	public void setXSpeed(int xS) {
		xSpeed = xS;
	}
	public int getXSpeed() {
		return xSpeed;
	}

	public void setYSpeed(int yS) {
		ySpeed = yS;
	}
	public int getYSpeed() {
		return ySpeed;
	}
	
	
	public void moveAndDraw(Graphics window) {
		draw(window, Color.WHITE);
		
		setX(getX() + xSpeed);
		setY(getY() + ySpeed);

		draw(window, super.getColor());
	}

	public boolean equals(Object obj) {
		Ball test = (Ball) obj;
		if (xSpeed == test.getXSpeed() && ySpeed == test.getYSpeed()) {
			return true;
		}

		return false;
	}


	public String toString() {
		return super.toString() + " * " + xSpeed + " * " + ySpeed;
	}

	
	public boolean didCollideLeft(Object obj) {
		Block b = (Block) obj;
		if (getX() <= b.getX() + b.getWidth())
			return true;
		return false;
	}


	public boolean didCollideRight(Object obj) {
		Block b = (Block) obj;
		if (getX() + getWidth() >= b.getX())
			return true;
		return false;
	}

	public boolean didCollideTop(Object obj) {
		Block b = (Block) obj;
		if (getY() <= b.getY())
			return true;
		return false;
	}

	public boolean didCollideBottom(Object obj) {
		Block b = (Block) obj;
		if (getY() >= b.getY() + b.getHeight())
			return true;
		return false;
	}
	
	public void test(Graphics window) {
		draw(window, Color.WHITE);
	}
	
}