package com.bily.eighth;

import java.util.Scanner;

import sun.awt.windows.ThemeReader;


/**
 * 8.13
 * 设计一个Location类，定位二维数组中的最大值及其位置。这个类包括公共的数据域 row column maxValue
 * 二维数组的最大值及其下标用int型的 row和column以及double型的maxValue存储
 * @author Administrator
 *
 */
public class Location {
	public static int row;
	public static int column;
	public static double maxValue;
	public Location() {
		
	}
	
	public Location(int r,int c,double m) {
		if (row > 0 && column > 0) {
			row = r;
			column = c;
			maxValue = m;
		}
	}
	
	public static Location localLargest(double[][] a){
		if (a.length >= 0) {
			if (a[0].length >= 1) {
				maxValue = a[0][0];
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < a[0].length; j++) {
						if (maxValue < a[i][j]) {
							maxValue = a[i][j];
							row = i;
							column = j;
						}
					}
				}
				return new Location(row,column,maxValue);
				
			}
			return null;
		}
		return null;
	}
	public static void main(String[] args) {
		System.out.println("请输入二维数组的 行 列");
		Scanner input = new Scanner(System.in);
		int arrayRow = input.nextInt();
		int arratColumn = input.nextInt();
		System.out.println("请输入二维数组：");
		Location testLocation = new Location();
		double[][] testArray = new double[arrayRow][arratColumn];
		for (int i = 0; i < arrayRow; i++) {
			for (int j = 0; j < arratColumn; j++) {
				testArray[i][j] = input.nextDouble();
			}
		}
		testLocation = localLargest(testArray);
		System.out.println("The location of the largest element is "+testLocation.maxValue+" is at ("
							+testLocation.row+","+testLocation.column+")");
	}

}
