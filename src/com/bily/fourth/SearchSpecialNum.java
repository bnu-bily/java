package com.bily.fourth;
/**
 * 4.33
 * （完全数）如果一个正整数等于除它本身之外其他所有除数之和，就称之为完全数。
 * 例如：6是第一个完全数，因为6是1+2+3.下一个完全数是28=14+7+4+2+1
 * 10000以下有完全数4个，编写程序，找出这四个数
 * @author Administrator
 *
 */
public class SearchSpecialNum {

	public static void main(String[] args) {
		int testNum = 10000;
		int sum;
		for(int i = 2;i < testNum;i++){
			sum = 0;
			for(int j = 1;j < i;j++){//O次方的遍历模就可以
				if(i % j == 0){
					sum+=j;
				}
			}
			
			if (i==sum) {
				System.out.println(i);
			}
		}

	}

}
