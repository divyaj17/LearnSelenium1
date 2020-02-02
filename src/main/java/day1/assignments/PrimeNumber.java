package day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=19;
		boolean flag=false;
				
		for(int i=2;i<(num/2);i++)
		{
			int r = num%i;
				if(r == 0)
				{
					flag = true;
					break;
				}
		}
		if(flag)
		{
		System.out.println("Given number " +num+ " is not prime");
		}
		else
		{
			System.out.println("Given number " +num+ " is Prime ");
		}

	}

}
