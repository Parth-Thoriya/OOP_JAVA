package college;

 import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n,a,b,ans;
			System.out.println("For addition press 1 \n For substraction press 2 \n For multiplcation press 3 \n  For division press 4");
			n = sc.nextInt();
			
			System.out.println("Enter two numbers");
			a = sc.nextInt();
			b = sc.nextInt();
			
			switch (n) {
			case 1: {
				ans = a+b;
				System.out.println("sum of numbers ="+ans);
				break;
				
			}
			case 2:{
				ans = a-b;
				System.out.println("substraction of numbers ="+ans);
				break;
			}
			case 3 :{
				ans = a*b;
				System.out.println("product of numbers ="+ans);
				break;
			}
			case 4:{
				ans = a/b;
				System.out.println("division of numbers  ="+ans);
				break;
			}
			default:
				System.out.println("enter a valid number ");
			}
			
	}

}
