package string;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    static void countCharacters(String str) {
        // Convert to lowercase to count characters case-insensitively (optional)
        str = str.toLowerCase();
        
        // HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') { // Ignore spaces (optional)
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Print character occurrences
        System.out.println("Character occurrences:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String input = "Mayur Pawar";
        System.out.println("Input String: " + input);
        countCharacters(input);
    }
}

