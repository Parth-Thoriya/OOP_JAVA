package college;
import java.util.Scanner;
public class GCDByMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the frist number:");
		int n1 =sc.nextInt();
		System.out.println("Enter the second number:");
		int n2 =sc.nextInt();
		int gcd = hcf(n1,n2);
		System.out.println("HCF = "+gcd);

	}
	static int hcf(int n1 , int n2)
	{
		int min = (n1<n2)?(n1):(n2);
		int i=1,gcd=1;
		while(i<=min)
		{
			if(n1%i==0 && n2%i==0) {
				gcd = i;
			}
			i++;
		}
		return gcd;
	}

}
