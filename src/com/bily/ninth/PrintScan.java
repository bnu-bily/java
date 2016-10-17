package com.bily.ninth;

import java.io.PrintWriter;
import java.util.Scanner;


/**
 * 9.19
 * д�����ݣ�����ļ�Exercise9_19.txt���ļ������ڣ��򴴽�����ļ���ʹ��I/O��д�������100���������ļ�
 * ���ļ��е������Կո�ֿ������ļ��ж�������Ȼ����ʾ�ź��������
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
