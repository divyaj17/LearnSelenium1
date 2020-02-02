package week1.day1;

public class SwitchCase {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a=30,b=20;
		String operator ="%";
		switch (operator)
		{	     
		 case "+":
			 System.out.println("Addition of two numbers is: " +( a + b));
			 break;

		 case "-":
			 System.out.format("Subtraction of two numbers is: " +(a-b));
		 break;
				 
		 case "*":
			 System.out.format("Multiplication of two numbers is: " +(a*b));
			 break;
			 
		 case "/":
			 System.out.format("Division of two numbers is: " +(a/b));
			 break;
			 
		 default:
		 System.out.format("Module of two numbers is: " +(a % b));
		 break;
	     }

	}
}