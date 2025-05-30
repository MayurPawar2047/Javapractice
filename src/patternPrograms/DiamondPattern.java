package patternPrograms;

public class DiamondPattern {

	public static void main(String[] args) {
        int n = 5; // This is the middle row size
        
        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = i; j < n; j++) { //4 //3 //2 //1 //0
                System.out.print("_");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) //1st iteration 1 star // 3 star print //5 //7 // 9
            {
                System.out.print("*");  
            }
            System.out.println();
        }
        
        // Lower part of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
	
}
