package capgeminiInternships.flowControlOperatorsAssignments;

import java.util.Scanner;

public class exercise7 {
	public boolean checkNumber(int n)
	{
		String s = String.valueOf(n);
		for(int i =0;i<s.length()-1;i++)
		{
			if(Character.getNumericValue(s.charAt(i)) > Character.getNumericValue(s.charAt(i+1)))
				return false;
		}
		return true;
	}
	public static void main(String a[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		exercise7 obj = new exercise7();
		System.out.println(obj.checkNumber(val));
		sc.close();
	}
}
