package com.raghib.collection.listsetmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class P3_PrintMapCollectionValue {

	public static void printMapValue() {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("A", 1);
		hm.put("B", 2);
		hm.put("C", 3);

		System.out.println("Direct");
		System.out.println("Map Value : " +hm);

		System.out.println("\nUsing Iterator");
		Iterator<?> it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<?, ?> entry = (Map.Entry<?, ?>) it.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("\nUsing entrySet()");
		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("\nUsing keySet()");
		for (String key : hm.keySet())
			System.out.println(key +" -> " +hm.get(key));

		System.out.println("\nUsing lambda");
		hm.forEach((k, v) -> System.out.println(k + " : " + v));

		System.out.println("\nUsing Stream");
		hm
		.entrySet()
		.stream()
		.map(Map.Entry::getKey);
		hm.forEach((key, value) -> System.out.println(key + " : " + value));
	}

	public static void main(String[] args) {
		printMapValue();
	}
}
