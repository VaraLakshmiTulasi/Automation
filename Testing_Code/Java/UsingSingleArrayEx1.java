package basics;

public class UsingSingleArrayEx1 {

	public static void main(String[] args) 
	{
		int[] a= {10,20,30,40,50};
	  //read the 3rd element in array
        System.out.println(" 3rd element of an array " + a[2]);
        System.out.println(" before modification of an array " + a[4]);
        a[4]=7;
        System.out.println(" after modification of an array " + a[4]);
        
        a[7]=20; //we are getting exception Index 7 out of bounds for length 5
        
	}

}
