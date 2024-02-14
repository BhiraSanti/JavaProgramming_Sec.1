import java.io.*;
import java.util.*;
public class SentenceText
{

	public static void main(String[] args) throws IOException
	{
		// create object for write(save) data to file using PrintStrem Class
		PrintStream writeFile = new PrintStream(new File("d://txtFile//sentence.txt"));
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		
		while(true) 
		{
			System.out.print("Sentence : ");
			String word = scan.next();
			
			if(word.equalsIgnoreCase("stop")) 
			{
				break;
			}
						
			writeFile.println(i+" : "+word);
			i++;
		}
		System.out.println("File is save!!!");
		
		writeFile.close();
	}

}
