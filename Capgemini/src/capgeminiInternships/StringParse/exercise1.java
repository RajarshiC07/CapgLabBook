package capgeminiInternships.StringParse;

import java.util.Scanner;
import java.util.StringTokenizer;

public class exercise1 {
	public static void main(String a[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s," ");  
		int sum = 0;
		while (st.hasMoreTokens()) {  
		         System.out.println(st.nextToken());
		 } 
		 st = new StringTokenizer(s," ");  
		while (st.hasMoreTokens()) {  
	         sum+=Integer.parseInt(st.nextToken());
		} 
		System.out.println(sum);
		sc.close();
	}
}