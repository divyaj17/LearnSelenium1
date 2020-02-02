package day1.assignments;

public class ArmstrongNumber 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int calculated=0;
		int remainder;
		int original=153;
		int temp=original;
		
		while(original>0)
		{
			remainder=original%10;
			original=original/10;
			calculated= calculated+ (remainder * remainder * remainder);
		}
		System.out.println(original);
		System.out.println(calculated);
		if(temp == calculated)
		{
			System.out.println("Given number is armstrong");
		}
		else
		{
			System.out.println("Given number is not armstrong number");
		}
	}

}
