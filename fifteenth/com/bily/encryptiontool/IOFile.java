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
	
	private IOFile(){
		
	}
	
	public static String readFile(String fileName) throws IOException{
		if (fileName == null || fileName.equals("")) {
			JOptionPane.showMessageDialog(null, "未选择文件");
		}
		File file = new File(fileName);
		
		if (file.isFile()) {
			Scanner in = new Scanner(file);
			StringBuilder infileBuilder = new StringBuilder();
			while(in.hasNext()){
				infileBuilder.append(in.nextLine());
			}
			in.close();
			return infileBuilder.toString();	
		}
		return null;
	}
	
	public static void writeFile(String data,String outfile) throws IOException{
		if (outfile == null || outfile.equals("")) {
			JOptionPane.showMessageDialog(null, "未选择输出文件");
		}
		System.out.println(outfile);
		File file = new File(outfile);
		if (file.isFile()) {
			
			PrintWriter out = new PrintWriter(file);
			out.print(data);
			
			out.close();
		}
		
		
	}
	
}
