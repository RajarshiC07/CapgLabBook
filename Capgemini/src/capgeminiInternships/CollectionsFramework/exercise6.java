package capgeminiInternships.CollectionsFramework;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class exercise6 {
	public List<Integer> votersList(HashMap<Integer,Date> hm)
	{
		List<Integer> ll = new LinkedList<Integer>();
		Date dt = new Date();
		LocalDate ldt = dt.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		for(Map.Entry<Integer,Date> entry: hm.entrySet())
		{
			if(ldt.getYear() - entry.getValue().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear() >=18)
				ll.add(entry.getKey());
		}
		return ll;
	}
	public static void main(String a[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Date> hm = new HashMap<Integer,Date>();
		boolean valid = true;
		while(valid)
		{
			String s[] = sc.nextLine().trim().split(" ");
			if(s.length == 2)
			{
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
				Date dt = sdf.parse(s[1]);
				hm.put(Integer.parseInt(s[0]),dt);
			}
			else
				valid = false;
		}
		exercise6 obj = new exercise6();
		System.out.println(obj.votersList(hm));	
	sc.close();
	}
}
