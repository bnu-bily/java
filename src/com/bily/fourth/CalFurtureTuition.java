package com.bily.fourth;
/**
 * 4.7计算将来的学费、假设今年某大学的学费为10000美元，学费的年增长率为5%，
 * 编写程序，计算10年后的学费以及从现在开始的10年后的算起，4年内总学费是多少
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
