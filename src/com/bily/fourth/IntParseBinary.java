package com.bily.fourth;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

/**
 * 4.37
 * ��д������ʾ�û�����һ��ʮ����������Ȼ����ʾ��Ӧ�Ķ�����ֵ������������в�Ҫʹ��
 * Interger.toBinaryString(int)����
 * @author Administrator
 *
 */
public class IntParseBinary {

	public static void main(String[] args) {
		int testNum = 10;
		String result = "";
		while(testNum != 0){
			result+=(testNum % 2);
			testNum /= 2;
		}
		
		for (int i = (result.length()-1); 0 <= i; i--) {
			System.out.print(result.substring(i,i+1)+" ");//ʹ���ַ�����ȡ����
		}
	}

}
