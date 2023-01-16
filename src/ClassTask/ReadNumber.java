package ClassTask;

/*java code to read 2 number from the user and numbers must be within 0 -100 
 else re read the input and display error message */


import java.util.Scanner;

public class ReadNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

	    int num1, num2;
	    
	    while (true) {
	      System.out.print("\nEnter First Number between 0 and 100: ");
	      num1 = scanner.nextInt();
	      if (num1 >= 0 && num1 <= 100) {
	        break;
	      }
	      System.out.println("\nError: Please Enter First Number again !");
	    }

	    while (true) {
	      System.out.print("\nEnter Second Number between 0 and 100: ");
	      num2 = scanner.nextInt();
	      if (num2 >= 0 && num2 <= 100) {
	        break;
	      }
	      System.out.println("\nError: Please Enter Secand Number again !");
	    }

	    System.out.println("\nThe First Number is : " + num1);
	    System.out.println("\nThe Second Number is : " + num2);
	    System.out.println("\nWell Done");
	    
	    
	    scanner.close();
	  }
	}
		
		

