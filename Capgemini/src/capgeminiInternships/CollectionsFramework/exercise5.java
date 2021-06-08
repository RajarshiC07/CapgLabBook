package capgeminiInternships.CollectionsFramework;

import java.util.Arrays;
import java.util.Scanner;

public class exercise5 {
	public int getSecondSmallest(int arr[])
	{
		Arrays.sort(arr);
		return arr[1];
	}
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		String s[] = sc.nextLine().trim().split(" ");
		int c[] = new int[s.length];
		for(int i = 0;i<s.length;i++)
		{
			c[i] = Integer.parseInt(s[i]);
		}
		exercise5 obj = new exercise5();
		System.out.println(obj.getSecondSmallest(c));	
	sc.close();
	}
}
