package capgeminiInternships.StringParse;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class exercise9 {
	public void getTime(Date d)
	{
		
	}
	public void getDuration(String s)
	{
		Date d = validate(s);
	    LocalDate ldt = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		if(ldt == null)
			System.out.println("Invalid Date");
		else
		{	
			LocalDate currDate = LocalDate.now();
			System.out.println("Number of Months "+Math.abs(ldt.getMonthValue() - currDate.getMonthValue()));
			System.out.println("Number of Days "+Math.abs(ldt.getDayOfMonth() - currDate.getDayOfMonth()));
			System.out.println("Number of Years "+Math.abs(ldt.getYear() - currDate.getYear()));
		} 
	}
	public Date validate(String s)
	{
		 String str[] = {"dd/MM/yyyy","dd.MM.yyyy","dd-MM-yyyy","dd/MMM/yyyy","dd.MMM.yyyy","dd-MMM-yyyy"};
		  Date javaDate1;
		  for(int i = 0;i<str.length;i++)
	        {
	            try
	            {
	                SimpleDateFormat sdfrmt = new SimpleDateFormat(str[i]);          
	                sdfrmt.setLenient(false);
	                javaDate1 = sdfrmt.parse(s);    
	                return javaDate1;
	             }
	            catch (ParseException e)
	            {
	            }
	         
	        }
		   return null;
	}
	public static void main(String a[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		exercise9 obj = new exercise9();
		obj.getDuration(s);
		sc.close();
	}
}
