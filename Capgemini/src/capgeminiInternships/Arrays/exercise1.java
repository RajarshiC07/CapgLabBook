package capgeminiInternships.Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class exercise1 {
	public int getSecondSmallest(int arr[])
	{
		Arrays.sort(arr);
		return arr[1];
	}
	public static void main(String a[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String s[] = sc.nextLine().trim().split(" ");
		int arr[] = new int[s.length];
		for(int i =0;i<s.length;i++)
			arr[i] = Integer.parseInt(s[i]);
		exercise1 obj = new exercise1();
		System.out.println(obj.getSecondSmallest(arr));
		sc.close();
	}
}
