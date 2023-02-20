package basics;

import java.util.Scanner;

public class UsingDoWhile {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String uid,pwd;
		do
		{
		
			System.out.print(" Enter the UserId : ");
			uid=sc.next();
			System.out.print(" Enter the password : ");
			pwd=sc.next();
		}
		while(!uid.equals("Java") || !pwd.endsWith("Programs"));
		
			
		

	}

}
