package com.bily.eight;

import com.bily.three.GeometricObject;

/**
 * ��дһ�������������������м��ζ������֮��
 * @author bily
 *
 */
public class SumArea {

	public static void main(String[] args) {
		GeometricObject[] test = new GeometricObject[4];
		test[0] = new Circle(3, 3, 7);
		test[1] = new Rectangle(2, 3);
		test[2] = new Circle(3, 6, 8);
		test[3] = new Rectangle(15, 6);
		System.out.println("�����ж�������֮��Ϊ�� " + sumArea(test));
	}
	
	public static double sumArea(GeometricObject[] a){
		double sumarea = 0.0;
		for (int i = 0; i < a.length; i++) {
			sumarea += a[i].getArea();
		}
		return sumarea;
	}
}
