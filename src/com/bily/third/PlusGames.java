package com.bily.third;

import java.util.Scanner;

/*
 * 3.5
 * **/
public class PlusGames {

	public static void main(String[] args) {
		int testNum1 = (int)System.currentTimeMillis() % 8;
		int testNum2 = (int)System.currentTimeMillis() % 4;
		int testNum3 = (int)System.currentTimeMillis() % 7;
		System.out.println(testNum1 + " + " + testNum2 + " + "+testNum3 +"=  ?");
		Scanner input = new Scanner(System.in);
		int sum;
		sum  = 0;
		sum = input.nextInt();
		if ((testNum1+testNum2+testNum3) == sum) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}
