package com.bily.thirteenth;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ����һ����100�����ѡȡ���������ɵ�����
 * ��ʾ�û�����������±꣬��ʾ���Ӧ��Ԫ��ֵ������±�Խ�磬����ʾ Out of Bounds
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
		System.out.println("��������±�:");
		boolean flag = true;
		do {
			try {
				int index = input.nextInt();
				System.out.println(array[index]);
				flag = false;
			} catch (InputMismatchException e) {
				System.out.println("����������");
				input.nextLine();
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Out of Bounds");
				input.nextLine();
			}
		} while (flag);
		
		
	}

}
