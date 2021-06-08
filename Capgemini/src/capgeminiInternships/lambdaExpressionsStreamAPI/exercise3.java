package capgeminiInternships.lambdaExpressionsStreamAPI;

import java.util.Scanner;

interface userPassword
{
	boolean validate(String userName,String password);
}
public class exercise3 {

	public exercise3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s[] = sc.nextLine().trim().split(" ");
		userPassword obj = (String user,String password) -> {if(user.equals("Rajarshi") && password.equals("Rajarshi"))
																	return true;
																else
																	return false;};
		System.out.println(obj.validate(s[0], s[1]));																
		sc.close();
	
	}

}
