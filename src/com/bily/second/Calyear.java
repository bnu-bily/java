package com.bily.second;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * 2.7**/
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
