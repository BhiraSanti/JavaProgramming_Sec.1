import javax.swing.*;
public class RectangleDemo2
{
	public static void main(String[] args) 
	{
		double widthInput = Double.parseDouble(JOptionPane.showInputDialog("input width : "));
		double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("input length : "));
		
		Rectangle2 obj2 = new Rectangle2(widthInput, lengthInput);
		JOptionPane.showConfirmDialog(null, obj2.toString()+
				"\nArea of Rectangle is "+obj2.getArea());	
	}
}