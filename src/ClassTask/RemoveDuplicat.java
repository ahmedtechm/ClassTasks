package ClassTask;

/*Sort an array of integers while removing the duplicates */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicat {


	 public static void main(String[] args) {
		    
		 int[] arr = {4, 4, 3, 3, 2, 2, 1, 1, 0, 0};

		  Set<Integer> set = new HashSet<Integer>();

		    for (int i = 0; i < arr.length; i++) {
		    	
		    	set.add(arr[i]);
		    }
		    
		    Integer[] b = set.toArray( new Integer[set.size()]);
		    	
		      System.out.print(Arrays.toString(b));
		      
		    }
		  
		}