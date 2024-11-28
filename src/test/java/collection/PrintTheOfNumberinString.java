package collection;

public class PrintTheOfNumberinString {
public static void main(String[] args) {
	int sum=0;
	String s="179@qwe971****%971";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
//		if(Character.isDigit(ch)) {
//			sum=sum+ch-48;
//		}
		if(ch>='0'&&ch<='9') {
			sum=sum+ch-48;
		}
	}
	System.out.println(sum);
}
}
