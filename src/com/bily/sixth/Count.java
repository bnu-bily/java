package com.bily.sixth;

import java.util.Scanner;

/**
 * 6.3
 * ��д���򣬶�ȡ1��100��������Ȼ�����ÿ�������ֵĴ������ٶ���������0Ϊ������
 * @author Administrator
 *
 */
public class Count {

	public static void main(String[] args) {
		final int ARRAY_SIDE = 101;
		int[] count = new int[ARRAY_SIDE];
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter integers between 1 to 100:");
		int num = 1;
		while (num != 0) {
			num = input.nextInt();
			if (0 < num && num < 100) {
				count[num]++;
			}  
		}
		formatPrint(count);
	}
	public static void formatPrint(int[] count){
		for (int i = 1; i < count.length; i++) {
			if (count[i] == 1) {
				System.out.println(i+" occurs "+count[i]+" time");
			}else if (count[i] > 1){
				System.out.println(i+" occurs "+count[i]+" times");
			}
		}
	}
}
