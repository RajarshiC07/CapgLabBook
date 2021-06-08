package capgeminiInternships.lambdaExpressionsStreamAPI;

import java.util.Scanner;

interface modify
{
	 String modifyString(String str);
}
public class exercise2 {

	public exercise2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		modify obj = (String str) -> { String s = "";
									   for(int i = 0;i<str.length();i++)
										   s+=str.charAt(i)+" ";
										return s;};
		System.out.println(obj.modifyString(sc.nextLine()));
		sc.close();
	}

}
