package college;
import java.util.Scanner;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter a number ");
		n =sc.nextInt();
		
		int []arr;
		arr = new int[n]; 
		for (int i=1;i<=n;i++) {
			arr[i]=i;
		}
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}
	
}
