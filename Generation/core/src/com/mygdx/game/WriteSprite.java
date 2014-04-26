package com.mygdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;


public class WriteSprite {

	float size;
	int xPlacement;
	int yPlacement;
	int spaceBLetters;
	
	private TextureAtlas alphabetAtlas;

	ArrayList <Sprite> sentenceSprite = new ArrayList();
	
	
	public WriteSprite()
	{
		alphabetAtlas = new TextureAtlas(Gdx.files.internal("Atlas/Alphabet1.atlas"));
		this.size = 2f;
		this.xPlacement = 200;
		this.yPlacement = 200;
		this.spaceBLetters = 10;
	}
	
	public WriteSprite(float size,int xPlacement, int yPlacement, int spaceBLetters)
	{
		alphabetAtlas = new TextureAtlas(Gdx.files.internal("Atlas/Alphabet1.atlas"));
		this.size = size;
		this.xPlacement = xPlacement;
		this.yPlacement = yPlacement;
		this.spaceBLetters = spaceBLetters;
	}
	
	public void render(SpriteBatch batch)
	{
		System.out.println("rr");
		System.out.println(this.sentenceSprite.size());
		for (Sprite letter : this.sentenceSprite)
		{
			System.out.println("rry");
			System.out.println(letter.getHeight());
			letter.draw(batch);
		}
	}
	
	public void write(String sentence)
	{
		write(sentence,this.xPlacement,this.yPlacement);
	}
	
	public void write(String sentence,int xPlacement, int yPlacement)
	{
		write(sentence,this.xPlacement,this.yPlacement,this.size);
	}
	
	public void write(String sentence,int xPlacement, int yPlacement, float size)
	{
		
		 System.out.println(sentence);
		String[] result = sentence.split("");
		 System.out.println(result);
		int i = 0;
		     for (int x=0; x<result.length; x++)
		     {

		    	 if (!result[x].equals(" ") && !result[x].equals("")) 
		    	 {
		         System.out.println(result[x]);
		         AtlasRegion regionAlphabet1 = alphabetAtlas.findRegion(result[x]);
		         
		         Sprite spriteCh1;
		         spriteCh1 = new Sprite(regionAlphabet1);
		         spriteCh1.scale(size);
		         spriteCh1.setPosition(xPlacement+i*spaceBLetters, yPlacement);
		         this.sentenceSprite.add(spriteCh1);
		    	 }
		    	 i +=1;
		    
		         
		     }
	}


	public float getSize() {
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

	public void erase() {
		this.sentenceSprite = null;
		this.sentenceSprite = new ArrayList();
		
	}
	
}
