package com.bily.ninth;

import java.util.Scanner;

/**
 * 9.5
 * ͳ��һ���ַ�����ÿ�����ֳ��ֵĴ���
 * @author Administrator
 *
 */
public class Count {

	public static void main(String[] args) {
		System.out.println("������һ���ַ�����");
		Scanner input = new Scanner(System.in);
		int[] num = count(input.next());
		for (int i = 0; i < num.length; i++) {
			System.out.println(i+"���ִ���Ϊ�� "+num[i]);
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
