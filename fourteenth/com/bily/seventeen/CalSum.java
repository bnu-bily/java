package com.bily.seventeen;

import java.math.BigInteger;



/**
 * 14.17 ��д����ʹ��Rational ������������еĺ�
 * 
 * 1/2 + 2/3 + 3/4 + 4/5 +.....+ 98/99 + 99/100
 * @author bily
 */
public class CalSum {

	public static void main(String[] args) {
		Rational temp = new Rational();
		for (int i = 1; i < 18; i++) {
			temp = temp.add(new Rational(i,i+1));
		}
		System.out.println(temp);
	}

}
