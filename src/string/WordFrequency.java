package string;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String input = "this is a test this is only a test";

	        // Split string into words
	        String[] words = input.split(" ");

	        // Map to store word count
	        Map<String, Integer> wordCount = new HashMap<>();

	        // Loop through words and count
	        for (String word : words) {
	        	// Add the word to the map or update its count:
	        	// If the word already exists, get its current count and add 1.
	        	// If the word does not exist, getOrDefault returns 0, so we store 1
	            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
	        }

	        // Print word occurrences
	        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }

	}

}
