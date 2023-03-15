package college;
import java.util.Scanner;
public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x ;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any alphabet of english:");
		x=sc.next().charAt(0);
		switch (x) {
		case 'a': {
			
			System.out.println("vowel");
		}
		case 'e': {
			
			System.out.println("vowel");
		}

		case 'i': {
			
			System.out.println("vowel");
		}

		case 'o': {
			
			System.out.println("vowel");
		}

		case 'u': {
			
			System.out.println("vowel");
		}

		case 'A': {
			
			System.out.println("vowel");
		}

		case 'E': {
			
			System.out.println("vowel");
		}

		case 'I': {
			
			System.out.println("vowel");
		}
		case 'O': {
			
			System.out.println("vowel");
		}
		case 'U': {
			
			System.out.println("vowel");
		}
		
		default:
			System.out.println("consonant");
		}
	
		

	}

}
