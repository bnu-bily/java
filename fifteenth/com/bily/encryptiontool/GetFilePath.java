package com.bily.encryptiontool;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GetFilePath extends JFrame{
	private  JFileChooser chooserFile = new JFileChooser(); 
	private static GetFilePath frame = new GetFilePath();
	private  static String encryptionFilePath = new String();
	
	public GetFilePath(){
		
		
		JPanel panel = new JPanel();
	
		panel.add(chooserFile);
		add(panel);
		
		chooserFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				encryptionFilePath = chooserFile.getSelectedFile().toString();
				frame.setVisible(false);
				System.out.println(getFilePath());
			}
		});
	}
	
	public   String getFilePath(){	
		
		return encryptionFilePath;
	}
	
	public static void main(String[] args){
		
		frame.setTitle("选择加密文件");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
}
