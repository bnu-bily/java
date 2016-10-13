package com.bily.eighth;

import java.util.Date;

/**
 * 使用日期类，编写程序，创建一个Date 对象，设置它的 流逝时间分别是
 * 10000 100000 1000000 10000000 100000000 1000000000 10000000000 100000000000
 * 然后使用toString方法显示日期
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
