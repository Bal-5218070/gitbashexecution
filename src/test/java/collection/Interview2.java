package collection;

public class Interview2 {
public static void main(String[] args) {
	String s1="daimler";
	//Input : daimler
	//Output : DaImLeR
	 
	        
	        String output = "";

	        for (int i = 0; i < s1.length(); i++) {
	            char c = s1.charAt(i);
	            if (i % 2 == 0) {
	                output =output+ Character.toUpperCase(c);
	            } else {
	                output += Character.toLowerCase(c);
	            }
	        }

	        System.out.println("Input : " + s1);
	        System.out.println("Output : " + output);
	    }


}

