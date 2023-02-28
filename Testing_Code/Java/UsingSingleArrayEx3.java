package basics;

import java.util.Scanner;

public class UsingSingleArrayEx3 {

	public static void main(String[] args) 
	{
		//Declare an array with size 5
		int[] a= new int[5];
		//Take element values at runtime
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
          {
	      System.out.print(" Enter an element " + (i+1) + " Value : ");
	      a[i]=sc.nextInt();
          }
        //print an array
		System.out.print(" a = ");
		for(int i : a )
		{
			System.out.print(i + " ");
		}
		//Find the maximum number of an array
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		
		}
		System.out.println(" \nThe maximum number of an array is " + max);
	}

}
