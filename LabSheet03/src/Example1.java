import java.text.DecimalFormat;
import javax.swing.*; //import library for import input data from dialog box
public class Example1 
{
	public static void main(String[] args) {
		final int BUFFET = 299;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//input and convert data from dialog box
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many cusyomer per bill"));
		
		double priceafterDiscount , totalPrice = 0;
		//calculate  total price of buffet
		totalPrice = BUFFET * numberofCustomer;
		
		//using show massage dialog box for display totalPrice
		//JOptionPane.showMessageDialog(null, "Amount to be paid is "+ totalPrice +" Baht. ");
		// using confirm dialog box
		int memberCard;
		
		
		do {
			memberCard = JOptionPane.showConfirmDialog(null, "Total price is "+ frm.format(totalPrice) +" Baht. " + "\nDo you have a member card?");

		} while ( memberCard==JOptionPane.CANCEL_OPTION );
		
		
		if( memberCard == JOptionPane.YES_OPTION ) {
			//priceafterDiscount = totalPrice -(totalPrice*10/100);
			priceafterDiscount = totalPrice*90 /100; //DIscount10%
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+ frm.format(priceafterDiscount) +" Baht. ");
			
		} //end of if
		
		
		else if( memberCard == JOptionPane.NO_OPTION ) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+ frm.format(totalPrice) +" Baht. ");
			
		} //end of else if
		
		
		
	}
}