package capgeminiInternships.StringParse;

import java.util.Scanner;

public class exercise4 {
	public int modifyNumber(int n)
	{
		StringBuffer str = new StringBuffer(String.valueOf(n));
		String s = String.valueOf(n);
		for(int i = 0;i<s.length()-1;i++)
		{
			int diff = Math.abs(Character.getNumericValue(s.charAt(i)) - Character.getNumericValue(s.charAt(i+1)));
			str.replace(i, i+1, String.valueOf(diff));
		}
		return Integer.parseInt(String.valueOf(str));
	}
	public static void main(String a[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		exercise4 obj = new exercise4();
		System.out.println(obj.modifyNumber(n));
		sc.close();
	}
}