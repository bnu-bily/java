package com.bily.seventeen;





/**
 * 14.17 ��д����ʹ��Rational ������������еĺ�
 * 
 * 1/2 + 2/3 + 3/4 + 4/5 +.....+ 8/9 + 9/10
 * @author bily
 */
public class CalSum {

	public static void main(String[] args) {
		Rational temp = new Rational();
		for (int i = 1; i < 11; i++) {
			temp = temp.add(new Rational(i,i+1));
		}
		System.out.println(temp);
	}

}
