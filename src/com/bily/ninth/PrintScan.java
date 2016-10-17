package com.bily.ninth;

import java.io.PrintWriter;
import java.util.Scanner;


/**
 * 9.19
 * 写读数据，如果文件Exercise9_19.txt的文件不存在，则创建这个文件，使用I/O编写随机产生100个整数给文件
 * 。文件中的整数以空格分开，从文件中读回数据然后显示排好序的数据
 * @author Administrator
 *
 */
public class PrintScan {
	final static int NUM = 100;
	public static void main(String[] args) throws Exception{
		java.io.File file = new java.io.File("Exercise9_19.txt");
		if (file.exists()) {
			System.exit(0);
		}
		
		PrintWriter output = new PrintWriter(file);
		for (int i = 0; i < NUM; i++) {
			output.print((int)(Math.random() * 100));
			output.print(" ");
		}
		output.close();
		/******************************************************/
		
		Scanner inputFile = new Scanner(file); 
		int count = 0;
		while(inputFile.hasNext()){
			System.out.print(inputFile.next());
			System.out.print(" ");
			if (count % 10 == 9) {
				System.out.println();
			}
			count++;
		}
		inputFile.close();
	}

}
