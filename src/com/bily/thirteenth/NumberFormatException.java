package com.bily.thirteenth;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * 13.2 ��ʾ�û���������������Ȼ����ʾ���ǵĺͣ����������벻��ȷʱ��ʾ�û��ٴζ�ȡ����
 * @author Administrator
 *
 */
public class NumberFormatException {

	public static void main(String[] args) {
		System.out.println("����������������");
		Scanner input = new Scanner(System.in);
		
		boolean flag = true;
		do {
			try {
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				
				System.out.println("total is " + (num1 + num2));
				flag = false;
			} catch (InputMismatchException e) {
				System.out.println("����������");
				System.out.println(input.nextLine());
			}
		} while (flag);

	}

}
