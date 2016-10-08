package com.bili.seventh;
/**
 * 7.4
 * ���й�Աÿ�ܹ�����Сʱ���洢��һ����ά�����У���8����Ա�������ܹ�ʱ����ķ�ʽ��ʾ��Ա�����ǵ��ܹ�ʱ
 * @author Administrator
 *
 */
public class WorkHours {

	public static void main(String[] args) {
		int[][] workHours = {
				{2,4,3,4,5,8,8},
				{7,3,4,3,3,4,4},
				{3,3,4,3,3,2,2},
				{9,3,4,7,6,4,1},
				{3,5,4,3,6,3,8},
				{3,4,4,6,3,4,4},
				{3,7,4,8,3,8,4},
				{6,3,5,9,2,7,9}
		};
		String[] employees = {"Employee0","Employee1","Employee2","Employee3","Employee4","Employee5","Employee6","Employee7"};
		int[] totalHours = new int[8];
		for (int i = 0; i < workHours.length; i++) {
			for (int j = 0; j < workHours[i].length; j++) {
				totalHours[i] += workHours[i][j];
			}
		}
		employSort(employees, totalHours);
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]+" "+totalHours[i]);
		}
	}
	public static void employSort(String[] en,int[] eh){//����

		for (int i = 1; i < eh.length; i++) {//��������
			int currentGrade = eh[i];
			String currentName = en[i];
			int j;
			for (j = i - 1; j >= 0 && eh[j] < currentGrade; j--) {//��������
				eh[j + 1] = eh[j];
				en[j + 1] = en[j];
			}
			eh[j + 1] = currentGrade;
			en[j + 1] = currentName;
		}
	}
}
