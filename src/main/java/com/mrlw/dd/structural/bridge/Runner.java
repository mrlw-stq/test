package com.mrlw.dd.structural.bridge;

public class Runner {

	public static void main(String[] args) {
		Shape shpae = new Circle(new Red());
		shpae.applyColor();
	}
}
