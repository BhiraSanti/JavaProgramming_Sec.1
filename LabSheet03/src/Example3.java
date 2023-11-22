import javax.swing.*;
public class Example3 {
	public static void main(String[] args) {
		//input and convert weight from user
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Inout Weight : "));
		
		//input and covert height(cm.) from user
		double height = Double.parseDouble(JOptionPane.showInputDialog("Inout Height : "));
		//convert height from cm. to m.
		height = height/100;
		double bmi = weight/(height*height);
		
		//check condition and declare meaning of BMI
		String bmiCategory;
		if( bmi<18.5 ) bmiCategory = "UnderWeight";
		else if( bmi<25 ) bmiCategory = "Normal-Weight";
		else if( bmi<30 ) bmiCategory = "Over-Weight";
		else bmiCategory = "Obesity";
		
		
		//display BMI value to showMessage dialog box
		JOptionPane.showConfirmDialog(null, "BMI = "+ String.format("%.1f", bmi) +"\nYou're "+ bmiCategory);
		
		
	}
}