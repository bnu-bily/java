package com.bily.eighth;

import java.util.Scanner;

import sun.awt.windows.ThemeReader;


/**
 * 8.13
 * ���һ��Location�࣬��λ��ά�����е����ֵ����λ�á��������������������� row column maxValue
 * ��ά��������ֵ�����±���int�͵� row��column�Լ�double�͵�maxValue�洢
 * @author Administrator
 *
 */
public class Location {
	public  int row;
	public  int column;
	public  double maxValue;
	public Location() {
		
	}
	
	public Location(int r,int c,double m) {
		if (r > 0 && c > 0) {
			row = r;
			column = c;
			maxValue = m;
		}
	}
	
	public static Location localLargest(double[][] a){
		if (a.length >= 0) {
			if (a[0].length >= 1) {
				int row = 0;
				int column = 0;
				double maxValue = a[0][0];
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
		System.out.println("�������ά����� �� ��");
		Scanner input = new Scanner(System.in);
		int arrayRow = input.nextInt();
		int arratColumn = input.nextInt();
		System.out.println("�������ά���飺");
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
