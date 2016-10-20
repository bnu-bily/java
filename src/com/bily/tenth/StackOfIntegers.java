package com.bily.tenth;

import java.util.Scanner;


/**
 * 显示素数 输入一个数，默认120
 * 使用类StackOfIntegers 存储小于该数的素数，然后按倒序显示出来
 * @author Administrator
 *
 */
public class StackOfIntegers {
	private int[] prime;	
	private int top;
	public StackOfIntegers(){
		this(16);
	}
	public StackOfIntegers(int len){
		if (len > 0) {
			prime = new int[len];			
		}
	}
	public void push(int value){
		if (top >= prime.length) {
			int[] temp = new int[prime.length * 2];
			System.arraycopy(prime, 0, temp, 0, prime.length);
			prime = temp;
		}
		prime[top++] = value;
	}
	public boolean isEmpty(){
		if (top > 0) {
			return false; 
		} else {
			return true;
		}
	}
	public int pop(){
		return prime[--top];
	}
	public int getTop(){
		if (top >= 1) {
			return prime[top - 1];
		}
		return -1;
	}
	public static boolean isPrime(int num){
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("请输入一个测试数：");
		StackOfIntegers si = new StackOfIntegers();
		Scanner input = new Scanner(System.in);
		int testNum = input.nextInt();
		for (int i = 2; i < testNum; i++) {
			if (StackOfIntegers.isPrime(i)) {
				si.push(i);
			}
		}
		while (!si.isEmpty()) {
			System.out.print(si.pop() + " ");
		}
	}

}
