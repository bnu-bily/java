package com.bily.encryptiontool;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 * 读写文件
 * @author bily
 *
 */
public class IOFile {
	
	
	public static String readFile(String fileName) throws IOException{
		File file = new File(fileName);
		if (!file.exists()) {
			JOptionPane.showMessageDialog(null, "文件不能为空！");
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
		File file = new File(outfile);
		
		PrintWriter out = new PrintWriter(file);
		out.print(data);
		
		out.close();
		
	}
	
}
