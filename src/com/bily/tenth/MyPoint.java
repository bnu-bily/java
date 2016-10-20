package com.bily.tenth;
/**
 *���һ��Mypoint�࣬��ʾ��x��y����ĵ㣬���������
 *������get������������x��y,�ֱ��ʾ���ǵ����ꡣ
 *һ�������㣨0,0�����޲ι��췽��
 *һ�������ض������Ĺ��췽��
 *����������x,y���Ե�get����
 *һ����Ϊdistance�ķ���������Mypoint���͵�������֮��ľ���
 *һ����Ϊdistance�ķ������򷵻�ָ��x��y�����������֮��ľ���
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
	 * x1 y1 ��һ�������� x2 y2�ڶ���������
	 * @return�������
	 */
	public static double distance(double x1,double y1,double x2,double y2){
		return Math.sqrt((Math.pow(x2 - x1, 2)+Math.pow(y2 - y1, 2)));
	}
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10, 30.5);
		System.out.println("��0��0��10,30.5֮�����Ϊ�� "+MyPoint.distance(p1, p2));
		
		

	}

}
