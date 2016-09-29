package com.bily.third;

import java.awt.image.RasterOp;
import java.util.Scanner;

/**
 * 3.29
 * 计算2个圆的位置 如果 圆心距离 《= abs(r1-r2) 就认为圆2在圆1内 如果圆心距离 《= r1+r2，就认为相交
 * @author Administrator
 *
 */
public class CalCircle {

	public static void main(String[] args) {
		System.out.println("input the circle1 x1,y1,radius");
		Scanner inpScanner = new Scanner(System.in);
		double x1,x2,y1,y2,radius1,radius2;
		x1 = inpScanner.nextDouble();
		y1 = inpScanner.nextDouble();
		radius1 = inpScanner.nextDouble();
		System.out.println("input the circle2 x2,y2,radius");
		x2 = inpScanner.nextDouble();
		y2 = inpScanner.nextDouble();
		radius2 = inpScanner.nextDouble();
		double distance = 0.0;
		distance = Math.pow((Math.pow(x2-x1,2)+Math.pow(y2-y1, 2)), 0.5);
		if (Math.abs(radius2-radius1) >= distance) {
			System.out.println("circle2 is inside circle1");
		}
		else if ((radius1+radius2) < distance) {
			System.out.println("circle1 is Override lap circle2");
		}
	}

}
