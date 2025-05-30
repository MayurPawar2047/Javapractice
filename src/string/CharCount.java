package string;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void getCharCount(String input) {
		input = input.toLowerCase();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char strArray[] = input.toCharArray();
		for (char c : strArray) {
			if (!String.valueOf(c).isBlank()) {
				if (charMap.containsKey(c)) {
					charMap.put(c, charMap.get(c) + 1);
				} else {
					charMap.put(c, 1);
				}
			}

		}
		System.out.println("Character Count for " + input + ": " + charMap);
	}

	public static void main(String[] args) {

		getCharCount("test TesT");
	}

}
