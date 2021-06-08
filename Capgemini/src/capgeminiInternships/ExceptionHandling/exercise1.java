package capgeminiInternships.ExceptionHandling;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	private static final long serialVersionUID = 1L;

	InvalidAgeException()
	{
		System.out.println("Age of a person should be above 15");
	}
}
public class exercise1 {
	public static void main(String a[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age < 15) {
			extracted();
		}
		sc.close();
	}

	private static void extracted() throws InvalidAgeException {
		throw new InvalidAgeException();
	}
}
