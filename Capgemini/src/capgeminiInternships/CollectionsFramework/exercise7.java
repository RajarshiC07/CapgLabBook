package capgeminiInternships.CollectionsFramework;

import java.util.Arrays;
import java.util.Scanner;

public class exercise7 {
		public int[] getSorted(int arr[])
		{
			for(int i =0;i<arr.length;i++)
			{
				StringBuffer s = new StringBuffer(String .valueOf(arr[i]));
				s.reverse();
				arr[i] = Integer.parseInt(s.toString());
			}
			Arrays.sort(arr);
			return arr;
		}
		public static void main(String a[])throws Exception
		{
			Scanner sc = new Scanner(System.in);
			String s[] = sc.nextLine().trim().split(" ");
			int arr[] = new int[s.length];
			for(int i =0;i<s.length;i++)
				arr[i] = Integer.parseInt(s[i]);
			exercise7 obj = new exercise7();
			System.out.println(Arrays.toString(obj.getSorted(arr)));
			sc.close();
		}
	}
