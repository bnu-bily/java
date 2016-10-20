package com.bily.tenth;



/**
 * 两个带有get方法的名为x和y的double数据域，表明圆中心
 * 一个无参的构造方法，该方法创建了一个（x，y）值为（0,0）且radius 为1的默认值
 * 一个构造方法，创建带指定的x,y和radius的圆
 * 一个返回圆面积的方法 getArea()
 * 一个返回圆周长的方法getPerimeter()
 * 如果给定点（x，y）在圆内，那么方法contains（double x,double y）返回true
 * 如果给定圆在这个圆内，那么contains(Circle2D circle)返回true
 * 如果给定圆和这个圆重叠，那么方法overlaps(Circle2D circle)则返回true
 * @author Administrator
 *
 */
public class Circle2D {
	private double x;
	private double y;
	private double radius;
	public Circle2D() {
		this(0, 0, 1);
	}
	public Circle2D(double x, double y, double radius){
		if (radius > 0) {
			this.x = x;
			this.y = y;
			this.radius = radius;
		} 
	}
	public  double getX(){
		return this.x;
	}
	public  double getY(){
		return this.y;
	}
	public double getRadius(){
		return this.radius;
	}
	public  double getArea(){
		return Math.PI * radius * radius;
	}
	public double getPerimeter(){
		return 2 * Math.PI * radius;
	}
	public boolean contains(double x,double y){
		if (Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2)) < radius) {
			return true;
		} else {
			return false; 			
		}
	}
	public boolean contains(Circle2D circle){
		if (Math.sqrt(Math.pow((this.x - circle.getX()), 2) + Math.pow((this.y - circle.getY()), 2)) < this.radius - circle.getRadius()) {
			return true;
		} else {
			return false; 			
		} 
	}
	public boolean overlaps(Circle2D circle){
		if (Math.sqrt(Math.pow((this.x - circle.getX()), 2) + Math.pow((this.y - circle.getY()), 2)) == this.radius - circle.getRadius()) {
			return true;
		} else {
			return false; 			
		} 
	}
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2,2,5.5);
		System.out.println("周长："+c1.getArea()+"周长："+c1.getPerimeter());
		System.out.println(c1.contains(3,3));
		System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
	}

}
