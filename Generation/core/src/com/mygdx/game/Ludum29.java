package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;
public class Ludum29 extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	float delay; // seconds
	
	
 Circle limbo;
 Circle lust;
 Circle gluttony;
 Circle greed;
 Circle wrath;
 Circle heresy;
 Circle violence;
 Circle fraud;
 Circle treachery;
 
	@Override
	public void create () {
		delay = 2; // seconds
		
		batch = new SpriteBatch();
		img = new Texture("Background/Background.png");
		
		limbo = new Circle();
		limbo.init();
		limbo.setCircle(1);
		limbo.setBoost(6);
		limbo.setWeak(2);
		
		lust = new Circle();
		lust.init();
		lust.setCircle(2);
		lust.setBoost(6);
		lust.setWeak(2);
		
		
		gluttony = new Circle();
		gluttony.init();
		gluttony.setCircle(3);
		gluttony.setBoost(6);
		gluttony.setWeak(2);
		
		greed = new Circle();
		greed.init();
		greed.setCircle(4);
		greed.setBoost(6);
		greed.setWeak(2);
		
		wrath = new Circle();
		wrath.init();
		wrath.setCircle(5);
		wrath.setBoost(6);
		wrath.setWeak(2);
		
		heresy = new Circle();
		heresy.init();
		heresy.setCircle(6);
		heresy.setBoost(6);
		heresy.setWeak(2);
		
		violence = new Circle();
		violence.init();
		violence.setCircle(7);
		violence.setBoost(6);
		violence.setWeak(2);
		
		fraud = new Circle();
		fraud.init();
		fraud.setCircle(8);
		fraud.setBoost(6);
		fraud.setWeak(2);
		
		treachery = new Circle();
		treachery.init();
		treachery.setCircle(9);
		limbo.setBoost(6);
		limbo.setWeak(2);
		
	}

	public void Turn()
	{
		
	}
	
	public void update()
	{
		

		Timer.schedule(new Task(){
		    @Override
		    public void run() {
		        Turn();
		    }
		}, delay);
	}
	
	@Override
	public void render () {
		update();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
}
