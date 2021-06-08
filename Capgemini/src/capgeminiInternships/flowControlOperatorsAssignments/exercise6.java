package capgeminiInternships.flowControlOperatorsAssignments;

import java.util.Scanner;

public class exercise6 {
	public int calculateDifference(int n)
	{
		int sumOfSquares = 0,squareOfSum = 0;
		for(int i = 1;i<=n;i++)
		{
			sumOfSquares+=(i*i);
			squareOfSum+=i;
		}
		return sumOfSquares-(squareOfSum*squareOfSum);
		
	}
	public static void main(String a[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		exercise6 obj = new exercise6();
		System.out.println(obj.calculateDifference(val));
		sc.close();
	}
}
