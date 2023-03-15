package college;
import java.util.Scanner;
public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int digit,reverseOfNumber=0,n;
			System.out.println("Enter a number:");
			n = sc.nextInt();
			
			while(n!=0)
			{
				digit = n%10;
				reverseOfNumber = reverseOfNumber*10 + digit;
				n=n/10;
			}
		System.out.println("Revese of the given number is: "+reverseOfNumber);
		
	}

}
