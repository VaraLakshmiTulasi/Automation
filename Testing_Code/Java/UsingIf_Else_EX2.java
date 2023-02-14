package basics;

import java.util.Scanner;

public class UsingIf_Else_EX2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Salary : ");
		int sal=sc.nextInt();
		int asal;
		
		if(sal>=20000)
		{
			asal=12*sal;
			System.out.println(" Annual Salary: " + asal);
		}
		else
		{
			System.out.println("Salary must be more than the 20000 to get annual salary");
		}
	}

}
