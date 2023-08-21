package com.raghib.collection.listsetmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 There are following ways to compare two ArrayList in Java:
Java equals() method
Java removeAll() method
Java retainAll() method
Java ArrayList.contains() method
Java Stream interface 
 */
public class ListContentComparison3 {
	
	public static void m1() {
		System.out.println("m1() - equals method");
		
		// first array list
		ArrayList<String> firstList = new ArrayList<String>();
		// adds elements to the arraylist
		firstList.add("Apple");
		firstList.add("Pears");
		firstList.add("Guava");
		firstList.add("Mango");
		System.out.println("First array list: ");
		System.out.println(firstList);
		
		// second array list
		List<String> secondList = new ArrayList<String>();
		// adds elements to the arraylist
		secondList.add("Apple");
		secondList.add("Pears");
		secondList.add("Guava");
		secondList.add("Mango");
		System.out.println("Second array list: ");
		System.out.println(secondList);
		
		// comparing both lists
		boolean boolval = firstList.equals(secondList); // returns true because lists are equal
		System.out.println(boolval);
		// adding another element in the second list
		secondList.add("Papaya");
		// again comparing both lists
		System.out.println("After adding one new element at Second array list: ");
		System.out.println(secondList);
		boolean bool = firstList.equals(secondList); // returns false because lists are not equal
		System.out.println(bool);
	}

	public static void m2() {
		System.out.println("m2() - removeAll method");
		
		// first array list
		ArrayList<String> firstList = new ArrayList<String>();
		// adds elements to the arraylist
		firstList.add("Apple");
		firstList.add("Pears");
		firstList.add("Guava");
		firstList.add("Mango");
		System.out.println("First array list: ");
		System.out.println(firstList);
		
		// second array list
		List<String> secondList = new ArrayList<String>();
		// adds elements to the arraylist
		secondList.add("Apple");
		secondList.add("Pears");
		secondList.add("Guava");
		secondList.add("Mango");
		System.out.println("Second array list: ");
		System.out.println(secondList);
		
		// comparing both lists
		boolean boolval = secondList.removeAll(firstList);	// returns true because lists are equal
		if (boolval) {
			System.out.println("Both list are equal!");
		} else {
			System.out.println("Both list are not equal!");
		}
		// adding another element in the second list
		secondList.add("Papaya");
		// again comparing both lists
		System.out.println("After adding one new element at Second array list: ");
		System.out.println(secondList);
		boolean bool = firstList.removeAll(secondList); // returns false because lists are not equal
		if (bool) {
			System.out.println("Both list are equal!");
		} else {
			System.out.println("Both list are not equal!");
		}
	}

	public static void UncommonElementOfTheFirstList() {
		System.out.println("UncommonElementOfTheFirstList() - removeAll method");
		// first array list
		ArrayList<Integer> firstList = new ArrayList<Integer>(Arrays.asList(12, 4, 67, 90, 34));
		System.out.println("First array list: ");
		System.out.println(firstList);
		// second array list
		List<Integer> secondList = new ArrayList<Integer>(Arrays.asList(12, 4, 67, 0, 34));
		System.out.println("Second array list: ");
		System.out.println(secondList);

		// returns the Un-common elements first list
		firstList.removeAll(secondList);
		System.out.println("Un-common element of the first list: ");
		System.out.println(firstList);
	}
	
	public static void UncommonElementOfTheSecondList() {
		System.out.println("UncommonElementOfTheSecondList() - removeAll method");
		// first array list
		ArrayList<Integer> firstList = new ArrayList<Integer>(Arrays.asList(12, 4, 67, 90, 34));
		System.out.println("First array list: ");
		System.out.println(firstList);
		// second array list
		List<Integer> secondList = new ArrayList<Integer>(Arrays.asList(12, 4, 67, 0, 34));
		System.out.println("Second array list: ");
		System.out.println(secondList);
		
		// returns the Un-common elements second list
		secondList.removeAll(firstList);
		System.out.println("Un-common element of the second list: ");
		System.out.println(secondList);
	}
	
	public static void m4() {
		System.out.println("m4() - retainAll method");
		// first arraylist
		ArrayList<String> firstList = new ArrayList<String>(Arrays.asList("M", "W", "J", "K", "T"));
		System.out.println("First arraylist: ");
		System.out.println(firstList);
		// second arraylist
		List<String> secondList = new ArrayList<String>(Arrays.asList("M", "W", "E", "K", "T"));
		System.out.println("Second arraylist: ");
		System.out.println(secondList);
		// returns the common elements in both list
		secondList.retainAll(firstList);
		System.out.println("Common elements in both list: ");
		System.out.println(secondList);
	}

	public static void m5() {
		System.out.println("m5() - contains method");
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("A");
		al1.add("B");
		al1.add("C");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("A");
		al2.add("Y");

		for (String str : al1) {
			boolean b = al2.contains(str);
			if (b == true) {
				System.out.println(str);
			}
		}
	}
	
	public static void m6() {
		System.out.println("m6() - Stream & Contains");
		ArrayList<String> firstList = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go"));
		System.out.println("First List: " + firstList);
		ArrayList<String> secondList = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go", "Perl"));
		System.out.println("Second List: " + secondList);
		// Finds common elements
		System.out.print(
				"Common elements: " + firstList.stream().filter(secondList::contains).collect(Collectors.toList()));
		System.out.println("");
	}
	
	public static void main(String[] args) {
//		m1();
//		m2();
//		UncommonElementOfTheFirstList();
//		UncommonElementOfTheSecondList();
//		m4();
		m5();
		m6();
	}
}
