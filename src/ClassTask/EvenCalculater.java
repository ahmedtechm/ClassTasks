package ClassTask;

//write a function to determine if there are two distinct elements in the array that add up to k and both elements should be even number.
//Input: [1, 2, 4, 6, 8, 10], k = 10
//Output: true (2 + 8 = 10)


import java.util.Scanner;

public class EvenCalculater {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		
		 int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		 
		 System.out.println("Please enter total number ");
		 int element= scan.nextInt();
		 int targetSum = element;
		 for (int i = 0; i < array.length; i++) {
		     if (array[i] % 2 == 0) {
		         for (int j = i + 1; j < array.length; j++) {
		             if (array[j] % 2 == 0 && array[i] + array[j] == targetSum) {
		                 System.out.println("Even Numbers that add to Number " );
		                 System.out.println(+ targetSum + ": (" + array[i] + ", " + array[j] + ")");
		             }
		         }
		     }
		 }
	}
}	 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

