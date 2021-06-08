package capgeminiInternships.InheritancePolymorphism.com.cg.eis.pl;

import java.util.Scanner;

import capgeminiInternships.InheritancePolymorphism.com.cg.eis.bean.Employee;
import capgeminiInternships.InheritancePolymorphism.com.cg.eis.service.EmployeeServiceImpl;

public class applicationClass {
	public static void main(String a[])throws Exception
	{
		System.out.println("Enter 1 to get employee details \nEnter 2 to get employee key \nEnter 3 to find Insuarance \nEnter 4 to display Employee details \nEnter 0 to exit");
		EmployeeServiceImpl e =  new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		String s;
		boolean valid = true;
		while(valid)
		{
			 s = sc.nextLine();
			int val = Integer.parseInt(s);
			switch(val)
			{
				case 1:
					String s1[] = sc.nextLine().trim().split(" ");
					Employee emp = new Employee(Integer.parseInt(s1[0]),s1[1],Integer.parseInt(s1[2]),s1[3],s1[4]);
					e.addEmployee(emp);
					break;
				case 2:
					s = sc.nextLine();
					e.employeeDetails(Integer.parseInt(s));
					break;
				case 3:
					System.out.println(e.EmployeeInsuranceScheme());
					break;
				case 4:
					e.displayDetails();
					break;
				case 0:
					valid = false;
					break;
				default:
					System.out.println("Invalid Input");
					break;
			}
		}
		sc.close();
	}
}
