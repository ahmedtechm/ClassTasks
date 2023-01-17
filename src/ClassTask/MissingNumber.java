package ClassTask;


/* Find Missing Number In Array In Java */

public class MissingNumber {

	public static void main(String[] args) {
		

		int[] array = { 1, 3, 4, 5, 7, 8 };

		for(int i = 0; i < array.length-1; i++){
    
			if(array[i+1] != array[i] + 1){
        
    	System.out.println("Missing Number is : " + (array[i] + 1));
			}
		}
	}
}
