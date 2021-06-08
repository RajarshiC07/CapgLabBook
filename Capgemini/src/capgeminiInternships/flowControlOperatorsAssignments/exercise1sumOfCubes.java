package capgeminiInternships.flowControlOperatorsAssignments;

import java.util.Scanner;

public class exercise1sumOfCubes {
	int sumOfCubes(int num)
	{
		int n = num,d,sum=0;
		while(n>0)
		{
			d = n%10;
			sum+=Math.pow(d, 3);
			n = n/10;
		}
		return sum;
	}
	public static void main(String a[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		exercise1sumOfCubes obj = new exercise1sumOfCubes();
		System.out.println(obj.sumOfCubes(sc.nextInt()));
		sc.close();
	}
}

