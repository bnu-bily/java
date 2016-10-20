package com.bily.tenth;

import java.util.Scanner;


/**
 * ��ʾ���� ����һ������Ĭ��120
 * ʹ����StackOfIntegers �洢С�ڸ�����������Ȼ�󰴵�����ʾ����
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
		System.out.println("������һ����������");
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
