package com.bily.eleventh;

/**
 * 11.1 设计一个Triangle类来扩展GeometricObject 该类包括
 * 三个名为side1 side2 side3 的double数据域表示这个三角形的三条边，默认值是1.0
 * 一个无参的构造方法创建默认的三角形
 * 一个能创建带指定边的构造方法
 * 所有三个数据域的get方法
 * 一个getArea方法
 * 一个getPerimeter方法返回周长
 * 一个toString方法返回这个三角形的字符串描述
 * 
 * @author Administrator
 *
 */
public class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		this(1.0,1.0,1.0);
	}
	
	public Triangle(double side1, double side2, double side3){
		if (side1 > 0 && side2 > 0 && side3 > 0) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;			
		} else {
			throw new RuntimeException("边长不大于0");
		}
	}
	
	public double getSide1(){
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getArea(){
		double s = side1 + side2 + side3;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	public double getPerimeter(){
		return side1 + side2 + side3;
	}
	
	public String toString(){
		return "side1 = " + side1 + "side2 = " + side2 + "side3 = " + side3;
	}
	
	public static void main(String[] args) {
		Triangle t1 = new Triangle(1, 1.5, 2);
		t1.setColor("yellow");
		t1.setFilled(true);
		
		System.out.println("t1的面积： " + t1.getArea());
		System.out.println("t1的周长： " + t1.getPerimeter());
		System.out.println("t1的颜色： " + t1.getColor());
		System.out.println("t1是否填充： " + t1.isFilled());
		
		
	}

}
