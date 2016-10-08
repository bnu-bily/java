package com.bili.seventh;

import java.util.Scanner;

import com.bily.sixth.Count;
import com.sun.org.apache.bcel.internal.generic.AllocationInstruction;

/**
 * 7.14
 * (探究矩阵)编写程序，提示用户输入一个方阵的长度，随机地在矩阵中填入0和1，打印这个矩阵，然后找出整行、整列或者对角线都是0或1
 * 的行、列、对角线
 * @author Administrator
 *
 */
public class SearchMatrix {

	public static void main(String[] args) {
		System.out.println("请输入一个方阵的长度：");
		int matrixLength = 0;
		Scanner input = new Scanner(System.in);
		matrixLength = input.nextInt();
		int[][] testMatrix = new int[matrixLength][matrixLength];
		for (int i = 0; i < testMatrix.length; i++) {
			for (int j = 0; j < testMatrix.length; j++) {
				testMatrix[i][j] = myRandom();
			}
		}
		for (int i = 0; i < testMatrix.length; i++) {
			for (int j = 0; j < testMatrix.length; j++) {
				System.out.print(testMatrix[i][j]+" ");
			}
			System.out.println();
		}
		rowScanner(testMatrix);
		columnScanner(testMatrix);
		DiagonalScanner(testMatrix);
	}
	public static int myRandom() {//随机产生 0 、1
		int num = 0;
		num = (int)(Math.random() * 10) % 2;
		return num;
	}
	public static void rowScanner(int[][] targetMatrix){//扫描行
		int flag = 0;//控制整個矩陣是否有符合行
		for (int i = 0; i < targetMatrix.length; i++) {
			int count = 0;//控制每一行是否符合
			for (int j = 0; j < targetMatrix.length; j++) {
				if (targetMatrix[i][0] != targetMatrix[i][j] ) {
					break;
				} else {
					count++;
				}
			}
			if (count == targetMatrix.length) {
				System.out.println("All "+targetMatrix[i][0]+" on row"+i);
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("No same numbers on a row");
		}
	}
	
	public static void columnScanner(int[][] targetMatrix){//扫描列
		int flag = 0;
		for (int i = 0; i < targetMatrix.length; i++) {
			int count = 0;
			for (int j = 0; j < targetMatrix.length; j++) {
				if (targetMatrix[0][i] != targetMatrix[j][i] ) {
					break;
				} else {
					count++;
				}
			}
			if (count == targetMatrix.length) {
				System.out.println("All "+targetMatrix[0][i]+" on coulumn"+i);
				flag = 1;				
			}
		}
		if (flag == 0) {
			System.out.println("No same numbers on a coulumn");
		}
	}
	
	public static void DiagonalScanner(int[][] targetMatrix){//扫描對角線
		int flag = 1;
		for (int i = 0; i < targetMatrix.length; i++) {
			
				if (targetMatrix[0][0] != targetMatrix[i][i]) {
					System.out.println("No same numbers on the sub diagonal");
					flag = 0;
					break;
				}
		}
		if (flag == 1) {
			System.out.println("All "+targetMatrix[0][0]+" on sub diagonal");			
		}
		flag = 1;
		for (int i = targetMatrix.length - 1; 0 <= i; i--) {
			
			if (targetMatrix[0][i] != targetMatrix[i][i]) {
				System.out.println("No same numbers on the major diagonal");
				flag = 0;
				break;
			}
		
	}
		if (flag == 1) {
			System.out.println("All "+targetMatrix[0][targetMatrix.length - 1]+" on major diagonal");					
		}
	}
}
