package string;

public class ReverseString {

	public static void main(String[] args) {
		
		 String a="I love Java";
		 char ch;
		 String reverse="";
		 
		  for(int i=0;i<a.length();i++)
		  {
			  ch=a.charAt(i);
			  reverse=ch+reverse;
		  }
		  System.out.println(reverse);		

	}

}
