package com.raghib.collection.listsetmap;

import java.util.ArrayList;
import java.util.List;

public class ListContentComparison1 {
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
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(1);
        list2.add(2);
        list2.add(3);

        list3.add(1);
        list3.add(2);
        list3.add(4);
        
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);        

        System.out.println("list1 content equals list2: " + contentEquals(list1, list2)); // true
        System.out.println("list1 content equals list3: " + contentEquals(list1, list3)); // false
        System.out.println("list1 content equals list4: " + contentEquals(list1, list4)); // false
    }
}
