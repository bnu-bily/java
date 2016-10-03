package com.bily.fifth;

import com.sun.org.apache.xml.internal.security.keys.content.RetrievalMethod;

import sun.nio.cs.ext.ISCII91;

/**
 * 5.26回文素数
 * 回文素数是指一个数同时为素数和回文数，例如：131是一个素数，同时也是一个回文数，数字313和757也是如此，
 * 编写程序，显示前100个回文素数，
 * 每行显示10个并且对齐
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
	public static boolean isPrime(int num){//判断素数
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isPalindrome(int num){//判断回文
		String s = Integer.toString(num);
		for (int i = 0,j = s.length()-1; i < s.length() / 2; i++,j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	public static void formatPrint(int num, int count){//格式输出
		System.out.printf("%10d",num);
		if (count % 10 == 0) {
			System.out.println("\n");
		}
	}
}
