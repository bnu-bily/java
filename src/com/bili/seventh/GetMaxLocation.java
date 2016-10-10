package com.bili.seventh;

import java.util.Scanner;



/**
 * 7.13��λ���Ԫ�أ���ʾ�û�����һ����ά���飬�ҵ����ֵ���������꣬����һά���飬���������ֵ����������
 * @author Administrator
 *
 */
public class GetMaxLocation {

	public static void main(String[] args) {
		final int SIZE = 5;
		System.out.println("������һ��5��5�ж�ά���飺");
		double[][] array = new double[SIZE][SIZE];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		getMaxLocation(array);
		int[] show = getMaxLocation(array);
		System.out.println("���ֵ����Ϊ"+"<"+show[0]+","+show[1]+">");
		
	}
	/**
	 * 
	 * @param array 
	 * @return �����һ��ֵ�����У��ڶ�������
	 */
	public static int[] getMaxLocation(double[][] array) {
		int[] location = new int[2];
		double max = 0.0;
		max = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
					location[0] = i;
					location[1] = j;
				}
			}
		}
		return location;
	}
}
