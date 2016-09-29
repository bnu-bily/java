package com.bily.second;

import java.util.Scanner;

/**
 * 2.15
 * 假设你每月向银行存100美元，年利率为5%，那么每月的利率是0.05、12=0.00417，以此类推，显示6个月后的账户钱数
 * @author Administrator
 *
 */
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
