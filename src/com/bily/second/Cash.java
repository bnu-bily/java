package com.bily.second;

import java.util.Scanner;

/*
 * 2.15
 * **/
public class Cash {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input 100");
		int cash = input.nextInt();
		double sumCash = cash * (1 + 0.00417);//1
		sumCash+=cash;
		sumCash = sumCash * (1 + 0.00417);//2
		sumCash+=cash;
		sumCash = sumCash * (1 + 0.00417);//3
		sumCash+=cash;
		sumCash = sumCash * (1 + 0.00417);//4
		sumCash+=cash;
		sumCash = sumCash * (1 + 0.00417);//5
		sumCash+=cash;
		sumCash = sumCash * (1 + 0.00417);//6
		System.out.printf("%.2f",sumCash);
	}

}
