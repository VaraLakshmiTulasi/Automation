package basics;

import java.util.Scanner;

public class UsingIfElse 
{

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n=sc.nextInt();
	
	if(n%2==0)
	{
		System.out.println("It is Even Number....");
	}
	else
	{
		System.out.println("It is Odd Number");
	}

	}

}
