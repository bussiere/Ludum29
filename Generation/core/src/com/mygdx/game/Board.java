package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Board {
	
	int xPosition;
	int yPosition;
	WritePanel writePanel;
	
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
		 writePanel = new WritePanel();
	 }
	 
	 public void render( SpriteBatch batch){
		 writePanel.render(batch);
	 }

}
