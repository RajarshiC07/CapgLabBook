package capgeminiInternships.CollectionsFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercise2 {
	public Map<Character,Integer> countChars(char arr[])
	{
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
		for(int i = 0;i<arr.length;i++)
		{
			if(mp.containsKey(arr[i]))
				mp.put(arr[i], mp.get(arr[i])+1);
			else
				mp.put(arr[i],1);
		}
		return mp;
	}
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().trim();
		char c[] = new char[s.length()];
		for(int i = 0;i<s.length();i++)
		{
			c[i] = s.charAt(i);
		}
		exercise2 obj = new exercise2();
		System.out.println(obj.countChars(c));	
	sc.close();
	}
}
