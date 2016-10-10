package com.bily.seventh;

import java.util.Scanner;

import com.bily.sixth.Count;
import com.sun.org.apache.bcel.internal.generic.AllocationInstruction;

/**
 * 7.14
 * (̽������)��д������ʾ�û�����һ������ĳ��ȣ�������ھ���������0��1����ӡ�������Ȼ���ҳ����С����л��߶Խ��߶���0��1
 * ���С��С��Խ���
 * @author Administrator
 *
 */
public class SearchMatrix {

	public static void main(String[] args) {
		System.out.println("������һ������ĳ��ȣ�");
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
	public static int myRandom() {//������� 0 ��1
		int num = 0;
		num = (int)(Math.random() * 10) % 2;
		return num;
	}
	public static void rowScanner(int[][] targetMatrix){//ɨ����
		int flag = 0;//������������Ƿ��з�����
		for (int i = 0; i < targetMatrix.length; i++) {
			int count = 0;//����ÿһ���Ƿ����
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
	
	public static void columnScanner(int[][] targetMatrix){//ɨ����
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
	
	public static void DiagonalScanner(int[][] targetMatrix){//ɨ�茦�Ǿ�
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
