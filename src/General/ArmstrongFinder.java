package General;

import java.util.Scanner;

public class ArmstrongFinder {

	public static void main(String[] args) {
		
		int arm=0,a,number,originalNumber;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		number=sc.nextInt();
		originalNumber=number;
		//input 3 7 1 
		while(number>0)
		{
			a=number%10; //1 //7  //3
			number=number/10; //37 //3  //0.3
			System.out.println("Number value: "+number);
			arm=arm+a*a*a; //0+1=1  //1+343=344  //344+(3*3*3)=344+27=371
			System.out.println(arm);
		}
	
		if(arm==originalNumber)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Enter number is not Armstrong");
		}

	}

}
