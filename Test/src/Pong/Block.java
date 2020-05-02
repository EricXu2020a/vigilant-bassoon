package Pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block() {
		width = 10;
		height = 10;
		xPos = 100;
		yPos = 150;
		color = Color.black;
	}

	public Block(int w, int h) {
		width = w;
		height = h;
		xPos = 0;
		yPos = 0;
		color = Color.black;
	}

	public Block(int x, int y, int w, int h, Color c) {
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = c;
	}

	public Block(int x, int y, int w, int h) {
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = Color.black;
	}

	
	public void setPos(int x, int y) {
		xPos = x;
		yPos = y;
	}

	
	public void setX(int x) {
		xPos = x;
	}
	public int getX() {
		return xPos;
	}
	
	
	public void setY(int y) {
		yPos = y;
	}
	public int getY() {
		return yPos;
	}

	
	public void setColor(Color c) {
		color = c;
	}
	public Color getColor() {
		return color;
	}
	
	
	public void draw(Graphics window) {
		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public void draw(Graphics window, Color col) {
		window.setColor(col);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public boolean equals(Object obj) {
		Block hey = (Block) obj;
		if (xPos == hey.getX() && yPos == hey.getY() && width == hey.getWidth() && height == hey.getHeight()
				&& color.equals(hey.getColor()))
			return true;
		return false;
	}

	
	public String toString() {
		return xPos + " * " + yPos + " * " + width + " * " + height + " * " + color;
	}
}