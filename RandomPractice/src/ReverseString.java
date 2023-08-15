
public class ReverseString {

	// Since String is Immutable in Java, it's not possible to reverse the same
	// String

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "d'md!0sas@@(22";
		char[] charArray = str.toCharArray();

		System.out.println(charArray);
		reverseString(charArray);
		String revStr = new String(charArray);
		System.out.println(revStr);
		////////////////////////////////////////

		String s = "Techie Delight";

		// using simple for loop
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
	}

	public static void reverseString(char[] stringToReverse) {

		int endStr = stringToReverse.length - 1;
		int startStr = 0;
		char tempStr;

		while (startStr < endStr) {
			if (!Character.isAlphabetic(stringToReverse[startStr]) || Character.isDigit(stringToReverse[startStr])) {
				startStr++;
			} else if (!Character.isAlphabetic(stringToReverse[endStr]) || Character.isDigit(stringToReverse[endStr])) {
				endStr--;
			}

			tempStr = stringToReverse[startStr];
			stringToReverse[startStr] = stringToReverse[endStr];
			stringToReverse[endStr] = tempStr;
			startStr++;
			endStr--;
		}

	}

	public String reverseTheOrderOfWords(String sentence) {
		if (sentence == null) {
			return null;
		}

		StringBuilder output = new StringBuilder();
		String[] words = sentence.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {
			output.append(words[i] + " ");
		}

		return output.toString().trim();
	}

}
