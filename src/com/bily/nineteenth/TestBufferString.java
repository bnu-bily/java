package com.bily.nineteenth;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class TestBufferString {

	public static void main(String[] args) {
		try {
			long ts = System.currentTimeMillis();
			BufferedInputStream in = new BufferedInputStream(new FileInputStream("SampleData.txt"));
			int count = 1;
			while (count != 5000000) {
				System.out.println(in.read() + "    " + ++count);		
			}
			System.out.println("Time: " + (System.currentTimeMillis() - ts) / 1000);
			in.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
