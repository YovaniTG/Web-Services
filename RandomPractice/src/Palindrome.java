import java.util.HashMap;
import java.util.Map;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// palinnilap
		// first && last char not equal
		String word = "lell";
		String word2 = "aaabb";

		System.out.println("Es palindromo? " + word + " " + checkPalindromeWord(word));
		System.out.println("Es palindromo? " + word2 + " " + canWordBePalindrome(word2));
	}

	public static boolean checkPalindromeWord(String word) {

		char[] wordArray = word.toCharArray();
		int n = 1;

		for (int i = 0; i < wordArray.length / 2; i++) {
			if (wordArray[i] != wordArray[wordArray.length - n]) {
				return false;
			}
			n++;
		}
		return true;
	}

	public static boolean canWordBePalindrome(String word) {

		char[] wordArray = word.toCharArray();
		Map<Character, Integer> wordMap = new HashMap<>();
		int OddCountLetter = 0;

		if (wordArray == null) {
			return false;
		} else if (wordArray.length == 1) {// || wordArray.length == 2
			return true;
		}

		for (char c : wordArray) {
			System.out.println(c);
			if (wordMap.containsKey(c)) {

				wordMap.put(c, wordMap.get(c) + 1);
				
			} else {
				wordMap.put(c, 1);
			}

		}
		// Max. 1 unique character
		// Remaining characters must have pair value count
		for (int countPerLetter : wordMap.values()) {
			// System.out.println(countPerLetter);
			if ((countPerLetter % 2) != 0) {

				if (OddCountLetter > 1) {
					return false;
				}
				++OddCountLetter;
			}
		}
		return true;
	}
}
