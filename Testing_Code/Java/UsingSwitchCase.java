package basics;

import java.util.Scanner;

public class UsingSwitchCase {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Number1 : ");
		int n1=sc.nextInt();
		System.out.println(" Enter the Number2 : ");
		int n2=sc.nextInt();
		System.out.println(" Enter the choice of operation (+/-/*) : ");
		String choice=sc.next();
		int result=0;
		boolean isValid=true;
		
		switch(choice)
		{
		case "+":
			result=n1+n2;
			break;
		case "-":
			result=n1+n2;
			break;
		case "*":
			result=n1+n2;
			break;
		default:
			isValid=false;
			break;
		}
		if(isValid=true)
		{
			System.out.println(" The arthemetic operation of " + choice + " on " + n1 + " with " + n2 + " is " + result);
		}
		else
		{
			System.out.println("Invalid choice entered");
		}

	}

}
