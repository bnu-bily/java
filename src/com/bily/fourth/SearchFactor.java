package com.bily.fourth;

import java.util.Scanner;

/**
 * 4.16 ���ҳ�һ�����������ӣ���д���򣬶���һ��������Ȼ����������ʾ����������С���ӡ�
 * 
 * @author Administrator
 *
 */
public class SearchFactor {

	public static void main(String[] args) {
		int testNum = 120;// ���Ե���ֵ
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
