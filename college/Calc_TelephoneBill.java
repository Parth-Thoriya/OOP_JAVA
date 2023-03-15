package college;
import java.util.Scanner;
public class Calc_TelephoneBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * . WAP that prompts the user to input number of calls and calculate the monthly
		 *  telephone bills as per the following rule:
			Minimum Rs. 200 for up to 100 calls.
			Plus Rs. 0.60 per call for next 50 calls.
			Plus Rs. 0.50 per call for next 50 calls.
			Plus Rs. 0.40 per call for any call beyond 200 calls
		 */
		int calls;
		float amount;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter numbers of calls of this month: ");
		calls = sc.nextInt();
			if(calls<100)
			{
				amount = 200;
			}
			else if (calls>100 && calls<=150)
			{
				amount = (float)200f + (0.6f*(calls-100)); 
			}
			else if (calls>150 && calls<=200)
			{
				amount = 200.00f + (0.6f*50) + (0.5f*(calls-150));
			}
			else
			{
				amount = 200.00f + (0.6f*50) + (0.5f*50) + (0.4f * (calls-200));
			}
			
			System.out.println("your monthly bill is: "+amount);
	
	}

}
