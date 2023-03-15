package college;
import java.util.Scanner;
public class SimpleInterstByMethod {
	
	public static void main(String [] args) {
		int principleAmount;
		float intrest,time;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal , Amount Rate of Intrest , Time period rispectivly");
		principleAmount = sc.nextInt();
		intrest = sc.nextFloat();
		time = sc.nextFloat();
		SI(principleAmount,intrest,time);
		
		
		
		
	}
	public static void SI(int p ,float r ,float n)
	{
		System.out.println("Simple intrest is:"+((double) p*r*n)/100);
	}

}
