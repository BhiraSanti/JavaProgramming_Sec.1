import java.util.*;
public class TestPiggybank 
{
	static Piggybank pb = new Piggybank();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
		{
			Piggybank pb = new Piggybank();
			inputCoin();
			/*pb.setPiggyBank(500);
			
				System.out.println("Money Total : " + pb.getTotal());
					pb.addTwo (34);
					
				System.out.println("Add 2 Baht Money : " + 34);
				
				System.out.println("Money Total : " + pb.getTotal());
					pb.addTen (13);
					
				System.out.println("Add 10 Baht Money : " + 13);
				
				System.out.println("Money Total : " + pb.getTotal());
					pb.addFive(100);*/
		}
	
	public static void inputCoin() 
	{
		System.out.println("Money Total : "+ pb.getTotal());
		System.out.print("Please define size of Piggybank : ");
		int sizeofPiggybank = scan.nextInt();
		pb.setPiggyBank(sizeofPiggybank);
		System.out.println("Money Total : "+pb.getPiggyBank());
		
		MainMenu();
	}
	
	public static void MainMenu() 
	{
		while (true)
			{
			System.out.println("===============================");
			System.out.println("Menu of Piggybank");
			System.out.println("===============================");
			System.out.println("[1] one bath.");
			System.out.println("[2] two bath.");
			System.out.println("[3] five bath.");
			System.out.println("[4] ten bath.");
			System.out.println("[5] exit");
			System.out.println("===============================");
			System.out.print("Please select Menu [1-5] : ");
			int insertBaht = scan.nextInt();
			int total = 0;
		
			if(insertBaht == 1)
			{
				System.out.print("Insert 1 baht Money : ");
				total = scan.nextInt();
				pb.addOne(total);
				System.out.println("Money total : "+pb.getTotal());
				System.out.println("");
			}
		
			else if (insertBaht == 2)
			{
				System.out.print("Insert 2 baht Money : ");
				total = scan.nextInt();
				pb.addTwo(total);
				System.out.println("Money total : "+pb.getTotal());
				System.out.println("");
			}
			
			else if (insertBaht == 3)
			{
				System.out.print("Insert 5 baht Money : ");
				total = scan.nextInt();
				pb.addFive(total);
				System.out.println("Money total : "+pb.getTotal());
				System.out.println("");
			}
		
			else if (insertBaht == 4)
			{
				System.out.print("Insert 10 baht Money : ");
				total = scan.nextInt();
				pb.addTen(total);
				System.out.println("Money total : "+pb.getTotal());
				System.out.println("");
				}
		
			else 
				{
				System.out.println("Bye bye");
				break;
				}
			}
	}
}