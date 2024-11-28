package patternPrograming;

public class occurance {
	public static void main(String[] args) {
		String s="balkrishna";
		int[] a=new int[256];
		for(int i=0;i<s.length();i++) {
			a[s.charAt(i)]++;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>0&&i!=32) {
				System.out.println((char)i+" is: "+a[i]+" times!");
			}
		}
	}

}
 