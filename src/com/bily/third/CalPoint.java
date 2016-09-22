package com.bily.third;

import java.util.Scanner;

/*
 * 3.22
 * **/
public class CalPoint {

	public static void main(String[] args) {
		double x,y,distance;
		x=y=distance=0.0;
		System.out.println("input a point");
		Scanner input = new Scanner(System.in);
		x = input.nextDouble();
		y = input.nextDouble();
		distance = Math.pow((Math.pow(x, 2)+Math.pow(y, 2)), 0.5);
		if (distance>10) {
			System.out.println("Point ("+x+" "+y+") is not in circle");
		}
		else {
			System.out.println("Point ("+x+" "+y+") is  in circle");
		}
	}

}
