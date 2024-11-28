package collection;

public class FrequencyofCharacter {
	public static void main(String[] args) {
		// input :- String s="aaabbc";
		// Output : a3b2c1
		String s = "aaabbc";
      int []a =new int[256];
		
		for (int i = 0; i < s.length(); i++) {
			a[s.charAt(i)]++;
		}
		for (int i = 0; i < a.length; i++) {
                  if(a[i]>0&&i!=32)
                  {
	System.out.println((char)i +"is "+a[i]+"times ");
             }
		}
	}
}
