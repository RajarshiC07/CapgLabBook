package capgeminiInternships.MultiThreading;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
class CopyDataThread implements Runnable
{
	private Thread thread;
	FileReader rd;
	FileWriter wt;
	CopyDataThread()
	{
		
	}
	CopyDataThread(String name,FileReader rd,FileWriter wt)
	{
		thread = new Thread();
		thread.setName(name);
		this.rd = rd;
		this.wt = wt;
	}
	public Thread getThread() {
		return thread;
	}
	public void setThread(Thread thread) {
		this.thread = thread;
	}
	public FileReader getRd() {
		return rd;
	}
	public void setRd(FileReader rd) {
		this.rd = rd;
	}
	public FileWriter getWt() {
		return wt;
	}
	public void setWt(FileWriter wt) {
		this.wt = wt;
	}
	public void run()
	{
		System.out.println("thread Name "+thread.getName());
		int count = 0;
		int ch;
		try {
			while((ch = rd.read())!=-1)
			{
				if(count == 10)
				{
					System.out.println("10 characters copied ");
					count = 0;
					Thread.sleep(5000);
				}
				wt.write((char)ch);
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class FileProgram {
	public static void main(String a[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String pathofInputFile = sc.nextLine();
		String pathofOutputFile = sc.nextLine();
		CopyDataThread cdt = new CopyDataThread(name,new FileReader(pathofInputFile),new FileWriter(pathofOutputFile));
		cdt.run();
		sc.close();
	/* paths
	 * MyThread
	src\capgeminiInternships\StringParse\Untitled 1
	src\capgeminiInternships\StringParse\test.txt
	 */
	 
	}
}
