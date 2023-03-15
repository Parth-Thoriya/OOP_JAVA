package college;
import java.util.Scanner;
public class MaxOfTwoNumByMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter two numbers: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		max(n1,n2);
		
	}

	public static void max(int n1 , int n2) {
		if(n1==n2)
		{
			System.out.println("Both are equal"+n1);
		}
		else if (n1>n2)
		{
			System.out.println("Frist number is large: "+n1);
		}
		else {
			System.out.println("Second numbers is large: "+n2);
		}
	}
	
}
