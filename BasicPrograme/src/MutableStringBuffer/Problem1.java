package MutableStringBuffer;

	public class Problem1 {

		public static void main(String[] args) {
			StringBuffer sb = null;
			String str = "java is langu shgsd";
			String[] words = str.split(" ");
			for (int i = 0; i < words.length; i++) {
				sb = new StringBuffer(words[i]);
				sb.reverse();
				words[i] = sb.toString();
			}
			String reversedString = String.join(" ", words);
			System.out.println(reversedString);
		}

	}
