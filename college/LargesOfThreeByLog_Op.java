package college;
import java.util.Scanner;
public class LargesOfThreeByLog_Op {
			public static void main (String [] args) {
				int a,b,c,x;
				Scanner sc ;
				sc = new Scanner(System.in);
				System.out.println("Enter three numbers: ");
				a =sc.nextInt();
				b =sc.nextInt();
				c =sc.nextInt();
				
//				x = (a>b)?((b>c)?(b):(c)):((a>c)?(a):(c));
				
				x = (a>b)?						
						((a>c)?(a):(c)):((b>c)?(b):(c));
				System.out.println("frist number: "+a);
				System.out.println("second number: "+b);
				System.out.println("three number: "+c);
				
				System.out.println("laggest from  given number is:  "+x);
				
			}
}
