package com.raghib.map;

import java.util.*;

/**
 * REFERENCE:-
 * https://www.youtube.com/watch?v=UaRbZqAsoco
 */

//Write a program to print number of words in string.
//Write a program to print each character count in string.

/**
*
 * Input: 
findDuplicateWord("I am am learning java java");
findDuplicateCharacter("javaj2ee");
 
 * Output:
The word java appread 2 times.
The word I appread 1 times.
The word learning appread 1 times.
The word am appread 2 times.
{a=2, 2=1, e=2, v=1, j=2}
*/ 

public class DuplicateString {

	public static void main(String[] args) {
		findDuplicateWord("I am am learning java java");
		findDuplicateCharacter("javaj2ee");

	}
	
	static void findDuplicateWord(String string) {
		//FOR STORING
		String[] s = string.split(" ");
		Map<String,Integer> hm = new HashMap<String, Integer>();
		
		for(String key : s) {
			if(hm.get(key) != null) {
				hm.put(key, hm.get(key)+1);
			} else {
				hm.put(key, 1);
			}
		}
		
		//FOR RETRIEVING
		Iterator<String> itr = hm.keySet().iterator();
		while(itr.hasNext()) {
			String result = itr.next();
			if(hm.get(result) >= 1) {
				System.out.println("The word "+result+" appread "+hm.get(result)+" times.");
			}
		}
	}

	static void findDuplicateCharacter(String string) {
		Map<Character,Integer> hm = new HashMap<Character, Integer>();
		
		for(int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			
			if(hm.get(c) != null) {
				hm.put(c, hm.get(c)+1);
			} else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		
	}
}
