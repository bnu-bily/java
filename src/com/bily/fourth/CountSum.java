package com.bily.fourth;

import java.util.Scanner;

/**
 * 4.41
 * ������ĳ��ִ�������д���򣬶�ȡ�������ҳ����ǵ��������Ȼ���������ĳ��ִ������������������0�����ġ�
 * �ٶ������� 3 5 2 5 5 5 0�������ҳ������5����5���ֵĴ�����4
 * @author Administrator
 *
 */
public class CountSum {

	public static void main(String[] args) {
		int temp,max,count;
		temp = max = count = 0;
		Scanner input = new Scanner(System.in);
		while(true){
			temp = input.nextInt();
			if (temp == 0) {
				break;
			}
			if (temp == max) {
				count++;
			}
			if (max < temp) {
				max = temp;
				count = 1;
			}	
		}
		System.out.println(count);
	}

}
