package college;
import java.util.Scanner;
public class ResultCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		int p,c,m,b,s,total,max_marks;
		float per;
		char grade;
		boolean pass= true;
		System.out.println("maximum marks that can be obtianed:");
		max_marks = sc.nextInt();
		System.out.println("enter marks of physics: ");
		p =sc.nextInt();
		
		System.out.println("enter marks of chemstry: ");
		c =sc.nextInt();
		
		System.out.println("enter marks of maths: ");
		m =sc.nextInt();
		
		System.out.println("enter marks of biology: ");
		b =sc.nextInt();
		
		System.out.println("enter marks of sanskrit: ");
		s =sc.nextInt();
		
		total = p+c+m+b+s;
		per = (total/(float)(5*max_marks))*100;
		
		System.out.println("total marks obtained: "+total);
		System.out.println("percentage: "+per);
		
		if(p <35 || c<35 || m<35 || b<35 || s<35) {
			pass = false;
					
		}
		else {
			if(per >= 70)
			{
				System.out.println("Distinction");
				
			}
			else if (per >= 60)
			{
				System.out.println("First Class");
			}
			else if (per >= 45) 
			{
				System.out.println("Second Class");
			}
			else if (per >= 35 )
			{
				System.out.println("Pass Class");
			}
			
		}
		if (!pass){
			System.out.println("Fail");
		}
		
		//Fail below 35, Pass Class between 35 to 45, Second Class between 45 to 60, First 
		//Class between 60 to 70, Distinction if more than 70.

		
		
	}

}
