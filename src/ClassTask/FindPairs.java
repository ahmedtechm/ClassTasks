package ClassTask;

import java.util.HashMap;
import java.util.Scanner;

/* java code find the pairs that add up to a specific sum */

public class FindPairs {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter the Target Sum: ");
	    int sum = scanner.nextInt();
		
		    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};


		    findPairs(array, sum);
		    
		    scanner.close();
		  }
	

		  public static void findPairs(int[] array, int sum) {
		    HashMap<Integer, Integer> pairs = new HashMap<>();

		    for (int i = 0; i < array.length; i++) {
		      int target = sum - array[i];

		      if (pairs.containsKey(target)) {
		        System.out.println(array[i] + "," + target);
		      } else {
		        pairs.put(array[i], i);
		      }
		    }
		    
		  }
		  
		}



		