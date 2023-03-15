package college;
import java.util.Scanner;
public class Array_EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = sc.nextInt();
		int [] arr = new int[n];
		int i =0,e=0,o=0;
			while(i<n)
			{
					System.out.println("Enter a number: ");		
				    arr[i]= sc.nextInt();
				    if(arr[i]%2==0)
				    {
				    	e++;
				    }
				    else
				    {
				    	o++;
					}
				i++;
			}
			System.out.println("Number of even entries = "+e);
			System.out.println("Number of odd entries = "+o);
	}

}
