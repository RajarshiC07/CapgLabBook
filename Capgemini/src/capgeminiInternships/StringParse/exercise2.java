package capgeminiInternships.StringParse;


import java.util.Scanner;

public class exercise2 {
	public String getImage(String s)
	{
		StringBuffer str = new StringBuffer(s);
		str.reverse();
		return s+"|"+str;
	}
	public static void main(String a[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		exercise2 obj = new exercise2();
		System.out.println(obj.getImage(s));
		sc.close();
	}
}
