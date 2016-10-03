package com.bily.sixth;

import java.util.Scanner;

import sun.tools.jar.resources.jar;

/**
 * 6.19
 * 对学生排序，编写程序，提示用户输入学生个数，学生姓名，学生成绩
 * 然后按照按照学生降序打印学生姓名
 * @author Administrator
 *
 */

public class StudentSort {

	public static void main(String[] args) {
		System.out.println("请输入学生个数：");
		Scanner input = new Scanner(System.in);
		int studentNum = input.nextInt();
		double[] studentGrade = new double[studentNum];
		String[] studentName = new String[studentNum];
		System.out.println("请输入学生姓名、成绩");
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
		
		for (int i = 1; i < sg.length; i++) {//插入排序
			double currentGrade = sg[i];
			String currentName = sn[i];
			int j;
			for (j = i - 1; j >= 0 && sg[j] < currentGrade; j--) {//降序排列
				sg[j + 1] = sg[j];
				sn[j + 1] = sn[j];
			}
			sg[j + 1] = currentGrade;
			sn[j + 1] = currentName;
		}
	}
}
