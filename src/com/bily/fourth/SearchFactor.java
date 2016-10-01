package com.bily.fourth;

import java.util.Scanner;

/**
 * 4.16 （找出一个整数的因子）编写程序，读入一个整数，然后以升序显示他的所有最小因子。
 * 
 * @author Administrator
 *
 */
public class SearchFactor {

	public static void main(String[] args) {
		int testNum = 120;// 测试的数值
		System.out.println("Please input a testNum(int) bigger than 1");
		Scanner inpScanner = new Scanner(System.in);
		testNum = inpScanner.nextInt();

		for (int i = 2; i <= testNum;) {//modify
			if (testNum % i == 0) {
				System.out.print(i + " ");
				testNum = testNum / i;
			} else if (testNum == 1){
				break;
			} else {
				i++;
			
			}
		}

	}

}
