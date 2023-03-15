package college;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

class BankAccount{
	private String balanceString ;
	private int balance;
	
	public void withdraw(int withdrawAmount) {
		
		try {
			Scanner sc = new Scanner(new File("balanceString.txt"));
			balance = Integer.parseInt(balanceString);
			if(withdrawAmount < balance) {
				balance = balance - withdrawAmount;
			}
			else {
				System.out.println("Insufficient Balance");
			}
			sc.close();
			
		}catch(Exception e) {
			// never blank or else it will cuase problem
		}
		
	}
	void printBalace() {
		try {
			PrintWriter pw = new PrintWriter( new File("balanceString.txt"));
			pw.write(balance);
			pw.println();
			pw.close();
			System.out.println("Remaining Balance = "+balance);
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Remaining Balance = "+balance);
		
	}
	
	
}
public class PrivateAccessDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter withdrawal Amount.");
		int withdrawAmount = sc.nextInt();
		BankAccount objAccount = new BankAccount();
		
		objAccount.withdraw(withdrawAmount);
		objAccount.printBalace();
		
		
		
	}

}
