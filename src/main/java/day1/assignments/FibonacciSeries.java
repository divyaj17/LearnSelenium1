package day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		
		System.out.println("Fibonacci series for a range of 8 are");
		
		       
		for(int i=1;i<=8;i++ )
		{
			System.out.println(n1);
			int n3=n1+n2;
			 n1=n2;
			 n2=n3;
				
		}


	}

}
