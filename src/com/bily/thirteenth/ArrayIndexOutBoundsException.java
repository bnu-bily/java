package com.bily.thirteenth;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 创建一个由100个随机选取的整数构成的数组
 * 提示用户输入数组的下标，显示相对应的元素值，如果下标越界，就显示 Out of Bounds
 * @author Administrator
 *
 */
public class ArrayIndexOutBoundsException {

	public static void main(String[] args) {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 1000000000);
		}
		Scanner input = new Scanner(System.in);
		System.out.println("输入访问下标:");
		boolean flag = true;
		do {
			try {
				int index = input.nextInt();
				System.out.println(array[index]);
				flag = false;
			} catch (InputMismatchException e) {
				System.out.println("请输入整数");
				input.nextLine();
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Out of Bounds");
				input.nextLine();
			}
		} while (flag);
		
		
	}

}
