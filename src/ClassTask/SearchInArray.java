package ClassTask;

import java.util.Scanner;

/*java code to create array and fill it with numbers then read from user any number
   then search in array and return how many times this number appear in that array */


public class SearchInArray {

	public static void main(String[] args) {

		  
		    int[] numbers = {1, 2, 3, 1};


		    Scanner scanner = new Scanner(System.in);
		    System.out.print("Enter a number: ");
		    int findNumber = scanner.nextInt();

		    int count = 0;
		    for (int i = 0; i < numbers.length; i++) {
		      if (numbers[i] == findNumber) {
		        count++;
		      }
		    }

		   
		    System.out.println("\nNumber is appear : " + count + " times");
		    
		    scanner.close();
		  }
		}