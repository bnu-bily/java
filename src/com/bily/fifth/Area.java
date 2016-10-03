package com.bily.fifth;

import java.util.Scanner;

/**
 * 5.36
 * 正多边形面积  提示用户输入正多边形边的个数n 以及 边长s，输出面积
 * 面积计算公式  面积 = n*s*s / (4*tan(pi/n))
 * @author Administrator
 *
 */
public class Area {

	public static void main(String[] args) {
		System.out.println("请输入正多边形边的个数n以及边长s:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double s = input.nextDouble();
		if (n != 0 && s != 0) {
			System.out.println(area(n, s));
		}
	}
	public static double area(int n, double side) {
		return ((n * side * side) / (4 * Math.tan(Math.PI / n))); 
	}
}
