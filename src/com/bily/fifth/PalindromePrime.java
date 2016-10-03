package com.bily.fifth;

import com.sun.org.apache.xml.internal.security.keys.content.RetrievalMethod;

import sun.nio.cs.ext.ISCII91;

/**
 * 5.26��������
 * ����������ָһ����ͬʱΪ�����ͻ����������磺131��һ��������ͬʱҲ��һ��������������313��757Ҳ����ˣ�
 * ��д������ʾǰ100������������
 * ÿ����ʾ10�����Ҷ���
 * @author Administrator
 *
 */
public class PalindromePrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int testNum = 2;
		while (count != 100) {
			if (isPrime(testNum)) {
				if (isPalindrome(testNum)) {
					count++;
					formatPrint(testNum, count);
				}
			}
			testNum++;
		}
	}
	public static boolean isPrime(int num){//�ж�����
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isPalindrome(int num){//�жϻ���
		String s = Integer.toString(num);
		for (int i = 0,j = s.length()-1; i < s.length() / 2; i++,j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	public static void formatPrint(int num, int count){//��ʽ���
		System.out.printf("%10d",num);
		if (count % 10 == 0) {
			System.out.println("\n");
		}
	}
}
