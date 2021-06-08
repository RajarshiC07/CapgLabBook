package capgeminiInternships.flowControlOperatorsAssignments;

import java.util.Scanner;

public class exercise5 {
	public int calculateSum(int n)
	{
		int sum = 0;
		for(int i =1;i<=n;i++)
		{
			if(i%3 == 0 && i%5 == 0)
				continue;
			if(i%5 == 0)
				sum+=i;
			if(i%3 == 0)
				sum+=i;
		}
		return sum;
	}
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		exercise5 obj = new exercise5();
		int n = sc.nextInt();
		System.out.println(obj.calculateSum(n));
		sc.close();
	}
}
