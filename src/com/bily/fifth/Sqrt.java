package com.bily.fifth;

import java.util.Scanner;

/**
 * 5.22
 * ���Fsqrt���������Ԕ�numƽ���������¹�ʽ����Ӌ����Ƶõ�
 * nextGuess = (lastGuess + (num / lastGuess)) / 2
 * ���lastGuess��nextGuess������0.0001
 * ��ônextGuess����ƽ����������ͷ�������
 * @author Administrator
 *
 */
public class Sqrt {
 
	public static void main(String[] args) {
		System.out.println("������һ����������");
		Scanner input = new Scanner(System.in);
		double testNum = input.nextDouble();
		if (testNum > 0) {
			System.out.println(mySqrt(testNum));
		} else {
			System.out.println("�������������");
		}
		
	}
	public static double mySqrt(double num) {
		double lastGuess = 1;
		double nextGuess = 2;//��Ҫȡ0
		while (Math.abs(nextGuess - lastGuess) >= 0.00000001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + (num / lastGuess)) / 2;
		}
		return nextGuess;
	}
}
