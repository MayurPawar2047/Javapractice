package General;

import java.util.Scanner;

public class Prime {
	
	 static  boolean isPrime(int num)
	    {
	        if(num<=1)
	        {
	            return false;
	        }
	       for(int i=2;i<=num/2;i++)
	       {
	           if((num%i)==0)
	               return  false;
	       }
	       return true;
	    }

	public static void main(String[] args) {
		  Scanner sc= new Scanner(System.in);
		  System.out.println("Enter number: ");
	        int number= sc.nextInt();
	        
	        
	        if(isPrime(number)) {
	            System.out.println(number + " is prime number");
	        }
	        else{
	            System.out.println(number + " is a non-prime number");
	        }
	    }
	   
	}


