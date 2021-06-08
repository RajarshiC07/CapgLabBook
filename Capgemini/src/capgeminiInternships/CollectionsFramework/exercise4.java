package capgeminiInternships.CollectionsFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercise4 {
	public Map<Integer,String> getStudents(HashMap<Integer,Integer> hm)
	{
		Map<Integer,String> mp = new HashMap<Integer,String>();
		for(Map.Entry<Integer, Integer> entry:hm.entrySet())
		{
			if(entry.getValue() >=90)
				mp.put(entry.getKey(), "Gold");
			else if(entry.getValue() >=80 && entry.getValue() < 90)
				mp.put(entry.getKey(), "Silver");
			else if(entry.getValue() >=70 && entry.getValue() < 80)
				mp.put(entry.getKey(), "Bronze");
		}
		return mp;
	}
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		boolean valid = true;
		while(valid)
		{
			String s[] = sc.nextLine().trim().split(" ");
			if(s.length == 2)
				hm.put(Integer.parseInt(s[0]),Integer.parseInt(s[1]));
			else
				valid = false;
		}
		exercise4 obj = new exercise4();
		System.out.println(obj.getStudents(hm));	
	sc.close();
	}
}
