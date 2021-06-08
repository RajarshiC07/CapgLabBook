package capgeminiInternships.fileHandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;
public class exercise2 {
	public static void main(String args[])throws IOException
	{
		Scanner sc = new Scanner(System.in);
		String filename = sc.nextLine();
		File f = new File(filename);
		System.out.println("File name: "+f.getName());
		try {
			System.out.println("File type: "+Files.probeContentType(f.toPath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File exists: "+f.exists());
		System.out.println("File is readable: "+f.canRead());
		System.out.println("File is writable: "+f.canWrite());
		System.out.println("length of the file: "+f.length()+" bytes");
		sc.close();
		// src\capgeminiInternships\StringParse\Untitled 1
	}
}