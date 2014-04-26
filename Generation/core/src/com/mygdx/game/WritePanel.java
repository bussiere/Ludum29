package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class WritePanel {
	
	WriteSprite writeSprite;
	float size;
	int xPlacement;
	int yPlacement;
	int spaceBLetters;
	
	public WritePanel()
	{
		this.writeSprite = new WriteSprite();
	}
	
	public void erase()
	{
		this.writeSprite.erase();
	}
	
	public WritePanel(float size, int xPlacement, int yPlacement,int spaceBLetters)
	{
		this.size = size;
		this.xPlacement = xPlacement;
		this.yPlacement = yPlacement;
		this.spaceBLetters = spaceBLetters;
		this.writeSprite = new WriteSprite(size,xPlacement,yPlacement,spaceBLetters);
	}
	
	public void write(String sentence)
	{
		this.writeSprite.write(sentence, this.xPlacement, this.yPlacement, this.size);
	}
	
	public void render(SpriteBatch batch)
	{
		this.writeSprite.render(batch);
	}
		
	

}
