package collection;
import java.util.*;
public class Program1 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		Collection c2=new ArrayList();
		System.out.println(c1);
		c1.add(40);
		c1.add(60);
		c1.add(53.8);
		c1.add("mohan");
		c1.add(null);
		System.out.println(c1);
		System.out.println(c1.add("balkrishna"));
		System.out.println(c1);
		c2.add("sharma");
		c2.add(70.8);
		System.out.println(c2);
		c2.addAll(c1);
		System.out.println(c2);
		c2.remove("sharma");
		System.out.println(c2);
		c2.retainAll(c1);
		System.out.println(c2);
		
		System.out.println(c2.size());
		
		}
}