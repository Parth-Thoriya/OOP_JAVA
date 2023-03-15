package college;
import java.util.Scanner;

import parth.sumofnumbers;

public class Array_ThreeOrFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  WAP to accept n numbers in an array. Display the sum of all the numbers which are divisible by either 3 or 5
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the length of array");
		n = sc.nextInt();
		int [] arr;
		arr = new int[n];
		int i=0,sum=0;
		while(i<n)
		{
			System.out.println("Enter a number: ");		
		    arr[i]= sc.nextInt();
		    if (arr[i]%3== 0 || arr[i]%5==0) {
				sum = sum + arr[i];
			} 

			i++;
		}
		System.out.println("Sum of number divisible by either 3 or 5 is:"+sum);
		
	}

}
