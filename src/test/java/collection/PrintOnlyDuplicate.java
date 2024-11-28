package collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrintOnlyDuplicate {
	public static void main(String[] args) {
		String s = "aaabbbbabccdef";
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			
			}
			else
				map.put(ch, 1);
		}
		System.out.println(map);
		
		for(Map.Entry<Character, Integer> hash:map.entrySet()) {
			
			if(hash.getValue()>1) {
				System.out.println(hash.getKey());
			}
			
		}
		
		
		
		
		
		
		
	}	
		
		
		
		
		
		/*
		 * LinkedHashMap<Character, Integer > map =new LinkedHashMap<Character,
		 * Integer>(); // linked hash map maintain insertion order for(int
		 * i=0;i<s.length();i++) { char ch =s.charAt(i);
		 *//**
			 * containskey check whether the character is present inside the map
			 *//*
				 * if(map.containsKey(ch)) {
				 * 
				 * //increased the count by one map.put(ch, map.get(ch)+1); } else //add the
				 * character to map and initialize the count to 1 map.put(ch, 1); } //access the
				 * key value from the pair for(Map.Entry<Character, Integer>
				 * hash:map.entrySet()) { if(hash.getValue()>1) {
				 * System.out.println(hash.getKey()); } }
				 */

	//}
}
