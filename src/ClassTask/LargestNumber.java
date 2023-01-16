package ClassTask;

/*Find largest number using loop */

public class LargestNumber {

	public static void main(String[] args) {
	
		 int[] array = {1, 2, 22, 2};
	        int largest = array[0];

	        for (int i = 1; i < array.length; i++) {
	           
	        if (array[i] > largest) {
	                largest = array[i];
	            }
	        }

	        System.out.println("The largest Array number is: " + largest);

	    }

	}