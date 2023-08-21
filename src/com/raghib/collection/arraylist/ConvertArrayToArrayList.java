package com.raghib.collection.arraylist;

/**
 * REFERENCE:
 * https://www.youtube.com/watch?v=87LxjcWR_KI
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		String str[] = {"Red","Green","Blue"};
		usingAsList(str);
		usingAddAll(str);
		usingForLoop(str);
	}

	public static void usingForLoop(String[] str) {
		List<String> al = new ArrayList<String>();
		for(String s : str) {
			al.add(s);
		}
		System.out.println(al);		
	}

	public static void usingAddAll(String[] str) {
		List<String> al = new ArrayList<String>();
		Collections.addAll(al, str);
		System.out.println(al);
	}

	public static void usingAsList(String[] str) {
		List<String> al = Arrays.asList(str);
		System.out.println(al);
	}

}
