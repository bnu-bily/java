package com.bily.ninth;

import java.util.Scanner;

/**
 * 9.5
 * 统计一个字符串中每个数字出现的次数
 * @author Administrator
 *
 */
public class Count {

	public static void main(String[] args) {
		System.out.println("请输入一个字符串：");
		Scanner input = new Scanner(System.in);
		int[] num = count(input.next());
		for (int i = 0; i < num.length; i++) {
			System.out.println(i+"出现次数为： "+num[i]);
		}

	}
	public static int[] count(String s){
		if (s == null) {
			return null;
		}
		int[] temp = new int[10];
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				temp[s.charAt(i) - '0']++;
			}
		}
		return temp;
	}
}
