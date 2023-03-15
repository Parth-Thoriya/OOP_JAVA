package college;
import java.util.Scanner;
public class  FibonacciSeriesByMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter number of trems for fibonacci series:");
		n = sc.nextInt();
		fibo(n);
		
		
		
	}
	
	 static void fibo(int n)
	{
		int t1=0,t2=1,t3=0;
		System.out.print(" "+t1);
		System.out.print(" "+t2);
		
		for(int i=3; i<=n;i++)
		{	
						
			t3= t1 + t2;
			t1 = t2;
			t2 = t3; 
			System.out.print(" "+t3);
		}
		
	}
	

}
