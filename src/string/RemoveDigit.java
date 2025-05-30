package string;

public class RemoveDigit {
	
	static String remDigit(String str) {
		// Remove digits from the string
		str=str.replaceAll("\\d","");
		 
		// Split the string into characters
		 String [] parts=str.split("");

		 // Reverse the characters   
		 StringBuilder reversed = new StringBuilder();
		 for(int i=parts.length-1;i>=0;i--)
		 {
			// System.out.println(parts[i]+" ");
		  reversed.append(parts[i]);
		 }
		 return reversed.toString();
				 
	}

	public static void main(String[] args) {
		String str="T4es5t C8od9e";
		System.out.println(remDigit(str));

	}

}
