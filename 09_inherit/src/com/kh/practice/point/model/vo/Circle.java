package com.kh.practice.point.model.vo;

public class Circle extends Point{
	private int radius;
	private int x;
	private int y;
	
	public Circle() {

	}
	
	public Circle(int x, int y, int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}

	
	


	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", toString()=" + super.toString() + ", getX()=" + getX() + ", getY()="
				+ getY() + "]";
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}
