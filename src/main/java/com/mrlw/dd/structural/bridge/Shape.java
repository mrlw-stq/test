package com.mrlw.dd.structural.bridge;

public abstract class Shape {

	protected Color color;

	public Shape(Color color) {
		super();
		this.color = color;
	}
	
	public abstract void applyColor();

}
