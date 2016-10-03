package com.bily.fifth;
/**
 * 5.13
 * 数列求和 计算下列级数
 * m（i） = 1/2 + 2/3 + 3/4 + .... + i/i+1
 * @author Administrator
 *
 */
public class CalSum {
	public static void main(String[] args) {
		final int TIME = 20;
		System.out.println("i                    "+"m(i)");
		for (int i = 0; i <= TIME; i++) {
			System.out.printf("%-2d                   %-8.4f\n",i,calSum(i));
		}
	}
	public static double calSum(int n) {
		double sum = 0.0;
		for (double i = 0; i <= n; i++) {
			sum += (i / (i+1));
		}
		
		return sum;
	}
}
