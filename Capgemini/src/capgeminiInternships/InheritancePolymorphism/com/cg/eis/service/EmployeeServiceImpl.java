package capgeminiInternships.InheritancePolymorphism.com.cg.eis.service;

import java.util.HashMap;

import capgeminiInternships.InheritancePolymorphism.com.cg.eis.bean.Employee;

interface EmployeeService {
	void employeeDetails(int key);

	String EmployeeInsuranceScheme();

	void displayDetails();
}

public class EmployeeServiceImpl implements EmployeeService {
	private static Employee emp = null;
	private static HashMap<Integer,Employee> ll = new HashMap<Integer,Employee>();

	public EmployeeServiceImpl() {
	}
	public void addEmployee(Employee em) {
		ll.put(em.getId(),em);
	}

	public void employeeDetails(int key) {
		if (ll.containsKey(key))
		{
			emp = ll.get(key);
			System.out.println(ll.get(key));
		}
		else
			System.out.println("Emp Id not present");
	}

	public String EmployeeInsuranceScheme() {
		if(emp == null)
		{
			System.out.println("Employee not defined");
			return null;
		}
		else
		{
			if(emp.getSalary()>50000)
				return "Large Insuarance";
			else if(emp.getSalary()<20000)
				return "Small Insuarance";
			else
				return "Medium Insuarance";
		}
	}

	public void displayDetails() {
		if(emp == null)
			System.out.println("Employee not defined");
		else
			System.out.println(emp);
	}
}
