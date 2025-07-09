package basicprogram;
import java.util.Scanner;
public class patternprogram {
	public static void main(String args[]) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a =n.nextInt();
		for(int i =1;i<=a;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();		
			}
	}

}
