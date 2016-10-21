package com.bily.tenth;



/**
 * ��������get��������Ϊx��y��double�����򣬱���Բ����
 * һ���޲εĹ��췽�����÷���������һ����x��y��ֵΪ��0,0����radius Ϊ1��Ĭ��ֵ
 * һ�����췽����������ָ����x,y��radius��Բ
 * һ������Բ����ķ��� getArea()
 * һ������Բ�ܳ��ķ���getPerimeter()
 * ��������㣨x��y����Բ�ڣ���ô����contains��double x,double y������true
 * �������Բ�����Բ�ڣ���ôcontains(Circle2D circle)����true
 * �������Բ�����Բ�ص�����ô����overlaps(Circle2D circle)�򷵻�true
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
		return (Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2)) < radius);
			
	}
	public boolean contains(Circle2D circle){
		return (Math.sqrt(Math.pow((this.x - circle.getX()), 2) + Math.pow((this.y - circle.getY()), 2)) < this.radius - circle.getRadius());
		
	}
	public boolean overlaps(Circle2D circle){
		return (Math.sqrt(Math.pow((this.x - circle.getX()), 2) + Math.pow((this.y - circle.getY()), 2)) == this.radius - circle.getRadius()) ;
			
		
	}
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2,2,5.5);
		System.out.println("�ܳ���"+c1.getArea()+"�ܳ���"+c1.getPerimeter());
		System.out.println(c1.contains(3,3));
		System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
	}

}
