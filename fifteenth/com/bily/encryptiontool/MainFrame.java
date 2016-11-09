package com.bily.encryptiontool;





import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class MainFrame extends JFrame{
	private JTextArea inTextArea = new JTextArea(4, 60);
	private JTextField desKey = new JTextField(30);
	private JTextArea outTextArea = new JTextArea(4, 60);
	private JTextField outfilePath = new JTextField(60);
	
	public MainFrame(){
		
		JPanel mainPanel = new JPanel(new GridLayout(5,1));
		
		JTextField infilePath = new JTextField(60);
		JButton addFile = new JButton(".....");
		JPanel addFilePanel = new JPanel();
		addFilePanel.add(new JLabel("添加加密文件： "));
		addFilePanel.add(infilePath);
		addFilePanel.add(addFile);
		mainPanel.add(addFilePanel);
		
		
		
		JPanel encrytJPanel = new JPanel();
		encrytJPanel.add(new JLabel("输入: "));
		encrytJPanel.add(inTextArea);
		mainPanel.add(encrytJPanel);
		
		JPanel p1 = new JPanel();//
		JPanel desPanel = new JPanel(new GridLayout(2,2));
		desPanel.add(new JLabel("Des 密钥："));
		
		desPanel.add(desKey);
		JButton desEncrypt = new JButton("des加密");
		JButton desDencrypt = new JButton("des解密");
		desPanel.add(desEncrypt);
		desPanel.add(desDencrypt);
		JPanel otherPanel = new JPanel(new GridLayout(2,2));//
		Button b1 = new Button();//
		Button b2 = new Button();//
		otherPanel.add(b1);//
		otherPanel.add(b2);//
		p1.add(desPanel);
		//p1.add(otherPanel);
		mainPanel.add(p1);
		
		JPanel dencrytJPanel = new JPanel();
		
		dencrytJPanel.add(new JLabel("输出: "));
		dencrytJPanel.add(outTextArea);
		mainPanel.add(dencrytJPanel);
		
		
		JPanel outFilePanel = new JPanel();
		outFilePanel.add(new JLabel("文件输出路径： "));
		outFilePanel.add(outfilePath);
		mainPanel.add(outFilePanel);
		
		add(mainPanel);
		
		addFile.addActionListener(new AddFile());
		desEncrypt.addActionListener(new EncrypTextArea());
		desDencrypt.addActionListener(new DecrypTextArea());
	}
	
	public static void main(String[] args) {
		MainFrame mainFrame = new MainFrame();
		mainFrame.setTitle("加解密小工具");
		mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.pack();
		mainFrame.setVisible(true);
	}

	class AddFile implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			GetFilePath selectFile = new GetFilePath();			
		}
	}
	
	class EncrypTextArea implements ActionListener{
		private String data;
		private String key;
		
		@Override
		public void actionPerformed(ActionEvent e) {
			DesUtil encrypt = new DesUtil();
			data = inTextArea.getText();
			key = desKey.getText();
			
			if (data != null && key != null) {
				try {
					outTextArea.setText(encrypt.encrypt(data, key));
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
			
			 			
		}
	}
	
	class DecrypTextArea implements ActionListener{
		private String data;
		private String key;
		
		@Override
		public void actionPerformed(ActionEvent e) {
			DesUtil decrypt = new DesUtil();
			data = inTextArea.getText();
			key = desKey.getText();
			
			if (data != null && key != null) {
				try {
					outTextArea.setText(decrypt.decrypt(data, key));
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
			
			 			
		}
	}
	
}
