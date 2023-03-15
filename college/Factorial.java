package college;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fact=1,n;
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		for(int i= 2;i<=n;i++) 
		{
			fact = fact*i;
		}
		System.out.println("Factorial of given number is:"+fact);
	}

}
