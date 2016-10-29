package com.bily.seven;

import com.bily.eleventh.GeometricObject;

/**
 * 14.7 编写一个Octagon类扩展GeometricObject类并实现Comparable Cloneable接口
 * 假设8边形八条边的边长都相等，它的面积可以使用下面的公式计算
 *  面积  = （2 + 4/sqrt(2)） * 边长  * 边长
 * @author bily
 *创建一个边长为5的Octagon对象，显示面积和边长，使用clone方法创建一个新对象，使用compareTo方法比较两个对象
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
		System.out.println("边长为5的八边形面积为： " + oct.getArea());
		System.out.println("边长为5的八边形周长为： " + oct.getPerimeter());
		
		Octagon oct1 = (Octagon)oct.clone();
		System.out.println(oct.compareTo(oct1));
	}


}
