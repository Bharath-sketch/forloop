package basicprogram;

public class theprimenumbers {
	public static void main(String args[]) {
					    for(int num =10;num<100;num++) {
					    int flag = 0;
					    if (num == 0 || num == 1) {
					        flag = 1;
					    }
					    for (int i = 2; i <= num / 2; ++i) {
					      if (num % i == 0) {
					         flag = 0;
					        break;
					      }
					    }

					    if (flag==1)
					      System.out.println(num + " is a prime number.");
					    else
					      System.out.println(num + " is not a prime number.");
					  }
					}
}
//Write a program to print the prime numbers between 10 and 99.
