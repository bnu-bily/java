package com.bily.third;

import java.util.Scanner;

/**
 * 3.25
 * 读入三条边，看看是否合法，合法就输出周长
 * @author Administrator
 *
 */
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
