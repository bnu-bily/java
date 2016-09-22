package com.bily.second;

import java.util.Scanner;

/*
 * 2.21
 * **/
public class CalS {

	public static void main(String[] args) {
		System.out.println("input three point for a triangle");
		Scanner input = new Scanner(System.in);
		float x1,x2,x3,y1,y2,y3;
		x1=x2=x3=y1=y2=y3=0.0f;
		x1 = input.nextFloat();
		y1 = input.nextFloat();
		x2 = input.nextFloat();
		y2 = input.nextFloat();
		x3 = input.nextFloat();
		y3 = input.nextFloat();
		double s,side1,side2,side3,area;
		s=side1=side2=side3=area=0.0;
		side1 = Math.pow((Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)), 0.5);
		side2 = Math.pow((Math.pow(x3-x1, 2)+Math.pow(y3-y1, 2)), 0.5);
		side3 = Math.pow((Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2)), 0.5);
		s=(side1+side2+side3)/2;
		area = s*(s-side1)*(s-side2)*(s-side3);
		area=Math.pow(area, 0.5);
		System.out.println("areas is "+area);
	}

}
