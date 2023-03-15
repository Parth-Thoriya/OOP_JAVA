package college;
import java.util.Scanner;
public class PrintNo_Bet_TwoNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WAP to print numbers between two given numbers which is divisible by 2 but not divisible by 3
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers: ");
		int n1,n2;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		for(int i= n1 ;i< n2 ;i++)
		{
			if(i%2==0 && i%3!=0)
			{
				
				System.out.println(i);
			}
		}
		
	}

}
