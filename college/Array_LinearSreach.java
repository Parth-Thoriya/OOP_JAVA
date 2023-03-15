package college;

import java.util.Scanner;

public class Array_LinearSreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,x;
		System.out.println("Enter the length of array");
		n = sc.nextInt();
		int [] arr;
		arr = new int[n];
		int i=0;
		while(i<n)
		{
			System.out.println("Enter a number: ");		
		    arr[i]= sc.nextInt();
		    
		    
			i++;
		}
		System.out.println("Enter the number you want to find:");
		x=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			if(arr[i]==x)
				
			{
				System.out.println("Given number is present");
				System.out.println("Found at position: "+(i+1));
				
				
			}
		}


	}

}
