package basics;

public class UsingArrayInArrayCopyMethod {

	public static void main(String[] args) 
	{
		int[] a= {10,20,30,40,50};
		int[] b= {11,22,33,44,55};
		System.out.print(" Initially : ");
		System.out.print("\n\t a = ");
		for(int i : a)
		{
			System.out.print(i + " ");
		}
		System.out.print("\n\t b = ");
       for(int i : b)
       {
    	   System.out.print(i  + " ");
       }
       System.arraycopy(a, 2, b, 3, 2);
      
		System.out.print(" \nAfter copy : ");
		System.out.print("\n\t a = ");
		for(int i : a)
		{
			System.out.print(i + " ");
		}
		System.out.print("\n\t b = ");
      for(int i : b)
      {
   	   System.out.print(i  + " ");
      }
	}

}
