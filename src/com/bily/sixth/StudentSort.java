package com.bily.sixth;

import java.util.Scanner;

import sun.tools.jar.resources.jar;

/**
 * 6.19
 * ��ѧ�����򣬱�д������ʾ�û�����ѧ��������ѧ��������ѧ���ɼ�
 * Ȼ���հ���ѧ�������ӡѧ������
 * @author Administrator
 *
 */

public class StudentSort {

	public static void main(String[] args) {
		System.out.println("������ѧ��������");
		Scanner input = new Scanner(System.in);
		int studentNum = input.nextInt();
		double[] studentGrade = new double[studentNum];
		String[] studentName = new String[studentNum];
		System.out.println("������ѧ���������ɼ�");
		for (int i = 0; i < studentNum; i++) {
			studentName[i] = input.next();
			studentGrade[i] = input.nextDouble();
		}
		studentSort(studentName,studentGrade);
		for (String s:studentName) {
			System.out.println(s);
		}
	}
	public static void studentSort(String[] sn,double[] sg){
		
		for (int i = 1; i < sg.length; i++) {//��������
			double currentGrade = sg[i];
			String currentName = sn[i];
			int j;
			for (j = i - 1; j >= 0 && sg[j] < currentGrade; j--) {//��������
				sg[j + 1] = sg[j];
				sn[j + 1] = sn[j];
			}
			sg[j + 1] = currentGrade;
			sn[j + 1] = currentName;
		}
	}
}
