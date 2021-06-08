package capgeminiInternships.flowControlOperatorsAssignments;

import java.util.Scanner;

public class exercise3fibonacci {
	static int count;
	public int recursiveFibonacci(int n)
	{
		if(n<=1)
			return 1;
		else
			return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
	}
	public int nonRecursiveFibonacci(int n)
	{
		int a = 1,b = 1,c = 1;
		for(int i = 2;i<=n;i++)
		{
			c = a+b;
			a = b;
			b = c;
		}
		return c;
	}
	public static void main(String a[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		exercise3fibonacci obj = new exercise3fibonacci();
		int value = sc.nextInt();
		System.out.println(obj.nonRecursiveFibonacci(value));
		System.out.println(obj.recursiveFibonacci(value));
		sc.close();
	}
}
