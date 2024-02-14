import java.io.*;
import java.util.*;
public class SaveandOpen extends Employee
{
	
	private String name;
	private String dept;
	
	public void insert() throws IOException
	{
		Scanner scan = new Scanner(System.in);
		PrintStream writeFile = new PrintStream(new File("d://txtFile//employee.txt"));
		String answer;
		
		do 
		{
			header();
			
			System.out.print("Enter name : ");
			name = scan.next();
			System.out.print("Enter Departmant : ");
			dept = scan.next();

			//save all data to file
			writeFile.println(name+"\t"+dept);
			
			System.out.print("Enter data again? : ");
			answer = scan.next().toLowerCase();
		}
		while(answer.equals("y"));
		writeFile.close();
	}
	
	public void read() 
	{
		try 
		{
			Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			boolean check = false;
			header();
			int i=1;
			while(readFile.hasNext()) 
			{
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) 
				{
					System.out.println(name);
					i++;
					check=true;
				}
			}
			if(check==false) 
			{
				System.out.println("\nSorry, no department : "+super.getDept()+" in file");
			}
			else if(check==true) 
			{
				header();
				System.out.print("Employee in dept : "+super.getDept()+" is "+(i-1)+" person.");
			}
		}
		
		catch(IOException e ) 
		{
			System.out.println("\nSorry, File not found...");
		}
	}
}
