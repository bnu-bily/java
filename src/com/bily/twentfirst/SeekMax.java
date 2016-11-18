package com.bily.twentfirst;


/**
 * 
 * @author bily
 *21.5 返回数组中最大元素
 */
public class SeekMax {

	
	public static void main(String[] args) {
		Integer[] integer = {85, 8, 69, 8, 96, 12};
		System.out.println(max(integer));
		Double[] doubles = {88.5,96.0,863.1};
		System.out.println(max(doubles));
	}
	
	public static <T extends Comparable<T>> T max(T[] list){
		if (list == null) {
			return null;
		}
		T temp  = list[0];
		for (int i = 0; i < list.length; i++) {
			if (list[i].compareTo(temp) > 0) {
				temp = list[i];
			}
		}
		return temp;
	}
}
