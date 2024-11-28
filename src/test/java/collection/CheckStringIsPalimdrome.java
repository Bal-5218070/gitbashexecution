package collection;

public class CheckStringIsPalimdrome {
public static void main(String[] args) {
	String s="rararararar";
	if (checkPalimdrome(s)) { // Pass the string to the method
        System.out.println("String is palindrome");
    } else {
        System.out.println("String is not palindrome");
    }

	
}
	
public static	Boolean checkPalimdrome(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			rev +=ch;
		}
		
		if(s.equalsIgnoreCase(rev)) {
			System.out.println(rev);
			return true;
		}
		
	return false;
}
}
