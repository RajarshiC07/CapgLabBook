package capgeminiInternships.MultiThreading;

import java.util.Scanner;

class NewThread implements Runnable
{
	Thread thread;
	int setDuration;
	NewThread(int setDuration)
	{
		thread = new Thread();
		this.setDuration = setDuration;
		thread.setName("Timer");
	}
	
	static int count = 1;
	public void run()
	{
		while(count<=(this.setDuration))
		{
			System.out.println(thread.getName()+" "+count%10);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count++;
		}
	}
}
public class exercise2 {
	public static void main(String a[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		NewThread nt = new NewThread(sc.nextInt());
		nt.run();
		sc.close();
	}
}
