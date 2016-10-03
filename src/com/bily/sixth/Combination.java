package com.bily.sixth;

import java.util.Scanner;

/**
 * 6.28 編寫一個程序，提示用戶輸入10個整數，然後顯示從這10個數中選出兩個數的所有組合
 * 
 * @author Administrator
 *
 */
public class Combination {

	public static void main(String[] args) {
		final int NUM = 10;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入10个整数：");
		int[] num = new int[NUM];
		for (int i = 0; i < NUM; i++) {
			num[i] = input.nextInt();
		}
		outPrint(num);
	}

	public static void outPrint(int[] num) {
		int count = 1;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (count % 10 == 0) {
					System.out.println("\n");
				} else {
					System.out.print("<"+num[i]+","+num[j]+">"+" ");
				}
				count++;
			}
		}
	}
}
