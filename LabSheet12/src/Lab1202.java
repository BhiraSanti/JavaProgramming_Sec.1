import java.util.*;
import java.io.*;
public class Lab1202
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan= new Scanner(System.in);
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		System.out.print("Input your Email here : ");
		String email=scan.next();
		boolean check = false;
		
		while(readFile.hasNext()) 
		{
			readFile.next();
			readFile.next();
			String password = readFile.next();
			String Email =readFile.next().toUpperCase();
			
				if(email.equalsIgnoreCase(Email)) 
				{
					System.out.print("Your password is : " + password);
					check = true;
					
					if(check)
					{
						break;
					}
				}
					else
						check=false;
		}
		
		if(check==false) 
			{
				System.out.print("The data not found...");
			}
		readFile.close();
	}
}
