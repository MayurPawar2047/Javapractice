package string;

public class SplitString {
	
	public static void main(String[] args) {
        String input = "abc-2019";
        
        // Split the input string based on the hyphen
        String[] parts = input.split("-");
        
        // Print each part in the desired format
        for (String part : parts) {
            System.out.println("[" + part + "]");
        }
    }

}
