package basics;

import java.util.Scanner;

public class UsingNestedIfElse 
{

	public static void main(String[] args) 
	{
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Enter the salary");
	  int Sal=sc.nextInt();
	  char grade;
	  if(Sal<=20000)
	  grade='C';
	  else if (Sal>=20000 && Sal<=50000)
		grade='B';
	  else
		  grade='A';
	  System.out.println(" The grade of given salary: " + grade);
	  
	}

}
