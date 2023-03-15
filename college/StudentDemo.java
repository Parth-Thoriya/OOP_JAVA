package college;


import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		Student s0 = new Student();
		Student s01 = new Student("null","null","male",0.00f);
		Student [] s;
		
		
		int n;
		System.out.println("Enter number of students: ");
		n = sc.nextInt();
		s = new Student[n];
		  for(int i = 0;i<n;i++) 
		  {		
			  s[i]= new Student();
			 s[i].getField();
			 System.out.println("Enter the data of next student");

		 }
		 for(int i =0;i<n;i++)
		 {
			 s[i].dispaly();
		 }
		 
		 System.out.println("total number of objects"+Student.count);
	}

}
class Student
{
	static int count=0;
	String enrolmentNo;
	String  name;
	String gender ;
	float marks;
		
	Student()
	{
		count++;
		enrolmentNo = "emty";
		name = "emty";
		gender = "male";
		marks = 0.00f;
		
		if(count==1)
		{
			System.out.println("Constructor without arguments");
			dispaly();
		}
		
	}
	Student(String enrolmentNo ,String  name ,String gender ,float marks)
	{
		count++;
		 this.enrolmentNo = enrolmentNo;
		 this.name = name;
		 this.gender = gender;
		 this.marks = marks;
		 System.out.println("Constructor with arguments");
			dispaly();
			
		
	}
		void getField() 
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter enrolment number: ");
			enrolmentNo = sc.nextLine();
			
			System.out.print("Enter Name: ");
			name  = sc.nextLine();
			
			System.out.print("Enter your gender: ");
			gender = sc.next();
			
			System.out.print("Enter your marks: ");
			marks = sc.nextFloat();
		}
	
		void dispaly()
		{
			
			
			
			System.out.println("Enrolment number: "+enrolmentNo);
			System.out.println("Name: "+name);
			System.out.println("Gender:"+gender);
			System.out.println("Marks: "+marks);
			
		}
}