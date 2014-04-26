package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BoardDisplay extends Board {

	WritePanel writePanel1;
	
	public BoardDisplay ()
	{
		writePanel1 = new WritePanel();
		writePanel1.write("test");
	}
	
	 public void render( SpriteBatch batch){
		 writePanel.render(batch);
	 }
	
}
