package com.bily.thirteenth;
/**
 * 三角形中，任意一条边之和都大于第三条边，三角形类必须遵从这一条类，创建一个IllegalTriangleException类
 * 如果创建的三角形违反了这个规则，则抛出异常
 * @author Administrator
 *
 */
class IllegalTriangleException extends Exception{
	public IllegalTriangleException(){
		super("两边之和小于第三边");
	}
}

public class Triangle {
	private double side1;
	private double side2;
	private double side3;
	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
		if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1)) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		} else {
			throw new IllegalTriangleException();
		}
	}
	
	public double getSide1(){
		return side1;
	}
	
	public double getSide2(){
		return side2;
	}
	
	public double getSide3(){
		return side3;
	}
	
	public static void main(String[] args) {
		try {
			Triangle triangle1 = new Triangle(1, 1, 1);
			Triangle triangle2 = new Triangle(1, 2, 5);
		} catch (IllegalTriangleException e) {
			System.out.println(e.getMessage());
		}
	}

}
