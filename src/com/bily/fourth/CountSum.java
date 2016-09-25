package com.bily.fourth;

import java.util.Scanner;

/**
 * 4.41
 * 最大数的出现次数，编写程序，读取整数，找出他们的最大数，然后计算该数的出现次数。假设输入的是以0结束的。
 * 假定输入是 3 5 2 5 5 5 0，程序找出最大数5，而5出现的次数是4
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
