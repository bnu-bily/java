package com.bily.eighth;

import java.util.Random;

/**
 * 编写程序，创建种子是1000的random对象，使用nextInt方法显示0到100之间前50个随机整数
 * @author Administrator
 *
 */
public class TestRandom {
	final static int TESTNUM = 50;
	public static void main(String[] args) {
		Random random = new Random(1000);
		for (int i = 0; i < TESTNUM; i++) {
			System.out.println("第"+(i+1)+"个数是： "+random.nextInt(100));
		}

	}

}
