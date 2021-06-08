package capgeminiInternships.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class exercise3 {
	public int getSorted(int arr[])
	{
		String str = "";
		for(int i =0;i<arr.length;i++)
		{
			StringBuffer s = new StringBuffer(String .valueOf(arr[i]));
			arr[i] = Integer.parseInt(s.reverse().toString());
		}
		Arrays.sort(arr);
		for(int i:arr)
			str+=i;
		return Integer.parseInt(str);
	}
	public static void main(String a[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String s[] = sc.nextLine().trim().split(" ");
		int arr[] = new int[s.length];
		for(int i =0;i<s.length;i++)
			arr[i] = Integer.parseInt(s[i]);
		exercise3 obj = new exercise3();
		System.out.println(obj.getSorted(arr));
		sc.close();
	}
}
