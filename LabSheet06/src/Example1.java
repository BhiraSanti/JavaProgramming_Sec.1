import javax.swing.*;
public class Example1 {
	public static void main(String[] args) 
	{
		inputEmail();
	}
	
	public static void inputEmail() 
	{
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail : ").toLowerCase();
		
		boolean chkEmail = checkEmail(inputEmail);
		displayEmail(chkEmail,inputEmail);
	}

	public static boolean checkEmail(String email) 
	{	
		if(email.endsWith("hotmmail.com")||email.endsWith("gmail.com")) 
		{
			return true;
		}
		else 
		{
			return false;			
		}

	}

	public static void displayEmail(boolean chEmail,String inEmail) 
	{
		if (chEmail==true) 
		{
			JOptionPane.showMessageDialog(null, "Your email is "+ inEmail);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Your email is not Hotmail or Gmail ");
		}
	}
}