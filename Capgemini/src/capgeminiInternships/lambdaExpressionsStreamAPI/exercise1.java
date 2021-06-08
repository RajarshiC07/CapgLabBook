package capgeminiInternships.lambdaExpressionsStreamAPI;

import java.util.Scanner;

interface powerExp
{
	 double getPower(int x,int y);
}

public class exercise1 {
	public exercise1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)throws Exception {
			Scanner sc = new Scanner(System.in);
			String s[] = sc.nextLine().trim().split(" ");
			powerExp obj = (int x,int y) -> { return Math.pow(x, y);};
			System.out.println(obj.getPower(Integer.parseInt(s[0]),Integer.parseInt(s[1])));
			sc.close();
	}
}
