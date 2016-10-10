package com.bily.seventh;

import java.util.Scanner;



/**
 * 7.13定位最大元素，提示用户输入一个二维数组，找到最大值的行列坐标，返回一维数组，数组存放最大值得行列坐标
 * @author Administrator
 *
 */
public class GetMaxLocation {

	public static void main(String[] args) {
		final int SIZE = 5;
		System.out.println("请输入一个5行5列二维数组：");
		double[][] array = new double[SIZE][SIZE];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		getMaxLocation(array);
		int[] show = getMaxLocation(array);
		System.out.println("最大值坐标为"+"<"+show[0]+","+show[1]+">");
		
	}
	/**
	 * 
	 * @param array 
	 * @return 数组第一个值代表行，第二代表列
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
