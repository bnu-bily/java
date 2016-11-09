package com.bily.encryptiontool;





import java.awt.BorderLayout;
import java.awt.Button;
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
		
		JPanel mainPanel = new JPanel(new GridLayout(5,1));
		
		JTextField infilePath = new JTextField(60);
		JButton addFile = new JButton(".....");
		JPanel addFilePanel = new JPanel();
		addFilePanel.add(new JLabel("��Ӽ����ļ��� "));
		addFilePanel.add(infilePath);
		addFilePanel.add(addFile);
		mainPanel.add(addFilePanel);
		
		
		JTextArea encrypTextArea = new JTextArea(4, 60);
		JPanel encrytJPanel = new JPanel();
		encrytJPanel.add(new JLabel("����: "));
		encrytJPanel.add(encrypTextArea);
		mainPanel.add(encrytJPanel);
		
		JPanel p1 = new JPanel();//
		JPanel desPanel = new JPanel(new GridLayout(2,2));
		desPanel.add(new JLabel("Des ��Կ��"));
		JTextField desKey = new JTextField(30);
		desPanel.add(desKey);
		JButton desEncrypt = new JButton("����");
		JButton desDencrypt = new JButton("����");
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
		JTextArea dencrypTextArea = new JTextArea(4, 60);
		dencrytJPanel.add(new JLabel("����: "));
		dencrytJPanel.add(dencrypTextArea);
		mainPanel.add(dencrytJPanel);
		
		JTextField outfilePath = new JTextField(60);
		JPanel outFilePanel = new JPanel();
		outFilePanel.add(new JLabel("�ļ����·���� "));
		outFilePanel.add(outfilePath);
		mainPanel.add(outFilePanel);
		
		add(mainPanel);
		
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
