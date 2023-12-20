import java.util.*;
public class Example603 
{

		static Scanner scan = new Scanner(System.in);	
		
	public static void main(String[] args)
	{
		System.out.print("Please enter your name, seperate by a space.\n: ");
		String Fullname = scan.nextLine();
		int result = Fullname.indexOf(' ');
		String firstname = Fullname.substring(0,result);
		System.out.print(abbreviaName(Fullname).toUpperCase()+firstname);
	}
	
	public static String abbreviaName(String Fullname) 
	{
		String Full="";
		for(int i=0;i<Fullname.length();i++) 
		{
			if(Fullname.charAt(i)==' ') 
			{
				Full =Full+Fullname.charAt(i+1)+".";
			}
		}
		return Full;
	}
}
