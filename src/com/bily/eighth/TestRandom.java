package com.bily.eighth;

import java.util.Random;

/**
 * ��д���򣬴���������1000��random����ʹ��nextInt������ʾ0��100֮��ǰ50���������
 * @author Administrator
 *
 */
public class TestRandom {
	final static int TESTNUM = 50;
	public static void main(String[] args) {
		Random random = new Random(1000);
		for (int i = 0; i < TESTNUM; i++) {
			System.out.println("��"+(i+1)+"�����ǣ� "+random.nextInt(100));
		}

	}

}
