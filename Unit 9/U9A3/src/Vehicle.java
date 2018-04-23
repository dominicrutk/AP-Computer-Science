// Dominic Rutkowski
//
/*
*/

import java.awt.Graphics;

public abstract class Vehicle
{
	private int initX;
	private int initY;

	public Vehicle(int initX, int initY)
	{
		this.initX = initX;
		this.initY = initY;
	}

	public int getInitX()
	{
		return initX;
	}

	public int getInitY()
	{
		return initY;
	}

	public abstract void draw(Graphics g);
}