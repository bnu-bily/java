package com.bily.fourth;

import java.util.Scanner;

/**
 * 4.16
 * ���ҳ�һ�����������ӣ���д���򣬶���һ��������Ȼ����������ʾ����������С���ӡ�
 * @author Administrator
 *
 */
public class SearchFactor {

	public static void main(String[] args) {
		int testNum = 120;//���Ե���ֵ
		System.out.println("Please input a testNum(int)");
		Scanner inpScanner = new Scanner(System.in);
		testNum = inpScanner.nextInt();
		while(testNum != 1){
			for(int i = 2;i <= testNum;i++){
				if (testNum % i == 0) {
					System.out.print(i+" ");
					testNum = testNum / i ;
					break;
				}
			}
		}

	}

}
