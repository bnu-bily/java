package com.bily.eighth;

import java.util.Date;

/**
 * ʹ�������࣬��д���򣬴���һ��Date ������������ ����ʱ��ֱ���
 * 10000 100000 1000000 10000000 100000000 1000000000 10000000000 100000000000
 * Ȼ��ʹ��toString������ʾ����
 * @author Administrator
 *
 */
public class TestDate {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(mySetTime(date,10000));
		System.out.println(mySetTime(date,100000));
		System.out.println(mySetTime(date,1000000));
		System.out.println(mySetTime(date,10000000));
		System.out.println(mySetTime(date,100000000));
		System.out.println(mySetTime(date,1000000000));
		System.out.println(mySetTime(date,(1000000*10000)));
		System.out.println(mySetTime(date,(10000000*10000)));
	}
	public static String mySetTime(Date d,long time) {
		if (d != null && time >= 0) {
			d.setTime(time);
			return d.toString();
		}
		return null;
	}
}
