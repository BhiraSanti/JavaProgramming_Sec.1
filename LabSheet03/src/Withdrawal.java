import javax.swing.*;

import java.text.DecimalFormat;
import java.util.Random; // use library for Random class 

public class Withdrawal {

	public static void main(String[] args) {
		Random rdmoney = new Random();
		int balance = rdmoney.nextInt(9)* 100000;
		DecimalFormat frm = new DecimalFormat("#,###");			
		int money = Integer.parseInt(JOptionPane.showInputDialog(null,"Your balance: "+ frm.format(balance) +"\nInput money to withdrawn :"));
	
		if ( money>20000 )
		{
			JOptionPane.showMessageDialog(null,"Erorr : Cannot withdraw more than 20,000","Erorr",JOptionPane.ERROR_MESSAGE);
		}
		else if ( money>balance ) 
		{
			JOptionPane.showMessageDialog(null,"Erorr : Cannot withdraw more than balance","Erorr",JOptionPane.ERROR_MESSAGE);			
		}
		else if ( money%100 !=0 ) 
		{
			int moneyMod = money%100;
			JOptionPane.showMessageDialog(null,"Erorr : Cannot withdraw "+ moneyMod +" Baht. ","Erorr",JOptionPane.ERROR_MESSAGE );	
		}
		else
		{
			JOptionPane.showMessageDialog(null,"You withdraw "+ frm.format(money) +" Baht. "+"\n1,000 = "+money/1000+ "\n500 = "+(money%1000)/500 +"\n100 ="+(money%500)/100) ;	
		}
	}
}