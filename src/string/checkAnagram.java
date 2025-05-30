package string;

import java.util.Arrays;

public class checkAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		String a="Silent";
		String b="Listen";
		
		 //Converting both the string to lower case.  
        a = a.toLowerCase();  
        b = b.toLowerCase(); 
        
        if (a.length() != b.length()) {  
            System.out.println("Both the strings are not anagram");  
        }  
        
        else
        {
        	//Converting both the arrays to character array  
            char[] str1 = a.toCharArray();  
            char[] str2 = b.toCharArray();  
            
            //Sorting the arrays using in-built function sort ()  
            Arrays.sort(str1);  
            Arrays.sort(str2);  
            
          //Comparing both the arrays using in-built function equals ()  
            if(Arrays.equals(str1, str2) == true) {  
                System.out.println("Both the strings are anagram");  
            }  
            else {  
                System.out.println("Both the strings are not anagram");  
            }  
        }
		
		
		

	}

}
