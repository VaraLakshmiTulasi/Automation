package basics;

import java.util.Scanner;

public class UsingBreak {

	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 String uid,pwd;
	 int count=0;
	 do {
		 if(count==3) 
		 {
			System.out.println("Your 3 choices is over, Existing the application"); 
			break;
		 }
		 if(count>0) 
		 {
			System.out.println("Invalid credentials,try again"); 
		 }
		 System.out.println(" Enter the Userid: ");
		 uid=sc.next();
		 System.out.println(" Enter the password : ");
		 pwd=sc.next();
		 count=count+1;
	 } while(!uid.equals(" Tulasi ") || !pwd.equals(" Tulasi123"));

	}

}
