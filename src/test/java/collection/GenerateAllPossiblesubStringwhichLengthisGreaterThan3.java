package collection;

public class GenerateAllPossiblesubStringwhichLengthisGreaterThan3 {
	public static void main(String[] args) {
		String s = "sum";
		if(s.length()>3) {
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i + 4; j <= s.length(); j++) 
			{
				
				System.out.print(s.substring(i, j) + " ");

			}
				

		}
	}
		else {
            System.out.print("Not possible to generate substrings with length > 3");
        }

	}
}