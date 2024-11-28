package collection;

public class ReversestringwithoutReversingspace {
public static void main(String[] args) {
	String s="I Am String";
	String rev="";
	String s1=s.replace(" ","");
	System.out.println(s1);
	int last =s1.length()-1;
	
	
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==' ') {
			rev =rev+s.charAt(i);
		}else {
			rev=rev+s1.charAt(last);
			last--;
		}
	}
	System.out.println(rev);
}
}
