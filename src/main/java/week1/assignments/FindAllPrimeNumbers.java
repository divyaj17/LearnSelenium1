package week1.assignments;

public class FindAllPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 100;
		System.out.println("List of prime numbers between 1 to 100 are :");
		for(int i=1;i<=range;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j == 0)
				{
					count++;				
				}
			}
			if(count == 2)
			{
			System.out.println(i);
			}
		}

	}

}
