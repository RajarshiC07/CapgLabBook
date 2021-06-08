package capgeminiInternships.CollectionsFramework;

import java.util.Collections;
//import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class exercise1 {
	/*public static List<Object> sort(HashMap<Object,Object> h1)
	{
		List<Object> l1 = new LinkedList<Object>();
		for ( Map.Entry<Object,Object> entry : h1.entrySet())
		{
			l1.add(entry.getValue());
		}
		Collections.sort(l1,new Comparator<Object>() {
				public int compare(Object obj1,Object obj2)
				{
					return obj1.toString().compareToIgnoreCase(obj2.toString());
				}
		});
		return l1;
	}*/
	public static List<Integer> sort(HashMap<Integer,Integer> h1)
	{
		List<Integer> l1 = new LinkedList<Integer>();
		for ( Map.Entry<Integer,Integer> entry : h1.entrySet())
		{
			l1.add(entry.getValue());
		}
		Collections.sort(l1);
		return l1;
	}
	public static void main(String a[])throws Exception
	{
		HashMap<Integer,Integer> h1 = new HashMap<Integer,Integer>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<5;i++)
		{
			String s[] = sc.nextLine().trim().split(" ");
			h1.put(Integer.parseInt(s[0]),Integer.parseInt(s[1]));
		}
		System.out.print(sort(h1));
		sc.close();
	}
}
