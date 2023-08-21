package com.raghib.map;

import java.util.HashMap;
import java.util.Map;

/*
REFERENCE :-
https://prepinsta.com/java-program/find-non-repeating-elements-in-an-array/
 */

//Print non-repeating elements of array.

/**
*
 * Input: int arr[] = new int[] { 10, 40, 50, 20, 10, 20, 30, 10 };
 * Output:
Element 50
Element 40
Element 30
*/ 

public class NonRepeatingElements {

	static void countFreq(int arr[], int n) {
		Map<Integer, Integer> mp = new HashMap<>();
		// Traverse through array elements and
		// count frequencies
		for (int i = 0; i < n; i++) {
			if (mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			} else {
				mp.put(arr[i], 1);
			}
		}
		
		//1 Traverse through map and print frequencies
		for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
			if (entry.getValue() == 1)
				System.out.println(entry.getKey() + " ");				
		}
		
		//2 Traverse through stream and print frequencies
		int count = 1;
		mp
		.entrySet()
		.stream()
		.filter(entry -> entry.getValue() == count)
		.map(Map.Entry::getKey)
				.forEach(key -> System.out.println("Element " + key));
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 10, 40, 50, 20, 10, 20, 30, 10 };
		int n = arr.length;
		countFreq(arr, n);
	}

}
