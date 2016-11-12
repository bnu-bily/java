package com.bily.encryptiontool;





import java.awt.GridLayout;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	private JTextField desKey = new JTextField(15);
	private JTextField aesKey = new JTextField(15);
	private JTextArea outTextArea = new JTextArea(4, 60);
	private JTextField inFilePath = new JTextField(60);
	private JTextField outFilePath = new JTextField(60);
	private String encryption;
	
	public MainFrame(){
		
		JPanel mainPanel = new JPanel(new GridLayout(5,1));
		
		
		JButton addFile = new JButton(".....");
		JPanel addFilePanel = new JPanel();
		addFilePanel.add(new JLabel("添加加密文件： "));
		addFilePanel.add(inFilePath);
		addFilePanel.add(addFile);
		mainPanel.add(addFilePanel);
		
		
		
		JPanel encrytJPanel = new JPanel();
		encrytJPanel.add(new JLabel("输入: "));
		encrytJPanel.add(inTextArea);
		mainPanel.add(encrytJPanel);
		
		JPanel p1 = new JPanel();//
		JPanel desPanel = new JPanel(new GridLayout(2,2));
		desPanel.add(new JLabel("DES 密钥："));
		
		desPanel.add(desKey);
		JButton desEncrypt = new JButton("des加密");
		JButton desDencrypt = new JButton("des解密");
		desPanel.add(desEncrypt);
		desPanel.add(desDencrypt);
		JPanel aesPanel = new JPanel(new GridLayout(2,2));//
		aesPanel.add(new JLabel("AES 密钥："));
		aesPanel.add(aesKey);
		JButton aesEncrypt = new JButton("AES加密");//
		JButton aesDecrypt = new JButton("AES解密");//
		aesPanel.add(aesEncrypt);//
		aesPanel.add(aesDecrypt);//
		p1.add(desPanel);
		p1.add(aesPanel);
		mainPanel.add(p1);
		
		JPanel dencrytJPanel = new JPanel();
		
		dencrytJPanel.add(new JLabel("输出: "));
		dencrytJPanel.add(outTextArea);
		mainPanel.add(dencrytJPanel);
		
		
		JPanel outFilePanel = new JPanel();
		outFilePanel.add(new JLabel("文件输出路径： "));
		outFilePanel.add(outFilePath);
		mainPanel.add(outFilePanel);
		
		add(mainPanel);
		
		addFile.addActionListener(new AddFile());
		desEncrypt.addActionListener(new DESEncrypTextArea());
		aesEncrypt.addActionListener(new AESEncrypTextArea());
		desDencrypt.addActionListener(new DESDecrypTextArea());
		aesDecrypt.addActionListener(new AESDecrypTextArea());
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
			JFileChooser chooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter(null, "txt","dat");
			chooser.setFileFilter(filter);
			if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
				inFilePath.setText(chooser.getSelectedFile().toString());
				//outFilePath.setText("C:\\Users\\tool\\output.txt");
			}
		}
	}
	
	class DESEncrypTextArea implements ActionListener{
		private String data;
		private String key;
		
		@Override
		public void actionPerformed(ActionEvent e) {
			boolean tip = true;
			data = inTextArea.getText();
			key = desKey.getText();
			
			if (!data.equals("") && !key.equals("")) {
				try {
					outTextArea.setText(DesUtil.encrypt(data, key));
					tip = false;
				} catch (Exception e1) {		
					e1.printStackTrace();
				}
			}
			if (inFilePath.getText().equals("")) {
				if (tip) {
					JOptionPane.showMessageDialog(null, "未选择加密文件");					
				}
			} else {
				if (key.equals("")) {
					JOptionPane.showMessageDialog(null, "无秘钥");
				} else {
					try {
						String temp = outFilePath.getText();
						IOFile.writeFile(DesUtil.encrypt(IOFile.readFile(inFilePath.getText()), key), temp);
						JOptionPane.showMessageDialog(null, "已加密");
						
						} catch (Exception e2) {
							e2.printStackTrace();
						}
				}
			}
			
		}
	}
	
	class AESEncrypTextArea implements ActionListener{
		private String data;
		private String key;
		
		@Override
		public void actionPerformed(ActionEvent e) {
			boolean tip = true;
			data = inTextArea.getText();
			key = aesKey.getText();
			
			if (!data.equals("") && !key.equals("")) {
				try {
					outTextArea.setText(AesUtil.encrypt(data, key));
					tip = false;
				} catch (Exception e1) {		
					e1.printStackTrace();
				}
			}
			if (inFilePath.getText().equals("")) {
				if (tip) {
					JOptionPane.showMessageDialog(null, "未选择加密文件");					
				}
			} else {
				if (key.equals("")) {
					JOptionPane.showMessageDialog(null, "无秘钥");
				} else {
					try {
						String temp = outFilePath.getText();
						IOFile.writeFile(AesUtil.encrypt(IOFile.readFile(inFilePath.getText()), key), temp);
						JOptionPane.showMessageDialog(null, "已加密");
						
						} catch (Exception e2) {
							e2.printStackTrace();
						}
				}
			}
			
		}
	}
	
	class DESDecrypTextArea implements ActionListener{
		private String data;
		private String key;
		
		@Override
		public void actionPerformed(ActionEvent e) {
			boolean tip = true;
			data = inTextArea.getText();
			key = desKey.getText();
			
			if (!data.equals("") && !key.equals("")) {
				try {
					outTextArea.setText(DesUtil.decrypt(data, key));
					tip = false;
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			
			if (inFilePath.getText().equals("")) {
				if (tip) {
					JOptionPane.showMessageDialog(null, "未选择解密文件");
					tip = false;
				}
			} else {
				if (key.equals("")) {
					JOptionPane.showMessageDialog(null, "无秘钥");
				} else {
					try {
						
						IOFile.writeFile(DesUtil.decrypt(IOFile.readFile(inFilePath.getText()), key), outFilePath.getText());
						JOptionPane.showMessageDialog(null, "已解密");
						
				} catch (Exception e2) {
						e2.printStackTrace();
				}
				}
			} 			
		}
	}
	
	class AESDecrypTextArea implements ActionListener{
		private String data;
		private String key;
		
		@Override
		public void actionPerformed(ActionEvent e) {
			boolean tip = true;
			data = inTextArea.getText();
			key = aesKey.getText();
			
			if (!data.equals("") && !key.equals("")) {
				try {
					outTextArea.setText(AesUtil.decrypt(data, key));
					tip = false;
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
			
			if (inFilePath.getText().equals("")) {
				if (tip) {
					JOptionPane.showMessageDialog(null, "未选择解密文件");
					tip = false;
				}
			} else {
				if (key.equals("")) {
					JOptionPane.showMessageDialog(null, "无秘钥");
				} else {
					try {
						
						IOFile.writeFile(AesUtil.decrypt(IOFile.readFile(inFilePath.getText()), key), outFilePath.getText());
						JOptionPane.showMessageDialog(null, "已解密");
						
				} catch (Exception e2) {
						e2.printStackTrace();
				}
				}
			} 			
		}
	}
}
