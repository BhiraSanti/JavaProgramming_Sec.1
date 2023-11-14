import java.text.DecimalFormat;

import javax.swing.*;
public class Example4 {
	public static void main(String[] args) {
		//
		String produceName = JOptionPane.showInputDialog("Input product name : ");
		
		/* //input price from dialog box
		String strUnit = JOptionPane.showInputDialog("Input product unit : ");
		//convert string to int
		int productUnit = Integer.parseInt(strUnit); */
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//input and convert data from dialog box
		int productUnit = Integer.parseInt(
				JOptionPane.showInputDialog("Input product unit : "));
		
		
		//input price per unit form dialog box
		String strPrice = JOptionPane.showInputDialog("Input price per unit : ");
		float pricePerUnit = Float.parseFloat(strPrice);
		
		//calculate total price
		float totalPrice = productUnit * pricePerUnit;
		float priceVat= totalPrice + (totalPrice*7/100);
		//display data to dialog box
		JOptionPane.showMessageDialog(null, "Total Price is "+frm.format(totalPrice) + " baht."
				+"\nAdd VAT 7%  is " +frm.format(priceVat) + " baht.");

		
		
		
		
		
	}
}