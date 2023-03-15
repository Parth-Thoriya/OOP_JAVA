package college;
import java.util.Scanner;
public class BodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * take input in pounds and inches
		 * bmi weght in kg heght in meter
		 * display in pounds and inches 
		 
		 * */
		Scanner sc = new Scanner(System.in);
		float weightP,heightI;
		float BMI,weight , height;
		boolean x;
		System.out.println("type true if you want to enter data in kilogram and meter else flase to enter data in pounds and inches");
		x =sc.nextBoolean();
		if(x)
		{
			System.out.println("enter weight(in kilograms)and wheight (in meter)");
			weight=sc.nextFloat();
			height=sc.nextFloat();
		}
		else
		{	
			System.out.println("enter weight(in pounds) and height(in inches)");
			weightP =sc.nextFloat();
			heightI = sc.nextFloat();
			weight =weightP/2.204623f;
			height=heightI/39.37008f;
		}
		BMI=weight/(height*height);
		System.out.println("Your BMI is(in kilogram per meter square) "+BMI);
		sc.close();
		
	}

}
