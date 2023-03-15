package college;
import java.util.Scanner;
public class DiameterOfCricle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				float area;
				double dm;
		System.out.println("Enter area of Cricle:");
		area =sc.nextFloat();
		dm=Math.sqrt( (area*4)/3.14);
		System.out.println("Daimeter of the Circle is:"+dm);
		
		sc.close();
	}

}
