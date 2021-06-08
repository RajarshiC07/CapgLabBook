package capgeminiInternships.Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class exercise4 {
	public int[] modifyArray(int arr[])
	{
		TreeSet<Integer> h1 = new TreeSet<Integer>();
		for(int i =0;i<arr.length;i++)
			h1.add(arr[i]);
		int result[] = new int[h1.size()];
		for(int i = h1.size()-1;i>=0;i--)
		{	result[i] = h1.first();
			h1.remove(h1.first());
		}
		return result;
	}
	public static void main(String a[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String s[] = sc.nextLine().trim().split(" ");
		int arr[] = new int[s.length];
		for(int i =0;i<s.length;i++)
			arr[i] = Integer.parseInt(s[i]);
		exercise4 obj = new exercise4();
		System.out.println(Arrays.toString(obj.modifyArray(arr)));
		sc.close();
	}
}
