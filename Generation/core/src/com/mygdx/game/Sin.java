package com.mygdx.game;

public class Sin {

	int percent;
	int circle;
	String name;
	String color;
	String description;
	public int getPercent() {
		return percent;
	}
	
	public void init()
	{
		this.setPercent(0);
	}
	
	public void setPercent(int percent) {
		this.percent = percent;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCircle() {
		return circle;
	}

	public void setCircle(int circle) {
		this.circle = circle;
	}
	
	
	
}
