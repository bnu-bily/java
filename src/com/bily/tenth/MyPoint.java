package com.bily.tenth;
/**
 *设计一个Mypoint类，表示带x，y坐标的点，该类包括：
 *两个带get方法的数据域x，y,分别表示他们的坐标。
 *一个创建点（0,0）的无参构造方法
 *一个创建特定坐标点的构造方法
 *两个数据域x,y各自的get方法
 *一个名为distance的方法，返回Mypoint类型的两个点之间的距离
 *一个名为distance的方法，返回指定x和y坐标的两个点之间的距离
 * @author Administrator
 *
 */
public class MyPoint {
	private double x;
	private double y;
	public MyPoint(){
		this(0,0);
	}
	public MyPoint(double x,double y){
		this.x = x;
		this.y = y;
	}
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	public static double distance(MyPoint a,MyPoint b){
		return Math.sqrt((Math.pow(a.getX() - b.getX(), 2)+Math.pow(a.getY() - b.getY(), 2)));
	}
	/**
	 * x1 y1 第一个点坐标 x2 y2第二个点坐标
	 * @return两点距离
	 */
	public static double distance(double x1,double y1,double x2,double y2){
		return Math.sqrt((Math.pow(x2 - x1, 2)+Math.pow(y2 - y1, 2)));
	}
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10, 30.5);
		System.out.println("点0，0与10,30.5之间距离为： "+MyPoint.distance(p1, p2));
		
		

	}

}
