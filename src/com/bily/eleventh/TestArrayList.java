package com.bily.eleventh;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import com.bily.tenth.Circle2D;


/**
 * ����һ��ArrayList��Ȼ�������Ա������ һ��Date����һ���ַ�����һ��JFrame����һ��Circle����
 * Ȼ��ʹ��ѭ�����ö����toString������������ʾ���Ա������Ԫ��
 * 
 * @author Administrator
 *
 */
public class TestArrayList {

	public static void main(String[] args) throws Exception{
		ArrayList list = new ArrayList();
		list.add(new Date());
		list.add(new String("123456"));
		list.add(new JFrame());
		list.add(new Circle2D());
		
		for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
		}
	
	}

	

}
