package com.bily.four;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;


public class TestCal extends JFrame{
	private JButton addButton = new JButton("Add");
	private JButton subButton = new JButton("Subtract");
	private JButton mulButton = new JButton("Multiply");
	private JButton divButton = new JButton("Divide");
	
	private JTextField num1Field = new JTextField(5);
	private JTextField num2Field = new JTextField(5);
	private JTextField resultField = new JTextField(10);
	
	public TestCal(){
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(new JLabel("Number 1"));
		p1.add(num1Field);
		p1.add(new JLabel("Number 2"));
		p1.add(num2Field);
		p1.add(new JLabel("Result"));
		p1.add(resultField);
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p2.add(addButton);
		p2.add(subButton);
		p2.add(mulButton);
		p2.add(divButton);
		
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		
		Listener listener = new Listener();
		addButton.addActionListener(listener);
		subButton.addActionListener(listener);
		mulButton.addActionListener(listener);
		divButton.addActionListener(listener);
	}
	
	public static void main(String[] args) {
		
		TestCal frame = new TestCal();
		frame.setTitle("¼ÆËãÆ÷");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	class Listener implements ActionListener{
		private double num1;
		private double num2;

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (num1Field.getText() != null && num2Field.getText() != null) {
				num1 = Double.parseDouble(num1Field.getText());
				num2 = Double.parseDouble(num2Field.getText());
			} else {
				num1 = num2 = 0.0;
			}
			
			if (e.getSource() == addButton) {
				resultField.setText(String.format("%.2f", num1 + num2));
			} else if (e.getSource() == subButton) {
				resultField.setText(String.format("%.2f", num1 - num2));
			} else if (e.getSource() == mulButton) {
				resultField.setText(String.format("%.2f", num1 * num2));
			} else if (e.getSource() == divButton) {
				if (num2 != 0) {
					resultField.setText(String.format("%.2f", num1 / num2));					
				}
			}
			
		}
	}
}
