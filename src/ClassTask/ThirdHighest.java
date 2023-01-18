package ClassTask;

//write a function that finds the third highest number in the array.
//Input: [1, 5, 9, 3, 7, 8, 2, 4, 6]
//Output: 7


import java.util.Arrays;

public class ThirdHighest {

	public static void main(String[] args) {
		
		int[] arr= { 1, 5, 9, 3, 7, 8, 2, 4, 6 };
	
		Arrays.sort(arr);
		
		System.out.println("Third highest Number is : " + arr [arr.length-3]);
		
		
	}

}
