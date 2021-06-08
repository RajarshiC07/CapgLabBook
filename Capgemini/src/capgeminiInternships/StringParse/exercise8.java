package capgeminiInternships.StringParse;

import java.util.Scanner;

public class exercise8 {
	public boolean positiveString(String s)
	{
		for(int i=0;i<s.length()-1;i++)
		{
			if(String.valueOf(s.charAt(i)).compareToIgnoreCase(String.valueOf(s.charAt(i+1)))>0)
					return false;
		}
		return true;
	}
	public static void main(String a[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		exercise8 obj = new exercise8();
		System.out.println(obj.positiveString(s));
		sc.close();
	}
}
