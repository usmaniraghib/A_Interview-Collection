package com.raghib.collection.listsetmap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P2_PrintSetCollectionValue {

	public static void printSetValue() {
		Set<String> arrset = new HashSet<String>();
		arrset.add("Sunday");
		arrset.add("Monday");
		arrset.add("Tuesday");
		arrset.add("Wednesday");
		arrset.add("Thursday");
		arrset.add("Friday");
		arrset.add("Saturday");

		// Direct
		System.out.println("Direct");
		System.out.println("Set Value : " + arrset);

		// using for loop
		System.out.println("\nUsing For Loop");
		// Convert set to an array
		String[] stringArray = arrset.toArray(new String[arrset.size()]);
		// Retrieving set values using a normal for loop
		for (int i = 0; i < stringArray.length; i++) {
			String value = stringArray[i];
			System.out.println(value);
		}

		// using for-each loop
		System.out.println("\nUsing for-each loop"); // Java-5 Feature
		for (String str : arrset) {
			System.out.println(str);
		}

		// using iterator
		System.out.println("\nUsing Iterator");
		Iterator<String> itr = arrset.iterator();
		while (itr.hasNext()) {
			String obj = itr.next();
			System.out.println(obj);
		}

		// using lambda expression
		System.out.println("\nUsing Lambda Expression");
		arrset.forEach(l -> System.out.println(l));

		// using method reference expression
		System.out.println("\nUsing Method Reference");
		arrset.forEach(System.out::println);
		
		System.out.println("\nUsing Stream");
        // Get the stream
        Stream<Set<String>> stream = Stream.of(arrset); 
        // Print the stream
        System.out.println(stream.collect(Collectors.toList()));
	}

	public static void main(String[] args) {
		printSetValue();
	}
}
