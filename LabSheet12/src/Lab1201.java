import java.util.*;
import java.io.*;
public class Lab1201 
{
	public static void main(String[] args) throws IOException
	{
		// use Scanner Class read data from file
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		while(readFile.hasNext()) 
		{
			String fname = readFile.next();
			String lname = readFile.next(); //readFile.next();
			readFile.next();
			String email = readFile.next().toUpperCase();
			lname.charAt(0);
			
			System.out.println(lname.charAt(0)+"."+fname + " " + "(" + email + ")");
		}
		readFile.close();
	}
}