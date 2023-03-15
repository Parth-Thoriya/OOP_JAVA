package college;
import java.util.Scanner;
public class SidesOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a,b,c,x;
		System.out.println("Enter the lenght of sides of the Triangle");
		a = sc.nextInt();
		b =sc.nextInt();
		c =sc.nextInt();
			
		if(((a+b>c))&& ((b+c)>a) && ((a+c)>b))
	{			
		if(a>b && a>c)
		{
			if(a*a == (b*b) + (c*c)) {
				System.out.println("triangle is right angle trinagle");
			}
		}
		else if (b>c) 
		{
			if(b*b == (a*a) + (c*c)) 
			{
				System.out.println("triangle is right angle trinagle");
			}
		}
		else if (b>c) 
		{
			if(b*b == (a*a) + (c*c)) 
			{
				System.out.println("triangle is right angle trinagle");
			}
		}
		
		
		
			else if(a!=b || a!=c || b!=c)
			{
				System.out.println("Given Triangle is scaler triangle");
			}
			else if(a==b || a==c || b==c) 
			{
				System.out.println("Given Triangle is isoscales triangle");
			}
			else if(a==b &&  a==c && b==c)
			{
				System.out.println("Given Triangle is Equilateral tringle");
			}
			else 
			{
				if(c*c == (a*a) + (b*b)) 
				{
					System.out.println("triangle is right angle trinagle");
				}
			}
	}
		
	else 
	{
		System.out.println("given values does not form a tringle");
	}
}
}
