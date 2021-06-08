package capgeminiInternships.StringParse;

import java.util.Scanner;

public class exercise3 {
	public String alterString(String s)
	{
		String str = "";
		String ss[] = s.split("");
		for(int i = 0;i<ss.length;i++)
		{
			if(ss[i].equalsIgnoreCase("a") || ss[i].equalsIgnoreCase("e") || ss[i].equalsIgnoreCase("i") || ss[i].equalsIgnoreCase("o") || ss[i].equalsIgnoreCase("u"))
				str+=ss[i];
			else
				str+=(char)(s.charAt(i)+1);
		}
		return str;
	}
	public static void main(String a[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		exercise3 obj = new exercise3();
		System.out.println(obj.alterString(s));
		sc.close();
	}
}
