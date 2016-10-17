package com.bily.ninth;

import java.io.File;
import java.util.Scanner;

/**
 *假定文件名为 Exercise9_18.txt,从文件中读取包含未指定个数的分数，显示它们的和与平均值
 * @author Administrator
 *
 */
public class DealFraction {

	public static void main(String[] args) throws Exception{
		File file = new File("Exercise9_18.txt");
		if (!file.exists()) {
			System.exit(0);
		}
		Scanner input = new Scanner(file);
		double total = 0;
		int count = 0;
		while (input.hasNext()) {
			total += input.nextDouble();
			count++;
		}
		System.out.println("总数为："+total+" ");
		if (count != 0) {
			System.out.println(total / count);
		} else {
			System.out.println("空文件");
		}
	}
	
}
