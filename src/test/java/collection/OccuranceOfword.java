package collection;

import java.util.LinkedHashMap;

public class OccuranceOfword {
	public static void main(String[] args) {
		String s ="my name is bal krishna sharma son of avdhesh sharma";
		String [] arr=s.split(" ");
		LinkedHashMap< String, Integer> map = new LinkedHashMap<String, Integer>();
		
		for(int i=0;i<arr.length;i++) {
		String	k=arr[i];
		
		if(map.containsKey(k)) {
			map.put(k, map.get(k)+1);
		}
		else
			map.put(k, 1);
		
		}
		
		System.out.println(map);
       
			
		
    }
}


