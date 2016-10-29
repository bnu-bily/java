package com.bily.seven;

import com.bily.eleventh.GeometricObject;

/**
 * 14.7 ��дһ��Octagon����չGeometricObject�ಢʵ��Comparable Cloneable�ӿ�
 * ����8���ΰ����ߵı߳�����ȣ������������ʹ������Ĺ�ʽ����
 *  ���  = ��2 + 4/sqrt(2)�� * �߳�  * �߳�
 * @author bily
 *����һ���߳�Ϊ5��Octagon������ʾ����ͱ߳���ʹ��clone��������һ���¶���ʹ��compareTo�����Ƚ���������
 */
public class Octagon extends GeometricObject implements Comparable, Cloneable{
	private double side;
	
	public Octagon(double side) throws RuntimeException{
		if (side > 0) {
			this.side = side;
		} else {
			throw new RuntimeException();
		}
	}
	
	public double getSide(){
		return side;
	}
	public double getArea(){
		double temp = 2 + 4 / Math.sqrt(2);
		return temp * side * side;
	}
	
	public double getPerimeter(){
		return side * 8;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public int compareTo(Object obj){
		if (getArea() > ((Octagon)obj).getArea()) {
			return 1;
		} else if (getArea() < ((Octagon)obj).getArea()){
			return -1;
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon oct = new Octagon(5);
		System.out.println("�߳�Ϊ5�İ˱������Ϊ�� " + oct.getArea());
		System.out.println("�߳�Ϊ5�İ˱����ܳ�Ϊ�� " + oct.getPerimeter());
		
		Octagon oct1 = (Octagon)oct.clone();
		System.out.println(oct.compareTo(oct1));
	}


}
