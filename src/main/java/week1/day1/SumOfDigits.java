package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int sum=0;
		while(num > 0)
		{
			int r=num%10;
			System.out.println("Remainder :  " +r);
			sum=sum+r;
			System.out.println("Sum : " +sum);
			num=num/10;
			System.out.println("Quotient : " +num);
		}
		
          System.out.println("Sum of digits is :" +sum );
	}

}
