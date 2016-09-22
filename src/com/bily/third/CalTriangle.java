package com.bily.third;

import java.util.Scanner;

/*
 * 3.25计算一个三角形的周长
 * **/
public class CalTriangle {

	public static void main(String[] args) {
		Scanner inpScanner = new Scanner(System.in);
		double x,y,z;
		x=y=z=0.0;
		x = inpScanner.nextDouble();
		y = inpScanner.nextDouble();
		z = inpScanner.nextDouble();
		if ((x+y)>z && (x+z)>y&&(y+z)>x) {
			System.out.println(x+y+z);
		}else {
			System.out.println("invaliad input");
			
		}

	}

}
