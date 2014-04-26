package com.mygdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;

public class BoardArmaggedon extends Board {

	WritePanel writePanel1;
	WritePanel writePanel2;

	
	int xPositionFire;
	int yPositionFire;
	int spacexFire;
	int spaceyFire;
	float sizeFire;
	int firemax;
	
	
	TextureAtlas armageddonAtlas;
	ArrayList <Sprite> aramageddonSprite = new ArrayList();
	
	public BoardArmaggedon ()
	{
		this.writePanel1 = new WritePanel(-0.5f,50,450,8);
		this.writePanel1.write("Day Before Armaggedon :");
		this.writePanel2 = new WritePanel(-0.5f,250,450,8);
		this.writePanel2.write("0");

		
		this.xPositionFire = 200;
		int yPositionFire = 200;
		int spacexFire;
		int spaceyFire;
		float sizeFire;
		int firemax;
		armageddonAtlas = new TextureAtlas(Gdx.files.internal("Atlas/Armageddon.atlas"));
		fireArmageddon(0,0);
		
		

	}
	
	public void fireArmageddon(int days,int total)
	{
		int i = 0;
		int l = 0;
		
		int y = 10;
		
		int u = 4;
		
		int j = 12;
		int k = 12;
	     for (int x=0; x<y; x++)
	     {



	         AtlasRegion regionFire = armageddonAtlas.findRegion("firesprite");
	         
	         Sprite spriteCh1;
	         spriteCh1 = new Sprite(regionFire);
	         spriteCh1.scale(sizeFire);
	         spriteCh1.setPosition(xPositionFire+i*j, yPositionFire+l*k);
	         this.aramageddonSprite.add(spriteCh1);
	         i +=1;
	    	 if (x % u == 0)
	    	 {
	    		i = 0; 
	    		l+= 1;
	    	 }
	         
	    	 }


	    
	         
	     }

	
	public void fireErase()
	{
		this.aramageddonSprite = null;
		this.aramageddonSprite = new ArrayList<Sprite>();
	}
	
	public void updateArmageddon(int days)
	{
		this.fireErase();
		this.writePanel2.erase();
		this.writePanel2.write(String.valueOf(days));

	}
	 public void render( SpriteBatch batch){
		 this.writePanel1.render(batch);
		 this.writePanel2.render(batch);

		 
			for (Sprite fire : this.aramageddonSprite)
			{
				fire.draw(batch);
			}
	 }
	
}