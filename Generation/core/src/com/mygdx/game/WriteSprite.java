package com.mygdx.game;

public class WriteSprite {

	int size;
	int xPlacement;
	int yPlacement;
	
	public WriteSprite()
	{
		
	}
	
	public void write(String sentence)
	{
		write(sentence,this.xPlacement,this.yPlacement);
	}
	
	public void write(String sentence,int xPlacement, int yPlacement)
	{
		write(sentence,this.xPlacement,this.yPlacement,this.size);
	}
	
	public void write(String sentence,int xPlacement, int yPlacement, int size)
	{
		
	}
	
	public void render()
	{
		
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getxPlacement() {
		return xPlacement;
	}

	public void setxPlacement(int xPlacement) {
		this.xPlacement = xPlacement;
	}

	public int getyPlacement() {
		return yPlacement;
	}

	public void setyPlacement(int yPlacement) {
		this.yPlacement = yPlacement;
	}
	
}
