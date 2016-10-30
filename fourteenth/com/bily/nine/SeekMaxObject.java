package com.bily.nine;
/**
 * 找出最大的对象,所有的对象都是实现Comparable的实例
 * @author Bily
 *
 */
public class SeekMaxObject {

	public static void main(String[] args) {
		Integer[] intArray = {new Integer(2), new Integer(5), new Integer(1), new Integer(18), new Integer(7)};
		String[] stringArray = {"aaa", "ppp", "ddd", "ffff", "ii", "ggz"};
		System.out.println(max(intArray));
		System.out.println(max(stringArray));
	}
	
	public static Object max(Comparable[] a){
		Comparable currentMax = a[0];
		for (int i = 0; i < a.length; i++) {
			if (currentMax.compareTo(a[i]) < 0) {
				currentMax = a[i];
			}
		}
		return currentMax;
	}
}
