package com.bily.seventh;

import java.util.Scanner;

/**
 * 7.2
 * ��������Խ��������еĺ�
 * @author Administrator
 *
 */
public class CalSum {

	public static void main(String[] args) {
		final int NUM = 4;
		Scanner input = new Scanner(System.in);
		int[][] num = new int[NUM][NUM];
		int totalSum = 0;
		System.out.println("������һ��4 * 4�ľ���");
		for (int i = 0; i < NUM; i++) {
			for (int j = 0; j < NUM; j++) {
				num[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < num.length; i++) {
			totalSum += num[i][i];
		}
		System.out.println(totalSum);
	}

}
