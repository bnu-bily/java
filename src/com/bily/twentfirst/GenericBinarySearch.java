package com.bily.twentfirst;
/**
 * 21.2 二分查找法
 * @author bily
 *
 */
public class GenericBinarySearch {

	public static void main(String[] args) {
		Integer[] integers = {4, 8, 9, 12, 56, 888, 6996, 52222};
		Double[] doubles = {4.1, 8.1, 9.5, 12.2, 56.9, 888.8, 6996.14, 52222.47};
		System.out.println(binarySearch(doubles, 12.2));
		System.out.println(binarySearch(integers, 888));
	}
	
	public static <T extends Comparable<T>> int binarySearch(T[] list,T key){
		if (list == null || key == null) {
			return -1;
		}
		int start = 0;
		int end = list.length - 1;
		
		while(start <= end){
			if (list[(start + end) / 2].compareTo(key) == 0) {
				return (start + end) / 2;
			}
			if (list[(start + end) / 2].compareTo(key) > 0) {
				end = ((start + end) / 2) - 1;
			}
			if (list[(start + end) / 2].compareTo(key) < 0) {
				start = ((start + end) / 2) + 1;
			}
		}
		return -1;
	}
}
