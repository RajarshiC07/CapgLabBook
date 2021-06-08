package capgeminiInternships.InheritancePolymorphism.com.cg.eis.bean;

import capgeminiInternships.InheritancePolymorphism.com.cg.eis.exception.EmployeeException;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private String designation;
	private String insuranceScheme;
	public Employee(int id, String name, int salary, String designation, String insuranceScheme)throws EmployeeException{
		super();
		this.id = id;
		this.name = name;
		if(salary<3000)
			throw new EmployeeException(salary);
		else
			this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}
	public Employee()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary)throws EmployeeException{
		if(salary<3000)
			throw new EmployeeException(salary);
		else
			this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
}
