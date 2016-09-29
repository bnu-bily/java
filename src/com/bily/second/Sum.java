package com.bily.second;

import java.util.Scanner;

/**
 * 2.6
 * 读取0-1000之间的整数，并将该整数的各位数字相加
 * @author Administrator
 *
 */
public class Sum {

	public static void main(String[] args) {
		System.out.println("please input a num beside 1 to 1000");
		Scanner testNum = new Scanner(System.in);
		int sum,firstNum,secondNum;
		sum = firstNum = secondNum = 0;
		int num = testNum.nextInt();
		if (num>1 && num<1000) {
			secondNum = num / 10;
			firstNum = num / 100;
			sum = firstNum % 10 + secondNum % 10 + num % 10;
			System.out.println(sum);
		}else {
			System.out.println("input error");
			
		}
	}

}
