package com.bily.encryptiontool;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 * ��д�ļ�
 * @author bily
 *
 */
public class IOFile {
	
	private IOFile(){
		
	}
	public static String readFile(String fileName) throws IOException{
		if (fileName == null) {
			return null;
		}
		File file = new File(fileName);
		if (!file.isFile()) {
			JOptionPane.showMessageDialog(null, "δѡ���ļ�");
			return null;
		}
		if (!file.exists()) {
			JOptionPane.showMessageDialog(null, "�ļ�����Ϊ�գ�");
		}
		Scanner in = new Scanner(file);
		StringBuilder infileBuilder = new StringBuilder();
		while(in.hasNext()){
			infileBuilder.append(in.nextLine());
		}
		in.close();
		return infileBuilder.toString();
	}
	
	public static void writeFile(String data,String outfile) throws IOException{
		if (outfile == null) {
			System.exit(0);
		}
		File file = new File(outfile);
		if (!file.isFile()) {
			JOptionPane.showMessageDialog(null, "δѡ������ļ�");
		}
		PrintWriter out = new PrintWriter(file);
		out.print(data);
		
		out.close();
		
	}
	
}
