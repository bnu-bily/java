package com.bily.seventh;

import java.util.Scanner;

/**
 * ¼ÆËã2x2¾ØÕóµÄÄæ¾ØÕó
 *|a  b|            |d	-b| 
 *|	   | = 1/(ad-bc)|	  |
 *|c  d|			|-c	 a|
 * @author Administrator
 *
 */
public class Inverse {
	final static int NUM = 2;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö¶şÎ¬¾ØÕó£º");
		double[][] test = new double[NUM][NUM];
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[0].length; j++) {
				test[i][j] = input.nextDouble();
			}
		}
		double[][] show = inverse(test);
		for (int i = 0; i < show.length; i++) {
			for (int j = 0; j < show[0].length; j++) {
				System.out.print(show[i][j] + "  ");
			}
			System.out.println("\n");
		}
	}
	/**
	 * 
	 * @param A 2 * 2 ¾ØÕó
	 * @return 2 * 2 ÄæÕó
	 */
	public static double[][] inverse(double[][] A) {
		if (A.length == 2) {
			if (A[0].length == 2) {
				double temp = (A[0][0] * A[1][1]) - (A[0][1] * A[1][0]);
				if (temp != 0) {
					double[][] V = new double[NUM][NUM];
					V[0][0] = (1 / temp) * A[1][1];
					V[0][1] = (1 / temp) * A[0][1] * (-1);
					V[1][0] = (1 / temp) * A[1][0] * (-1);
					V[1][1] = (1 / temp) * A[0][0];
					return V;				
				}
				return null;
			}
			return null;
		} else {
			return null;
		}
		
	}
}
