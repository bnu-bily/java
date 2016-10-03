package com.bily.sixth;

import java.util.Scanner;

/**
 * 6.5
 * 打印不同的数 读入10个数，对输入的数进行处理，显示互不相同的数
 * @author Administrator
 *
 */
public class DifferentNum {

	public static void main(String[] args) {
		final int NUM = 10;
		Scanner input = new Scanner(System.in);
		int[] num = new int[NUM];
		System.out.println("请输入10个数：");
		for (int i = 0; i < NUM; i++) {
			int temp = input.nextInt();
			if (!existNum(num, temp)) {
				num[i] = temp;
			} 
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] != 0) {
				System.out.print(num[i]+" ");
			}
		}
	}
	public static boolean existNum(int[] num,int n) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] == n) {
				return true;
			}
		}
		return false;
	}
}
