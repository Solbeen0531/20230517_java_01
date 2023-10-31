package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public RectangleController() {
		
	}
	
	public String calcArea(int x, int y, int height, int width) {
		String result = null;
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return result;
		
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		String result=null;
		//TODO
		
		return result;
	}
	
	
	
}
