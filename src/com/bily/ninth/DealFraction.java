package com.bily.ninth;

import java.io.File;
import java.util.Scanner;

/**
 *�ٶ��ļ���Ϊ Exercise9_18.txt,���ļ��ж�ȡ����δָ�������ķ�������ʾ���ǵĺ���ƽ��ֵ
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
		System.out.println("����Ϊ��"+total+" ");
		if (count != 0) {
			System.out.println(total / count);
		} else {
			System.out.println("���ļ�");
		}
	}
	
}
