package college;
import java.util.Scanner;
public class PrimeOrNotByMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to accept a number and check whether the number is prime or not. Use method name check (int n). 
		//The method returns 1, if the number is prime otherwise, it returns 0. 
		int n,p;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		p = check(n);
		if(p==1) {
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}
	
	static int check(int n)
	{
		int x;
		boolean flag = true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag = false;
				break;
			}
		}
		if (flag) 
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}

}
