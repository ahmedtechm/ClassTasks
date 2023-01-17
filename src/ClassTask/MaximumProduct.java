package ClassTask;

//java code that finds the maximum product that can be formed by multiplying any four integers.
//Input: [1, 2, 3, 4, 5, 6]
//Output: 360 (6 * 5 * 4 * 3)




public class MaximumProduct {

	static int maxProduct(int[] arr) {
		
	    int max = 0;
	    for (int i = 0; i < arr.length - 3; i++) {
	        for (int j = i + 1; j < arr.length - 2; j++) {
	            for (int k = j + 1; k < arr.length - 1; k++) {
	                for (int m = k + 1; m < arr.length; m++) {
	                    int product = arr[i] * arr[j] * arr[k] * arr[m];
	                    max = Math.max(max, product);
	                }
	            }
	        }
	    }
	    return max;
	}

	public static void main(String[] args) {
	    
		int[] arr = {1, 2, 3, 4, 5, 6};
	    int maxProduct = maxProduct(arr);
	    System.out.println("The Maximum Product is " + maxProduct);
	}
}