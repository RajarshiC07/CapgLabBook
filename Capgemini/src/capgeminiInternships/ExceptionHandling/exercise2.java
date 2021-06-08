package capgeminiInternships.ExceptionHandling;

import java.util.Scanner;

class InvalidNameException extends Exception
{
	private static final long serialVersionUID = 1L;

	InvalidNameException()
	{
		System.out.println("Name is blank");
	}
}
public class exercise2 {
	public static void main(String a[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		if(firstName.isBlank())
			extracted();
		String lastName = sc.nextLine();
		if(lastName.isBlank())
			extracted();
		sc.close();
	}
	private static void extracted() throws InvalidNameException {
		throw new InvalidNameException();
		
	}
}
