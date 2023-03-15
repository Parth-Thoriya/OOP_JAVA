package college;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4. WAP with following specifications:
Class Name: Employee
Data Members: Employee_ID, Employee_Name, Designation, Age, Salary
Member Functions: GetEmployeeDetails () and DisplayEmpolyeeDetails ().*/
		Employee e = new Employee();
		e.getEmployeeDetails();
		e.displayEmployeeDetails();
		
	}

}
class Employee{
	int employee_ID , employee_Age, salary;
	String employee_Name,designation;
		void getEmployeeDetails()
		{
			Scanner sc = new Scanner(System.in);
			//System.out.println("Enter the details of the candiate.\n\n");
			
			
			System.out.println("Enter the Name:");
			employee_Name = sc.next();
			
			System.out.println("Enter the Designation:");
			designation = sc.next();
			
			System.out.println("Enter the employee ID:");
			employee_ID = sc.nextInt();
			
			
			
			System.out.println("Enter the employee age:");
			employee_Age = sc.nextInt();
			
			System.out.println("Enter the Salary:");
			salary= sc.nextInt();
			
			
		}
		
		void displayEmployeeDetails()
		{
			//System.out.println("Displaying candidate details.\n\n");
			
			System.out.println("Employee's Name: "+ employee_Name);
			System.out.println("Employee's ID: "+ employee_ID);
			System.out.println("Employee's Age: "+ employee_Age);
			System.out.println("Designation: "+ designation);
			System.out.println("Salary:"+ salary);
		}
			

}
