package com.bily.fourth;
/**
 * ���㽫����ѧ�ѡ��������ĳ��ѧ��ѧ��Ϊ10000��Ԫ��ѧ�ѵ���������Ϊ5%��
 * ��д���򣬼���10����ѧ���Լ������ڿ�ʼ��10��������4������ѧ���Ƕ���
 * @author Administrator
 *
 */
public class CalFurtureTuition {

	public static void main(String[] args) {
		int year = 10;
		double tuition = 10000;
		for(int i = 0;i < year;i++){
			tuition = tuition * (1 + 0.05);
		}
		System.out.println(tuition);
		double sumTuition = 0.0;
		for(int i = 0;i < 4;i++){
			sumTuition += tuition;
			tuition = tuition * (1 + 0.05);
		}
		System.out.println(sumTuition);
	}

}
