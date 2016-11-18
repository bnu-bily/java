package com.bily.twentfirst;
/**
 * 21.4 ≤Â»Î≈≈–Ú
 * @author bily
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		Integer[] integers = {2, 1, 5, 69, 8};
		InsertionSort(integers);
		for (int i = 0; i < integers.length; i++) {
			System.out.println(integers[i] + " ");			
		}
	}

	public static <T extends Comparable<T>> void InsertionSort(T[] list){
		if (list == null) {
			return;
		}
		T temp;
		int j;
		boolean flag = false;
		for (int i = 0; i < list.length - 1; i++) {
			j = i;
			temp = list[j + 1];
			for (; 0 < j ; j--) {
				if (temp.compareTo(list[j]) > 0) {
					break;
				} 
				flag = true;
				list[j + 1] = list[j];
			}
			if (flag) {
				list[j] = temp;				
			}
		}
		
	}
}
