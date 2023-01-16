package ClassTask;

import java.util.stream.IntStream;

public class RemoveDuplicat {


	 public static void main(String[] args) {
		    
		 int[] numbers = {0, 0, 1, 1, 3, 3, 4, 4, 2, 5};

		    int[] result = IntStream.of(numbers)
		        .distinct()
		        .sorted()
		        .toArray();

		    for (int i = 0; i < result.length; i++) {
		    	
		      System.out.print(result[i] + " ");
		    }
		  }
		}