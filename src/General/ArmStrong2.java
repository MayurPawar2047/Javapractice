package General;

import java.util.Scanner;

public class ArmStrong2 {

	public static void main(String[] args) {
		int arm=0,a,number,OriginalNumber;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		number=sc.nextInt();
		OriginalNumber=number;
		
		while(number>0)
		{
			a=number%10;
			number=number/10;
			arm=arm+a*a*a;
		}
		if(arm==OriginalNumber)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
