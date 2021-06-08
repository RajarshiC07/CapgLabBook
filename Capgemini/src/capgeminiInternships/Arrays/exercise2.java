package capgeminiInternships.Arrays;


import java.text.Collator;
import java.util.Arrays;
import java.util.Scanner;
public class exercise2 {
	public String sortStrings(String arr[])
	{
		Arrays.sort(arr,Collator.getInstance());
		int half = 0;
		if(arr.length % 2 == 0)
			half = arr.length/2;
		else
			half = arr.length/2 + 1;
		for(int i = 0;i<half;i++)
			arr[i] = arr[i].toUpperCase();
		for(int i = half;i<arr.length;i++)
			arr[i] = arr[i].toLowerCase();
		return Arrays.toString(arr);
	}
	public static void main(String a[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String s[] = sc.nextLine().trim().split(" ");
		exercise2 obj = new exercise2();
		System.out.println(obj.sortStrings(s));
		sc.close();
	}
}
