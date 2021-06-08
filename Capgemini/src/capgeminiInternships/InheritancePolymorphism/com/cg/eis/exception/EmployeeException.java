package capgeminiInternships.InheritancePolymorphism.com.cg.eis.exception;

public class EmployeeException extends Exception{
	
	private static final long serialVersionUID = -4865152707865693625L;
	public EmployeeException()
	{
		
	}
	public EmployeeException(int salary)
	{
		System.out.println("Salary "+salary+"is less than 3000");
	}
}
