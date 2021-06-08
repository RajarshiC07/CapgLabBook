package capgeminiInternships.flowControlOperatorsAssignments;

import java.util.Scanner;

public class exercise8 {
	public boolean checkNumber(int num)
	{
		int n = num;
		while(n>1)
		{
			if(n%2 == 1)
				return false;
			n = n/2;
		}
		return true;
	}
	public static void main(String a[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		exercise8 obj = new exercise8();
		System.out.println(obj.checkNumber(val));
		sc.close();
	}
}
