package com.bily.tenth;
/**
 * 10.12��
 * x y ��ʾ�������� ��get set����
 * width height ��get set����
 * �޲εĹ��캯������ xy 00 width height 1 1�ľ���
 * һ�����췽������ָ���� x y width height
 * getAreac ���ؾ������
 * getPerimeter �����ܳ�
 * ���� x y�ھ����ڣ���ô contains����true
 * ���������ڵ�ǰ������ contains����true
 * ����ƽ��x�� y��
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
		return (Math.abs(x - this.x) < (this.width / 2) && Math.abs(y - this.y) < (this.height / 2));
			
	}
	public boolean contains(MyRectangle2D rect){
		return (Math.abs(rect.getX() - this.x) < (this.width / 4) && Math.abs(rect.getY() - this.y) < (this.height / 4));
			
	}
	public static void main(String[] args) {
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
		System.out.println(r1.getAreac());
		System.out.println(r1.getPerimeter());
		System.out.println(r1.contains(3,3));
		System.out.println(r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
	}

}
