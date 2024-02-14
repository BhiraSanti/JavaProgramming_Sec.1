import java.io.*;
import java.util.*;
public class EmployeeInfo 
{

	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		String choice,department;
		System.out.print("Insert or Read data? : ");
		choice =scan.next().toLowerCase();
		
		while(!(choice.equals("insert")) && !(choice.equals("read"))) 
		{
			System.out.print("Please type insert or readdata, again : ");
			choice =scan.next().toLowerCase();
		}
		
		SaveandOpen obj = new SaveandOpen();
		if(choice.equals("insert")) 
		{
			obj.insert();
		}
		else if(choice.equals("read")) 
		{
			System.out.print("\nEnter department : ");
			department = scan.next();
			obj.setDept(department);
			obj.read();
		}
	}

}
