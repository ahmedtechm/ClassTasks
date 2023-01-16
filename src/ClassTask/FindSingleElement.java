package ClassTask;

/* Given an array of integers, find the two numbers that appear only once in the array.  */

public class FindSingleElement {

	public static void main(String[] args) {
		
		int[] a = { 5, 3, 4, 8, 5, 3, 4 ,2 };
		
		int res = a[0];
		
		for(int i = 1; i < a.length;i++)
		
		{
			res = res^a[i];
		}
		
		System.out.println("Single Element is :"+res);

	}

}
