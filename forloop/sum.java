package basicprogram;
import java.util.Scanner;
public class sum {
	public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number: ");
	        int number = sc.nextInt();
	        int sum =0;
	        while (number > 0) {
	            int digit = number % 10;  
	            sum += digit;             
	            number = number / 10;   
	        }
	        System.out.println("Sum of digits: " + sum);
	    }
}
//Write a program to print the sum of all the digits of a given number. 
