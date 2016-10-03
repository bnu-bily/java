package com.bily.sixth;

import java.util.Scanner;

/**
 * 6.12
 * 倒置数组，提示用户输入10个数，调用方法，将数组倒置，然后输出
 * @author Administrator
 *
 */
public class InvertionArray {
	final static int NUM = 10;

	public static void main(String[] args) {
		int[] num = new int[NUM];
		Scanner input = new Scanner(System.in);
		System.out.println("请输入10个整数：");
		for (int i = 0; i < NUM; i++) {
			num[i] = input.nextInt();
		}
		int[] temp = invertionArray(num);
		for (int n:temp){
			System.out.print(n+" ");
		}
	}
	public static int[] invertionArray(int[] num){
		int[] temp = new int[NUM];
		for (int i = 0, j = temp.length - 1; i < temp.length; i++, j--) {
			temp[i] = num[j];
		}
		return temp;
	}
}
