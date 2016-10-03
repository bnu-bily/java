package com.bily.fifth;

import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

/**
 * 5.25
 * 将毫秒数转换成小时数，分钟数，秒数
 * @author Administrator
 *
 */
public class Translate {

	public static void main(String[] args) {
		System.out.println("请输入一个毫秒数：");
		Scanner input = new Scanner(System.in);
		long millis = input.nextLong();
		System.out.println(converMillis(millis));
	}
	public static String converMillis(long millis) {
		int second = 0;
		int minutes = 0;
		int hours = 0;
		second = (int)(millis / 1000) % 60;
		minutes = (int)(millis / 1000 / 60) % 60;
		hours = (int)(millis / 1000 / 60 / 60);
		String s = "";
		s = hours + ":" + minutes + ":" + second;
		return s;
	}
}
