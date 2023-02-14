package basics;

import java.util.Scanner;

public class UsingNestedIfElseEx2 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the salary: ");
		double Sal=sc.nextDouble();
		int comm;
		double gSal;
		if(Sal<=20000)
			comm=10;
		else if(Sal<=20000 && Sal<=40000)
			comm=20;
		else
			comm=30;
		gSal=Sal+(Sal*comm)/100;
		System.out.println(" Gross Salary for the given Salary " + gSal);
		

	}

}
