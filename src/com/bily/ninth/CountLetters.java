package com.bily.ninth;

import java.util.Scanner;

/**
 * 统计字母个数，提示用户输入字符串，统计字符串中字母出现个数
 * @author Administrator
 *
 */
public class CountLetters {

	public static void main(String[] args) {
		System.out.println("请输入一个字符串");
		Scanner input = new Scanner(System.in);
		String string = input.next();
		System.out.println(countLetters(string));

	}
	public static int countLetters(String s){
		if (s == null) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				count++;
			}
		}
		return count;
	}
}
