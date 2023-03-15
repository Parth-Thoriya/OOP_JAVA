package college;
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		boolean flag = true ;
		System.out.println("Enter a number:");
		n = sc.nextInt();
		for(int i=2 ; i<=n/2 ; i++)
		{
			if(n%i==0)
			{
				flag = false;
				break;
			}
		}
		
		if(!flag)
		{
			System.out.println("Given number is not prime");
		}
		else
		{
			System.out.println("Given number is prime");
		}
	}

}
