package collection;

import java.util.*;

public class Program5 {
	public static void main(String[] args) {

		Collection<Integer> c1 = new ArrayList<>();
		c1.add(20);
		c1.add(30);
		c1.add(70);
		c1.add(67);

		 Iterator<Integer> itr = c1.iterator();
			/*
			 * int sum = 0; while (itr.hasNext()) { Integer k = itr.next(); sum=sum+k; }
			 * System.out.println("Sum is: " + sum);
			 */
		
		  System.out.println(itr.hasNext());
		  System.out.println(itr.next());
			
			  System.out.println(itr.hasNext()); System.out.println(itr.next());
			  System.out.println(itr.hasNext()); System.out.println(itr.next());
			  System.out.println(itr.hasNext()); System.out.println(itr.next());
			  System.out.println(itr.hasNext()); System.out.println(itr.next());
			  System.out.println(itr.hasNext()); System.out.println(itr.next());
			 
	}
}
