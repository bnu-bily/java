package com.bily.ninth;

import java.util.Scanner;

/**
 * ͳ����ĸ��������ʾ�û������ַ�����ͳ���ַ�������ĸ���ָ���
 * @author Administrator
 *
 */
public class CountLetters {

	public static void main(String[] args) {
		System.out.println("������һ���ַ���");
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
