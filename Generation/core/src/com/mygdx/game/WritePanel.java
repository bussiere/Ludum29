package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class WritePanel {
	
	WriteSprite writeSprite;
	int size;
	int xPlacement;
	int yPlacement;
	
	public WritePanel()
	{
		writeSprite = new WriteSprite();
	}
	
	public void write(String sentence)
	{
		writeSprite.write(sentence, xPlacement, yPlacement, size);
	}
	
	public void render(SpriteBatch batch)
	{
		writeSprite.render(batch);
	}
		
	

}
