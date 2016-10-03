package com.bily.fifth;

import java.util.Scanner;

/**
 * 5.22
 * 實現sqrt方法，测试數num平方根用以下公式反復計算近似得到
 * nextGuess = (lastGuess + (num / lastGuess)) / 2
 * 如果lastGuess与nextGuess相差不大于0.0001
 * 那么nextGuess就是平方根，否则就反复计算
 * @author Administrator
 *
 */
public class Sqrt {
 
	public static void main(String[] args) {
		System.out.println("请输入一个测试数：");
		Scanner input = new Scanner(System.in);
		double testNum = input.nextDouble();
		if (testNum > 0) {
			System.out.println(mySqrt(testNum));
		} else {
			System.out.println("请输入比零大的数");
		}
		
	}
	public static double mySqrt(double num) {
		double lastGuess = 1;
		double nextGuess = 2;//不要取0
		while (Math.abs(nextGuess - lastGuess) >= 0.00000001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + (num / lastGuess)) / 2;
		}
		return nextGuess;
	}
}
