import java.io.*;
public class Lab1203 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		String tmp = "";
		int countBook = 0, i = 1;
		
		while((tmp = readFile.readLine())!=null) 
		{
			String[] data = tmp.split("\t");
			
			System.out.println(i + ". " + data[0] + "(" + data[1] + "), Rateing " + data[2] + " publist on " + data[5]);
			countBook++;
			i++;
		}
		
		System.out.println("===================================================================================");
		System.out.println("Total number of book : "+ countBook);
		readFile.close();
	}
}