package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program3 {
public static void main(String[] args) {
	Collection c1= new ArrayList();
	c1.add("sharma");
	c1.add(20);
	c1.add("kishore");
	c1.add(8);
	c1.add(null);
	c1.add(true);
	System.out.println(c1);
	/*
	 * Object[] k = c1.toArray();
	 * 
	 * for(int i=0;i<k.length;i++) { System.out.println(k[i]); if(!(k[i] instanceof
	 * Integer)) { c1.remove(k[i]); } } System.out.println(c1);
	 */
	Iterator itr = c1.iterator();
	while(itr.hasNext()) {
		Object k = itr.next();
		
		if(!(k instanceof Integer)) {
			itr.remove();
	}
	 
	/*
	 * for(Object o1:c1) { if(!(o1 instanceof Integer)) c1.remove(o1); }
	 */
	//System.out.println(c1);
}
	System.out.println(c1);
}
}

