package com.bily.ninth;

import java.util.Scanner;

/**
 * 9.11
 * 对字符串中的字符排序，用户输入一个字符串，返回排好序的字符串，字符串智能是字母
 * @author Administrator
 *
 */
public class Sort {

	public static void main(String[] args) {
		System.out.println("请输入全是字母的字符串：");
		Scanner input = new Scanner(System.in);
		System.out.println(sort(input.next()));
	}
	public static String sort(String s){
		if (s == null) {
			return null;
		}
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetter(s.charAt(i))) {
				return null;
			}
		}
		StringBuilder stringBuilder = new StringBuilder(s);
		
		for (int i = 1; i < stringBuilder.length(); i++) {//插入排序
			
			char current = stringBuilder.charAt(i);
			int j;
			for (j = i - 1; j >= 0 && stringBuilder.charAt(j) > current; j--) {//升序排列
				
				stringBuilder.setCharAt(j+1, stringBuilder.charAt(j));
			}
			stringBuilder.setCharAt(j + 1, current);
		}
		return stringBuilder.toString();
	}
}
