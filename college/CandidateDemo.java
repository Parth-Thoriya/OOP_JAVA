package college;
import java.util.Scanner;
public class CandidateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. Create a class named Candidate with Candidate_ID, Candidate_Name, Candidate_Age, Candidate_Weight 
		 * and Candidate_Height data members. Also create a method		 
		  GetCandidateDetails() and DisplayCandidateDetails().
		   Create main method to demonstrate the Candidate class.
		*/
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter number of candidates.");
		n = sc.nextInt();
		
		Candidate [] c = new Candidate[n];
		for(int i=0;i<n;i++)
		{
			c[i] = new Candidate();
			c[i].getCandidateDetails();
			c[i].displayCandidateDetails();
			
			
		}
		
	}

}
class Candidate{
	int candidate_ID , candidate_Age, candidate_Weight,candidate_Height;
	String candidate_Name;
		void getCandidateDetails()
		{
			Scanner sc = new Scanner(System.in);
			//System.out.println("Enter the details of the candiate.\n\n");
			
			
			System.out.println("Enter the Name:");
			candidate_Name = sc.nextLine();
			
			
			System.out.println("Enter the candidate ID:");
			candidate_ID = sc.nextInt();
			
			
			
			System.out.println("Enter the candidate age:");
			candidate_Age = sc.nextInt();
			
			System.out.println("Enter the candidate weight:");
			candidate_Weight = sc.nextInt();
			
			System.out.println("Enter the candidate Height:");
			candidate_Height = sc.nextInt();
		}
		
		void displayCandidateDetails()
		{
			//System.out.println("Displaying candidate details.\n\n");
			
			System.out.println("Candidate's Name: "+ candidate_Name);
			System.out.println("Candidate's ID: "+ candidate_ID);
			System.out.println("Candidate's Age: "+ candidate_Age);
			System.out.println("Candidate's Weight: "+ candidate_Weight);
			System.out.println("Candidate's Height:"+ candidate_Height);
		}
			

}
