package com.bily.four;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestCal extends JFrame{
	private JButton addButton = new JButton("Add");
	private JButton subButton = new JButton("Subtract");
	private JButton mulButton = new JButton("Multiply");
	private JButton divButton = new JButton("Divide");
	
	private JTextField num1Field = new JTextField();
	private JTextField num2Field = new JTextField();
	private JTextField resultField = new JTextField();
	
	public TestCal(){
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(new JLabel("Number 1"));
		p1.add(num1Field);
		p1.add(new JLabel("Number 2"));
		p1.add(num2Field);
		p1.add(new JLabel("Result"));
		p1.add(resultField);
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(addButton);
		p2.add(subButton);
		p2.add(mulButton);
		p2.add(divButton);
		
		add(p1);
		add(p2);
		
		
	}
	public static void main(String[] args) {
		

	}
	
}
