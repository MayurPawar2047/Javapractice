package General;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		int arm=0, a,b,c,realDigit,number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		number=sc.nextInt();
		realDigit=number;
		while(number>0)
		{
			a=number%10;
			number= number/10;
			arm=arm+a*a*a;
			
		}
		if(arm==realDigit)
		{
			System.out.println("Yes Arm strong");
		}
		else
		{
			System.out.println("No");
		}

	}

}
