import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(reverseRecursively(""));
		// using Integer.parseInt
		int i = Integer.parseInt("123");
		// System.out.println("i: " + i);

		String price = "" + 123;

		// permutation("abc");

		String word = "Hola mundo!";

		String word2 = word.substring(0, 7) + word.substring(9 + 1, word.length());
		System.out.println(word2);
		// word.substring(0, i) + word.substring(i + 1, word.length()))
	}

	public static void printDuplicateCharacters(String word) {
		char[] characters = word.toCharArray();
		// build HashMap with character and number of times they appear in String
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character ch : characters) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		// Iterate through HashMap to print all duplicate characters of String
		// Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.printf("List of duplicate characters in String '%s' %n", word);
		for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			}
		}
	}

	/*
	 * Another way to check if two Strings are anagram or not in Java This method
	 * assumes that both word and anagram are not null and lowercase
	 * 
	 * @return true, if both Strings are anagram.
	 */
	public static boolean iAnagram(String word, String anagram) {
		char[] charFromWord = word.toCharArray();
		char[] charFromAnagram = anagram.toCharArray();
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);

		return Arrays.equals(charFromWord, charFromAnagram);
	}

	public static boolean checkAnagram(String first, String second) {
		char[] characters = first.toCharArray();
		StringBuilder sbSecond = new StringBuilder(second);

		for (char ch : characters) {
			int index = sbSecond.indexOf("" + ch);
			if (index != -1) {
				sbSecond.deleteCharAt(index);
			} else {
				return false;
			}
		}

		return sbSecond.length() == 0 ? true : false;
	}

	public static boolean isAnagram(String word, String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}
		char[] chars = word.toCharArray();
		for (char c : chars) {
			int index = anagram.indexOf(c);
			if (index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			} else {
				return false;
			}
		}
		return anagram.isEmpty();
	}

	public static String reverseRecursively(String str) {
		// base case to handle one char string and empty string
		if (str.length() < 2 || str == null) {
			return str;
		}

		return reverseRecursively(str.substring(1)) + str.charAt(0);
	}

	/*
	 * A method exposed to client to calculate permutation of String in Java.
	 */
	public static void permutation(String input) {
		permutation("", input);
	}

	/*
	 * Recursive method which actually prints all permutations of given String, but
	 * since we are passing an empty String as current permutation to start with, I
	 * have made this method private and didn't exposed it to client.
	 */
	private static void permutation(String perm, String word) {
		if (word.isEmpty()) {
			// System.err.println(perm + word);

		} else {
			for (int i = 0; i < word.length(); i++) {
				System.out.println("perm " + perm + " i " + i);
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
			} //
		}

	}

	/**
	 * Java Program to find first duplicate, non-repeated character in a String. It
	 * demonstrate three simple example to do this programming problem.
	 *
	 * @author Javarevisited
	 */

	/*
	 * Using LinkedHashMap to find first non repeated character of String Algorithm
	 * : Step 1: get character array and loop through it to build a hash table with
	 * char and their count. Step 2: loop through LinkedHashMap to find an entry
	 * with value 1, that's your first non-repeated character, as LinkedHashMap
	 * maintains insertion order.
	 */

	public static char getFirstNonRepeatedChar(String str) {
		Map<Character, Integer> counts = new LinkedHashMap<>(str.length());

		for (char c : str.toCharArray()) {
			counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
		}

		for (Entry<Character, Integer> entry : counts.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		throw new RuntimeException("didn't find any non repeated Character");
	}

	/*
	 * Using HashMap to find first non-repeated character from String in Java.
	 * Algorithm : Step 1 : Scan String and store count of each character in HashMap
	 * Step 2 : traverse String and get count for each character from Map. Since we
	 * are going through String from first to last character, when count for any
	 * character is 1, we break, it's the first non repeated character. Here order
	 * is achieved by going through String again.
	 */
	public static char firstNonRepeatedCharacter(String word) {
		HashMap<Character, Integer> scoreboard = new HashMap<>();
		// build table [char -> count]
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (scoreboard.containsKey(c)) {
				scoreboard.put(c, scoreboard.get(c) + 1);
			} else {
				scoreboard.put(c, 1);
			}
		}
		// since HashMap doesn't maintain order, going through string again
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (scoreboard.get(c) == 1) {
				return c;
			}
		}
		throw new RuntimeException("Undefined behaviour");
	}

	/*
	 * Finds first non repeated character in a String in just one pass. It uses two
	 * storage to cut down one iteration, standard space vs time trade-off.Since we
	 * store repeated and non-repeated character separately, at the end of
	 * iteration, first element from List is our first non repeated character from
	 * String.
	 */
	public static char firstNonRepeatingChar(String word) {
		Set<Character> repeating = new HashSet<>();
		List<Character> nonRepeating = new ArrayList<>();
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if (repeating.contains(letter)) {
				continue;
			}
			if (nonRepeating.contains(letter)) {
				nonRepeating.remove((Character) letter);
				repeating.add(letter);
			} else {
				nonRepeating.add(letter);
			}
		}
		return nonRepeating.get(0);
	}

}
