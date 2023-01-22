package ClassTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LongestDecreasingSubarray {

	public static void main(String[] args) {

	
	ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1));
	System.out.println("\nOriginal Array:"+arr);
	
	 Set<Integer> set = new HashSet<Integer>();
	 	
	 	set.addAll(arr);
	 	arr.clear();
	 	arr.addAll(set);
	 	
	 	
	Collections.sort(arr, Collections.reverseOrder());
	
	System.out.println("\nDecreasing Subarray without duplicat Number"+arr);
	}

}
