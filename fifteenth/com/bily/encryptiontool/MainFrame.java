package com.bily.encryptiontool;





import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class MainFrame extends JFrame{
	
	public MainFrame(){
		
		
		JTextField filePath = new JTextField(60);
		JButton addFile = new JButton("......");
		JPanel addFilePanel = new JPanel();
		addFilePanel.add(new JLabel("���Ӽ����ļ��� "));
		addFilePanel.add(filePath);
		addFilePanel.add(addFile);
		add(addFilePanel,BorderLayout.NORTH);
		
		
		JTextArea encrypTextArea = new JTextArea(4, 60);
		JPanel encrytJPanel = new JPanel();
		encrytJPanel.add(new JLabel("����: "));
		encrytJPanel.add(encrypTextArea);
		add(encrytJPanel,BorderLayout.CENTER);
		
		JPanel desPanel = new JPanel(new GridLayout(2,2));
		desPanel.add(new JLabel("Des ��Կ��"));
		JTextField desKey = new JTextField(20);
		desPanel.add(desKey);
		JButton desEncrypt = new JButton("����");
		JButton desDencrypt = new JButton("����");
		desPanel.add(desEncrypt);
		desPanel.add(desDencrypt);
		JPanel otherPanel = new JPanel(new GridLayout(2,2));
		add(desPanel,FlowLayout.TRAILING0);
		//add(otherPanel,);
		
		
	}
	
	public static void main(String[] args) {
		MainFrame mainFrame = new MainFrame();
		mainFrame.setTitle("�ӽ���С����");
		mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.pack();
		mainFrame.setVisible(true);
	}

}