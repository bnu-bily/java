package com.bily.eight;

import com.bily.three.GeometricObject;

public class Circle extends GeometricObject{
	private double x;
	private double y;
	private double radius;
	
	public Circle(){
		this(0,0,1);
	}
	
	public Circle(double x,double y, double radius) throws RuntimeException{
		if (radius > 0) {
			this.x = x;
			this.y = y;
			this.radius = radius;
		} else {
			throw new RuntimeException();
		}
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public double getArea(){
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter(){
		return 2 * Math.PI * radius;
	}
}
