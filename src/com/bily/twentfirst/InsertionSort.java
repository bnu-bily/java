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
		
		for (int i = 1; i < list.length; i++) {
			temp = list[i];			
			for (j = i - 1; 0 <= j &&  (temp.compareTo(list[j]) < 0); j--) {
				
				list[j + 1] = list[j];
			}		
			list[j + 1] = temp;					
		}
		
	}
}
