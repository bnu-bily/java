package com.bily.tenth;
/**
 * 10.12题
 * x y 表示矩形中心 有get set方法
 * width height 有get set方法
 * 无参的构造函数创建 xy 00 width height 1 1的矩形
 * 一个构造方法，带指定的 x y width height
 * getAreac 返回矩形面积
 * getPerimeter 返回周长
 * 给定 x y在矩形内，那么 contains返回true
 * 给定矩形在当前矩形内 contains返回true
 * 矩形平行x轴 y轴
 * @author Administrator
 *
 */
public class MyRectangle2D {
	private double x;
	private double y;
	private double width;
	private double height;
	public MyRectangle2D(){
		this(0, 0, 1, 1);
	}
	public MyRectangle2D(double x,double y, double w, double h){
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getAreac(){
		return this.width * this.height;
	}
	public double getPerimeter(){
		return (this.width + this.height) * 2;
	}
	public boolean contains(double x,double y){
		if (Math.abs(x - this.x) < (this.width / 2) && Math.abs(y - this.y) < (this.height / 2)) {
			return true;
		} else {
			return false;
		}
	}
	public boolean contains(MyRectangle2D rect){
		if (Math.abs(rect.getX() - this.x) < (this.width / 4) && Math.abs(rect.getY() - this.y) < (this.height / 4)) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
		System.out.println(r1.getAreac());
		System.out.println(r1.getPerimeter());
		System.out.println(r1.contains(3,3));
		System.out.println(r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
	}

}
