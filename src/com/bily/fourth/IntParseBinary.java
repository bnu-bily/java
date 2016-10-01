package com.bily.fourth;

import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

/**
 * 4.37 编写程序，提示用户输入一个十进制整数，然后显示对应的二进制值。在这个程序中不要使用 Interger.toBinaryString(int)方法
 * 
 * @author Administrator
 *
 */
public class IntParseBinary {

	public static void main(String[] args) {
		int testNum = 10;
		System.out.println("Please input a num:");
		Scanner input = new Scanner(System.in);
		testNum = input.nextInt();
		String result = "";
		while (testNum != 0) {
			result = (testNum % 2) + result;//modify
			testNum /= 2;
		}

		for (int i = 0; i < result.length(); i++) {
			System.out.print(result.charAt(i) + " ");// 使用字符串截取函数
		}
	}

}
