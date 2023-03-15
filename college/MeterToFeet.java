package college;
import java.util.Scanner;
public class MeterToFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float meter,feet;
		Scanner sc = new Scanner(System.in);
		
		meter = sc.nextFloat();
		feet = meter*3.28084f;
		System.out.println(feet);	
	sc.close();
	}

}
