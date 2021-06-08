package capgeminiInternships.StringParse;

import java.io.FileReader;
import java.util.Scanner;

public class exercise5 {
	public void count(String s)throws Exception
	{
		int numOfWords = 0;
		int numOfLetters = 0;
		int numOfLines = 0;
		FileReader rd = new FileReader(s);
		int ch;
		while((ch = rd.read()) != -1)
		{
			if(ch == ' ' || ch == '.')
			{
				numOfWords++;
			}
			else if(ch == '\n')
			{
				numOfLines++;
				numOfWords++;
			}
			else
			{
				numOfLetters++;		
			}
		}
		rd.close();
		//src/capgeminiInternships/StringParse/Untitled 1
		System.out.println("Number of lines"+numOfLines);
		System.out.println("Number of words"+numOfWords);
		System.out.println("Number of letters"+numOfLetters);
	}
	public static void main(String a[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		exercise5 obj = new exercise5();
		obj.count(s);
		sc.close();
	}
}
