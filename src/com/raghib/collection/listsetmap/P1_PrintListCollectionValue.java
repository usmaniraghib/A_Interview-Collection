package com.raghib.collection.listsetmap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P1_PrintListCollectionValue {

	public static void printListValue() {
		ListIterator<String> litr = null;

		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("Sunday");
		arrlist.add("Monday");
		arrlist.add("Tuesday");
		arrlist.add("Wednesday");
		arrlist.add("Thursday");
		arrlist.add("Friday");
		arrlist.add("Saturday");
		
		// Direct
		System.out.println("Direct");
        System.out.println("List Value : "+arrlist);

		// using for loop
		System.out.println("\nUsing For Loop");
		for (int i = 0; i < arrlist.size(); i++) {
			System.out.println(arrlist.get(i));
		}

		// using for-each loop
		System.out.println("\nUsing for-each loop");
		for (String str : arrlist) {
			System.out.println(str);
		}

		// using iterator
		System.out.println("\nUsing Iterator");
		Iterator<String> itr = arrlist.iterator();
		while (itr.hasNext()) {
			String obj = itr.next();
			System.out.println(obj);
		}

		// Using list iterator
		litr = arrlist.listIterator();
		System.out.println("\nUsing ListIterator");
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		// using lambda expression
		System.out.println("\nUsing Lambda Expression");
		arrlist.forEach(l -> System.out.println(l));
		
		// using method reference expression
		System.out.println("\nUsing Method Reference");
        arrlist.forEach(System.out::println);
        
        System.out.println("\nUsing Stream");
        // Get the stream
        Stream<ArrayList<String>> stream = Stream.of(arrlist); 
        // Print the stream
        System.out.println(stream.collect(Collectors.toList()));
	}

	public static void main(String[] args) {
		printListValue();
	}
}
