package com.bily.eight;

import com.bily.three.GeometricObject;

public class Rectangle extends GeometricObject{
	private double width;
	private double height;
	
	public Rectangle(){
		this(1,1);
	}
	
	public Rectangle(double width,double height) throws RuntimeException{
		if (width > 0 && height > 0) {
			this.width = width;
			this.height = height;
		} else {
			throw new RuntimeException();
		}
	}
	
	public double getWidth(){
		return width;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getArea(){
		return width * height;
	}
	
	public double getPerimeter(){
		return 2 * (width + height);
	}
}
