package com.bily.ninth;

import java.util.Scanner;

/**
 * 9.11
 * ���ַ����е��ַ������û�����һ���ַ����������ź�����ַ������ַ�����������ĸ
 * @author Administrator
 *
 */
public class Sort {

	public static void main(String[] args) {
		System.out.println("������ȫ����ĸ���ַ�����");
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
		
		for (int i = 1; i < stringBuilder.length(); i++) {//��������
			
			char current = stringBuilder.charAt(i);
			int j;
			for (j = i - 1; j >= 0 && stringBuilder.charAt(j) > current; j--) {//��������
				
				stringBuilder.setCharAt(j+1, stringBuilder.charAt(j));
			}
			stringBuilder.setCharAt(j + 1, current);
		}
		return stringBuilder.toString();
	}
}
