package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int n3=n1+n2;
		System.out.println("Fibonacci series for a range of 100 are");
		System.out.println(n1);
		System.out.println(n2);
        System.out.println(n3);
		for(int i=1;i<=100;i++ )
		{
			 n1=n2;
			 n2=n3;
			 n3=n1+n2;			
			if(n3>=100)
			{
				break;
			}
			System.out.println(n3);
		}

	}

}
