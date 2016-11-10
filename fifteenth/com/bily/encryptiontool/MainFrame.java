package com.bily.encryptiontool;





import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;



public class MainFrame extends JFrame{
	private JTextArea inTextArea = new JTextArea(4, 60);
	private JTextField desKey = new JTextField(30);
	private JTextArea outTextArea = new JTextArea(4, 60);
	private JTextField inFilePath = new JTextField(60);
	private JTextField outFilePath = new JTextField(60);
	private String encryption;
	
	public MainFrame(){
		
		JPanel mainPanel = new JPanel(new GridLayout(5,1));
		
		
		JButton addFile = new JButton(".....");
		JPanel addFilePanel = new JPanel();
		addFilePanel.add(new JLabel("��Ӽ����ļ��� "));
		addFilePanel.add(inFilePath);
		addFilePanel.add(addFile);
		mainPanel.add(addFilePanel);
		
		
		
		JPanel encrytJPanel = new JPanel();
		encrytJPanel.add(new JLabel("����: "));
		encrytJPanel.add(inTextArea);
		mainPanel.add(encrytJPanel);
		
		JPanel p1 = new JPanel();//
		JPanel desPanel = new JPanel(new GridLayout(2,2));
		desPanel.add(new JLabel("Des ��Կ��"));
		
		desPanel.add(desKey);
		JButton desEncrypt = new JButton("des����");
		JButton desDencrypt = new JButton("des����");
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
		
		dencrytJPanel.add(new JLabel("���: "));
		dencrytJPanel.add(outTextArea);
		mainPanel.add(dencrytJPanel);
		
		
		JPanel outFilePanel = new JPanel();
		outFilePanel.add(new JLabel("�ļ����·���� "));
		outFilePanel.add(outFilePath);
		mainPanel.add(outFilePanel);
		
		add(mainPanel);
		
		addFile.addActionListener(new AddFile());
		desEncrypt.addActionListener(new EncrypTextArea());
		desDencrypt.addActionListener(new DecrypTextArea());
	}
	
	public static void main(String[] args) {
		MainFrame mainFrame = new MainFrame();
		mainFrame.setTitle("�ӽ���С����");
		mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.pack();
		mainFrame.setVisible(true);
	}

	class AddFile implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JFileChooser chooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter(null, "txt","dat");
			chooser.setFileFilter(filter);
			if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
				inFilePath.setText(chooser.getSelectedFile().toString());
			}
		}
	}
	
	class EncrypTextArea implements ActionListener{
		private String data;
		private String key;
		
		@Override
		public void actionPerformed(ActionEvent e) {
		
			data = inTextArea.getText();
			key = desKey.getText();
			
			if (!data.equals("") && !key.equals("")) {
				try {
					outTextArea.setText(DesUtil.encrypt(data, key));
				} catch (Exception e1) {		
					e1.printStackTrace();
				}
			}
			if (inFilePath.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "δѡ������ļ�");
			} else {
				if (key.equals("")) {
					JOptionPane.showMessageDialog(null, "����Կ");
				} else {
					try {
						
						IOFile.writeFile(DesUtil.encrypt(IOFile.readFile(inFilePath.getText()), key), outFilePath.getText());
						JOptionPane.showMessageDialog(null, "�Ѽ���");
						outFilePath.setText("");
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				}
			}
			
		}
	}
	
	class DecrypTextArea implements ActionListener{
		private String data;
		private String key;
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			data = inTextArea.getText();
			key = desKey.getText();
			
			if (!data.equals("") && !key.equals("")) {
				try {
					outTextArea.setText(DesUtil.decrypt(data, key));
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
			
			if (inFilePath.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "δѡ������ļ�");
			} else {
				if (key.equals("")) {
					JOptionPane.showMessageDialog(null, "����Կ");
				} else {
					try {
						
						IOFile.writeFile(DesUtil.decrypt(IOFile.readFile(inFilePath.getText()), key), outFilePath.getText());
						JOptionPane.showMessageDialog(null, "�ѽ���");
						outFilePath.setText("");
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				}
			} 			
		}
	}
	
}
