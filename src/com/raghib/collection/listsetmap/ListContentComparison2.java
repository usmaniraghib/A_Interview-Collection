package com.raghib.collection.listsetmap;

import java.util.ArrayList;
import java.util.List;

public class ListContentComparison2 {
    public static boolean contentEquals(List<?> list1, List<?> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }

        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();

        list1.add("Apple");
        list1.add("Pears");
        list1.add("Guava");
        list1.add("Mango");

        list2.add("Apple");
        list2.add("Pears");
        list2.add("Guava");
        list2.add("Mango");

        list3.add("Apple");
        list3.add("Pears");
        list3.add("Guava");
        
        list4.add("Apple");
        list4.add("Pears");
        list4.add("Guava");
        list4.add("Mango1111111");

        System.out.println("list1 content equals list2: " + contentEquals(list1, list2)); // true
        System.out.println("list1 content equals list3: " + contentEquals(list1, list3)); // false
        System.out.println("list1 content equals list3: " + contentEquals(list1, list4)); // false
    }
}
