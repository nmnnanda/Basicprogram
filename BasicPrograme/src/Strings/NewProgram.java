package Strings;
                                  // program to find the ovels in given string
public class NewProgram {
	
	public static int vowelCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "Encyclopedia";
		int vowelCount = NewProgram.vowelCount(str);
		System.out.println("The number of vowels in the input string is " + vowelCount);
	}

}
