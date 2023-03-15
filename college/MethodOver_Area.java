package college;
import java.util.Scanner;
public class MethodOver_Area {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// area of circle, triangle and square using method overloading
		System.out.println("Enter '1' for area of circle, '2' for area of Square, '3' for area of triangle");
		int n;
		n= sc.nextInt();
		switch (n) 
	{
		case 1: {
			area();
			break;
		}
		case 2:
		{

			float l ;
			System.out.println("Enter length of Square:");
			l = sc.nextFloat();
			area(l);
			break;
		}
		case 3:
		{
			float s1,s2,s3;
			double area;
			System.out.println("Enter value of three sides of triangle:");
			s1=sc.nextFloat();
			s2 =sc.nextFloat();
			s3 = sc.nextFloat();
			area =area(s1, s2, s3);
			System.out.println("Area of tringle: "+area);
			break;
		}
		default:
			System.out.println("Enter a valid number");
		
	}
				
	
}
	
static 	void area() 
	{
		Scanner sc = new Scanner(System.in);
		float r;
		System.out.println("Enter radius of circle:");
		r = sc.nextFloat();
		float area=0.0f;
		area = 3.14f*r*r;
		System.out.println("Area of circle: "+area);
	}
static void area(float l)
	{
		float area=0;
		area = l*l;
		System.out.println("Area of square: "+area);
	}
static double area(float s1 ,float s2 ,float s3)
	{
		double area=0 , s;
		s = (s1 + s2+ s3)/2;
		area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		return area;
	}

}
