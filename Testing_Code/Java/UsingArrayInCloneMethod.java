package basics;

public class UsingArrayInCloneMethod {

	public static void main(String[] args) 
	{
	int[] a= {23,67,6};
	int[] b;
	b=a.clone();
	for(int i : b)
	{
		System.out.println(i);
	}

	}

}
