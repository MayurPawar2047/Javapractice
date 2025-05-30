package string;

import java.util.Scanner;

public class RemoveDigit3 {
	
static String remDigit(String str)
{
	String result="";
	for(int i=0;i<str.length();i++)
	{
		if(!Character.isDigit(str.charAt(i)))
		{
			result=result+str.charAt(i);
		}
	}
	return  result;
}
	public static void main(String[] args) {
		

		String str="123Java12program21";
		
		System.out.println(remDigit(str));

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
        String str1 = sc.nextLine(); // Take input from user
		System.out.println(remDigit(str1));
	}

}
