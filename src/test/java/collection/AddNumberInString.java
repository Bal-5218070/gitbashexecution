package collection;

public class AddNumberInString {
public static void main(String[] args) {
	String s="123@@@123@123";
	 int sum=0;
	 for(int i=0;i<s.length();i++) {
		 char ch=s.charAt(i);
			/*
			 * if(ch>='0'&&ch<='9') { sum=sum+ch-48; }
			 */
		 if(Character.isDigit(ch)) {
			 sum=sum+ ch-48;
					
		 }
	 }
	 System.out.println(sum);
}
}
