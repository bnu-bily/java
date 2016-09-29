package com.bily.second;

import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 * 2.7
 * 输入分钟数，然后显示这些分钟代表多少年多少天
 * @author Administrator
 *
 */
public class Calyear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long minutes = input.nextLong();
		int day = (int) ((minutes / 60) / 24);
		int year = day / 365;
		day = day % 365;
		System.out.println("minutes is "+year+" years and "+day+" days");

	}

}
