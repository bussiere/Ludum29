package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Board {
	
	int xPosition;
	int yPosition;
	WriteSprite writeSprite;
	
	public int getxPosition() {
		return xPosition;
	}
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	public int getyPosition() {
		return yPosition;
	}
	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	
	 public Board()
	 {
		 
	 }
	 
	 public void render( SpriteBatch batch){
		 writeSprite.render();
	 }

}
