import java.util.*;
public class BookDemo 
	{
		public static void main(String[] args) 
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Input book title   : ");
			String title = input.nextLine();
			
			System.out.print("Input book price   : ");
			float price = input.nextFloat();
 
			System.out.print("Input publish year : ");
			int year = input.nextInt();
			System.out.println();
		
			Book b1 = new Book ();
			b1.setTitle(title);
			b1.setPrice(price);
			b1.setPublishyear(year, year);
 
			System.out.println("Title: "+b1.getTitle()+" published for "+b1.getTotalYear()+" year ("+b1.getPrice()+" baht).");
		}	
 
}