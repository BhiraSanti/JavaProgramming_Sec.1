import java.io.*;
import java.util.*;
public class AddProduct 
{

	public static void main(String[] args) throws IOException
	{
		// create object for write(save) data to file using PrintWriter Class
		PrintWriter writeFile = new PrintWriter(new FileWriter("d://txtFile//Product.txt"));
		Scanner scan = new Scanner(System.in);
		//Display and input data from Keyboard
		
		System.out.print("Input product id : ");
		String productId = scan.next();
		System.out.print("Input product name : ");
		String productName = scan.next();
		System.out.print("Input product unit : ");
		int productUnit = scan.nextInt();
		System.out.print("Input product price : ");
		float productPrice = scan.nextFloat();
		
		writeFile.println(productId+","+productUnit+","+productPrice);
		System.out.println("Save file already.....");
		writeFile.close();
	}

}
