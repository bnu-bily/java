package com.bily.thirteenth;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * 13.2 提示用户输入两个整数，然后显示它们的和，程序在输入不正确时提示用户再次读取数字
 * @author Administrator
 *
 */
public class NumberFormatException {

	public static void main(String[] args) {
		System.out.println("请输入两个整数：");
		Scanner input = new Scanner(System.in);
		
		boolean flag = true;
		do {
			try {
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				
				System.out.println("total is " + (num1 + num2));
				flag = false;
			} catch (InputMismatchException e) {
				System.out.println("请输入整数");
				System.out.println(input.nextLine());
			}
		} while (flag);

	}

}
