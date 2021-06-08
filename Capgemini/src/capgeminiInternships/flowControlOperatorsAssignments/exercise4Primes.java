package capgeminiInternships.flowControlOperatorsAssignments;

import java.util.Scanner;

public class exercise4Primes {
	public static boolean isPrime(int n)
	{
		if(n <= 1)
			return false;
		else
		{
			for(int i =  2;i<=n/2;i++)
			{
				if(n%i == 0)
					return false;
			}
		}
		return true;
	}

	public static void main(String a[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i<=n;i++)
		{
			if(isPrime(i))
				System.out.print(i+" ");
		}
		sc.close();
	}
}
