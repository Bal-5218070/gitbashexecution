package collection;

public class FirstcharacterInUpperCase {
public static void main(String[] args) {
	String s="ram and shyam are gud frinds";
	String[] k=s.split("");
	for(int i=0;i<k.length;i++) {
		String s1=k[i];
		
		System.out.print(	Character.toUpperCase(s1.charAt(0))+s1.substring(1)+" ");
	}
	
}
}
