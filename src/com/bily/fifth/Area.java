package com.bily.fifth;

import java.util.Scanner;

/**
 * 5.36
 * ����������  ��ʾ�û�����������αߵĸ���n �Լ� �߳�s��������
 * ������㹫ʽ  ��� = n*s*s / (4*tan(pi/n))
 * @author Administrator
 *
 */
public class Area {

	public static void main(String[] args) {
		System.out.println("������������αߵĸ���n�Լ��߳�s:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double s = input.nextDouble();
		if (n != 0 && s != 0) {
			System.out.println(area(n, s));
		}
	}
	public static double area(int n, double side) {
		return ((n * side * side) / (4 * Math.tan(Math.PI / n))); 
	}
}
