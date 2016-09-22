package com.bily.second;

import java.util.Scanner;

/*
 * 2.14
 * **/
public class CalBMI {

	public static void main(String[] args) {
		System.out.println("input weight in pounds");
		Scanner inputw = new Scanner(System.in);
		double weight = inputw.nextDouble();
		weight*=0.45359237;
		System.out.println("input height in inches");
		Scanner inputh = new Scanner(System.in);
		int height = inputh.nextInt();
		double heights = height*0.0254;
		double BMI = 0.0;
		BMI = weight / (heights*heights);
		System.out.println("BMI is" + BMI);
	}

}
