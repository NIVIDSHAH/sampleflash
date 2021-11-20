import javax.swing.*;
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0, num2 = 0, result = 0;
		String input;
		
		//Basic of exception handling
		try {
			//Asking user to input two numbers
			input = JOptionPane.showInputDialog(null, "Enter the first number");
			num1 = Integer.parseInt(input);
			input = JOptionPane.showInputDialog(null, "Enter the second number");
			num2 = Integer.parseInt(input);
			//Diving two numbers
			result = num1/num2;
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
//		//Catch error and throw message
//		catch(ArithmeticException e){
//			JOptionPane.showMessageDialog(null, e.getMessage());
//		}
//		
//		//When we enter String in int input
//		catch(NumberFormatException e) {
//			JOptionPane.showMessageDialog(null, e.getMessage());
//			num1=100;
//			num2=100;
//			result = num1/num2;
//		}
		
		
		finally {
			System.out.println("Finally");
		}
		
		
		
		JOptionPane.showMessageDialog(null, num1+"/"+num2+ " = "+result);
	}

}
