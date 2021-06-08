package capgeminiInternships.lambdaExpressionsStreamAPI.StreamAPI;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeService {

	public EmployeeService() {
		// TODO Auto-generated constructor stub
	}
	public Double sumOfEmpSalary(Stream<Employee> str)
	{
		return str.collect(Collectors.summingDouble((i)->i.getSalary()));
	}
	public void durationOfServices(Stream<Employee> str)
	{
		LocalDate current = LocalDate.now();
		str.forEach((i)->System.out.println(i.getFirstName()+" "+i.getLastName()+" Duration in months"+(current.getMonthValue()-i.getHireDate().getMonthValue())+" Duration in days"+(current.getDayOfYear()-i.getHireDate().getDayOfYear())));
	}
	public List<Employee> employeeWithoutDepartment(Stream<Employee> str)
	{
		return str.filter((i)->(i.getDepartment()==null)?true:false).collect(Collectors.toList());
	}
	public void empNameHireDateDayOfWeek(Stream<Employee> str)
	{
		str.forEach((i)->System.out.println(i.getFirstName()+" "+i.getLastName()+" hire date: "+i.getHireDate()+" day of week: "+i.getHireDate().getDayOfWeek()));
	}
	public void empNameHireDateDayOfWeekOnFriday(Stream<Employee> str)
	{
		str.filter((i)->((i.getHireDate().getDayOfWeek().toString() == "FRIDAY")?true:false )).forEach((i)->System.out.println(i.getFirstName()+" "+i.getLastName()+" hire date: "+i.getHireDate()+" day of week: "+i.getHireDate().getDayOfWeek()));
	}
	public void employeeIncreased(Stream<Employee> str)
	{
		str.map((i)-> "Name: "+i.getFirstName()+" "+i.getLastName()+" Salary: "+i.getSalary()+" Increased Salary: "+i.getSalary()*1.15).forEach((i)->System.out.println(i));
	}
	public Employee seniorMostEmployee(Stream<Employee> str)
	{
		return str.max((x,y)->x.getHireDate().compareTo(y.getHireDate())).get();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Stream<Employee> str = new EmployeeRepository().getList().stream();

	}

}
