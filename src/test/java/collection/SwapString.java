package collection;

public class SwapString {
	public static void main(String[] args) {
		String input = "my name is Balkrishna";
		String[] word = input.split(" ");
		String temp = word[0];

		word[0] = word[word.length - 1];
		word[word.length - 1] = temp;

		for (String s : word) {
			System.out.print(s + " ");
		}
	}
}