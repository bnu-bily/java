package com.bily.fourth;

/**
 * 4.33 ����ȫ�������һ�����������ڳ�������֮���������г���֮�ͣ��ͳ�֮Ϊ��ȫ����
 * ���磺6�ǵ�һ����ȫ������Ϊ6��1+2+3.��һ����ȫ����28=14+7+4+2+1 10000��������ȫ��4������д�����ҳ����ĸ���
 * 
 * @author Administrator
 *
 */
public class SearchSpecialNum {

	public static void main(String[] args) {
		int testNum = 10000;
		int sum;
		for (int i = 2; i < testNum; i++) {
			sum = 0;
			for (int j = 2; j < Math.sqrt(i); j++) {// modify
				if (i % j == 0) {
					sum += j;
					sum += (i/j);//modify
				}
			}

			if (i == sum+1) {
				System.out.println(i);
			}
		}

	}

}
