package capgeminiInternships.CollectionsFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercise3 {
	public Map<Integer,Integer> getSquares(int arr[])
	{
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		for(int i = 0;i<arr.length;i++)
		{
				mp.put(arr[i],arr[i]*arr[i]);
		}
		return mp;
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
		exercise3 obj = new exercise3();
		System.out.println(obj.getSquares(c));	
	sc.close();
	}
}
