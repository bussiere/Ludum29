package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BoardMana extends Board {
	

	WritePanel writePanel1;
	WritePanel writePanel2;
	
	public BoardMana ()
	{
		this.writePanel1 = new WritePanel(-0.5f,280,265,8);
		this.writePanel1.write("Mana :");
		this.writePanel2 = new WritePanel(-0.5f,330,265,8);
		this.writePanel2.write("0");
	}
	public void updateSoul(int nbSouls)
	{
		this.writePanel2.erase();
		this.writePanel2.write(String.valueOf(nbSouls));
	}
	 public void render( SpriteBatch batch){
		 this.writePanel1.render(batch);
		 this.writePanel2.render(batch);
	 }
	 
}
