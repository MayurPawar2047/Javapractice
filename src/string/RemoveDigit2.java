package string;

public class RemoveDigit2 {
    
    static String remDigit(String str) {
        int sum = 0;

        // Extract and sum digits
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }

        // Remove all digits from the string
        String newStr = str.replaceAll("\\d", "");

        // Split into words and sort alphabetically
        String[] parts = newStr.trim().split("\\s+");
        java.util.Arrays.sort(parts);

        // Join words back into a sentence
        String result = String.join(" ", parts);

        // Return final formatted output
        return result + " and Sum is:" + sum;
    }

    public static void main(String[] args) {
        String str = "T4es5t C8od9e";
        System.out.println(remDigit(str));
    }
}
