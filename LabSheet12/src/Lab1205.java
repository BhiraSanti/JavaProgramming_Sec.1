import java.io.*;
import java.util.Scanner;
 
public class Lab1205 
{
 
	public static void main(String[] args) throws IOException
	{
		Scanner readFile = new Scanner(new File("d://txtfile//student.txt"));
		int i = 0;
		Head();
		while(readFile.hasNext())
		{
			String id = readFile.next();
			readFile.next();
			String Fname = readFile.next();
			String Lname = readFile.next();
			double grade = readFile.nextDouble();
			readFile.next();
			i++;
			System.out.println(i+".\t"+id+"\t"+Level(id)+"\t"+Fname.charAt(0)+"."+Lname+"\t"+grade+"\t"+status(grade) );
		}
		readFile.close();
	}
	public static String Level(String Id)
	{
		if(Integer.parseInt(Id.substring(0,2)) == 18)
		{
			return "4th";
		}
		else
		{
			return "3th";
		}
	}
	public static String status(double _grade)
	{
		if(_grade > 2.00)
		{
			return "Pass";
		}
		else if(_grade < 1.00)
		{
			return "Retired";
		}
		else return "Critical";
	}
	public static void Head()
	{
		System.out.println("No.\tID\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("**********************************************************************");
	}
}