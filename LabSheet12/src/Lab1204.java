import java.util.*;
import java.io.*;
public class Lab1204 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner scnInput = new Scanner(System.in);
		System.out.print("Enter rating of books : ");
		float rate = scnInput.nextFloat();
		
		System.out.println("----------------------------------------------------------");
		
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		String tmp = "";
		String bookname = "";
		String authorname ="";
		String review = "";
		int i = 0,countbook = 0;
		while((tmp = readFile.readLine()) !=null) 
		{
			String[] data = tmp.split("\t");
			float rating = Float.parseFloat(data[2]);
			bookname = data[0];
			authorname = data[1];
			review = data[3];
			i++;
			
			if(rating >= rate) 
			{
				System.out.println("Book"+i+":"+bookname+" write by "+authorname+" ("+review+") reviews");
				countbook++;
			}
		}
		
		readFile.close();
		System.out.println("----------------------------------------------------------");
		System.out.println("There are "+countbook+" book get rating more than "+rate);
	}
}