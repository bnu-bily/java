package com.bily.fourth;

import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

/**
 * 4.37 ��д������ʾ�û�����һ��ʮ����������Ȼ����ʾ��Ӧ�Ķ�����ֵ������������в�Ҫʹ�� Interger.toBinaryString(int)����
 * 
 * @author Administrator
 *
 */
public class IntParseBinary {

	public static void main(String[] args) {
		int testNum = 10;
		System.out.println("Please input a num:");
		Scanner input = new Scanner(System.in);
		testNum = input.nextInt();
		String result = "";
		while (testNum != 0) {
			result = (testNum % 2) + result;//modify
			testNum /= 2;
		}

		for (int i = 0; i < result.length(); i++) {
			System.out.print(result.charAt(i) + " ");// ʹ���ַ�����ȡ����
		}
	}

}
