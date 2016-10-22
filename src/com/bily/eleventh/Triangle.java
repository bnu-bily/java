package com.bily.eleventh;

/**
 * 11.1 ���һ��Triangle������չGeometricObject �������
 * ������Ϊside1 side2 side3 ��double�������ʾ��������ε������ߣ�Ĭ��ֵ��1.0
 * һ���޲εĹ��췽������Ĭ�ϵ�������
 * һ���ܴ�����ָ���ߵĹ��췽��
 * ���������������get����
 * һ��getArea����
 * һ��getPerimeter���������ܳ�
 * һ��toString����������������ε��ַ�������
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
			throw new RuntimeException("�߳�������0");
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
		
		System.out.println("t1������� " + t1.getArea());
		System.out.println("t1���ܳ��� " + t1.getPerimeter());
		System.out.println("t1����ɫ�� " + t1.getColor());
		System.out.println("t1�Ƿ���䣺 " + t1.isFilled());
		
		
	}

}
