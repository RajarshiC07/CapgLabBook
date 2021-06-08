package capgeminiInternships.fileHandling;

import java.io.FileInputStream;
import java.util.Scanner;

public class exercise1 {
	public static void main(String a[])throws Exception
	{
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int count = 1;
		FileInputStream fis=new FileInputStream(s);       
		Scanner sc =new Scanner(fis);     
		while(sc.hasNextLine())  
		{  
			System.out.print(count+" ");    
			count++;
			System.out.println(sc.nextLine());      
		}  
		sc.close();
		scanner.close();
	}
}
