import javax.swing.*;
public class RectangleDemo 
{
	public static void main(String[] args) 
	{
		double widthInput = Double.parseDouble(JOptionPane.showInputDialog("input width : "));
		double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("input length : "));
		String colorInput = JOptionPane.showInputDialog("Input color : ");
		
		Rectangle obj1 = new Rectangle(widthInput, lengthInput ,colorInput);
		JOptionPane.showConfirmDialog(null, obj1.toString()+
				"\nArea of Rectangle is "+obj1.getArea());
		
	}
}
