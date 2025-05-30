package string;

public class RemoveDigit1 {
    
    static String remDigit(String str) {
    	
        // Remove all digits from the string
        String newStr = str.replaceAll("\\d", "");
        
        // Split into words and reverse
        String[] parts = newStr.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (int i = parts.length - 1; i >= 0; i--) {
            result.append(parts[i]).append(" ");
        }
        
        
        
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String str = "T4es5t C8od9e";
        System.out.println(remDigit(str));
    }
}
