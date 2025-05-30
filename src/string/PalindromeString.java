package string;

public class PalindromeString {

	public static void main(String[] args) {
		
		//String str = "mom";//5
		
		
		String a="wow";
		 char ch;
		 String reverse="";
		 
		  for(int i=0;i<a.length();i++)
		  {
			  ch=a.charAt(i);
			  reverse=ch+reverse;
		  }
		  System.out.println(reverse);	
		  
		  if (a.equals(reverse)) 
				System.out.println(a+ " String is Palindrome");
			 else {
				System.out.println("String is not palindrome");
			}
		
		
		
		/*System.out.println(str.length());
		String rev = "";
		for (int i = str.length() - 1; i > 0; i--) {
			rev = rev + str.charAt(i);

		}

		if (str.equals(rev)) 
			System.out.println("String is Palindrome");
		 else {
			System.out.println("String is not palindrome");
		}
*/
	}

}
