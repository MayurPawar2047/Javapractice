package test;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
	public static void findDuplicates(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        
        System.out.print("Duplicate characters: ");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print("'" + entry.getKey() + "', ");
            }
        }
    }


	public static void main(String[] args) {
		
		 String s = "Automation";
	     findDuplicates(s.toLowerCase());
	}

}
