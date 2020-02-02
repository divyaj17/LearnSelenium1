package week1.assignments;

public class SumOfDigitsFromString 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String text = "Tes12Le79af65";
		int sum=0;
		//char[] ch=text.toCharArray();
		
		
		//for(int i=0;i<ch.length;i++)
		//{
		//System.out.println(ch[i]);
		//if(Character.isDigit(ch[i]))
		//{
			//System.out.println();
			//sum=sum+ch[i];
		//}
		//}
		//System.out.println(sum);
		int len=text.length();
		for(int i=0;i<len;i++)
		{
			char ch = text.charAt(i);
		      if (Character.isDigit(ch)) 
		      {
		        int n = Integer.parseInt(String.valueOf(ch));
		        sum = sum + n;
		      }

		}
		if( sum !=0 )
		{
			System.out.println(sum);
		}
		else
		{
			System.out.println("No numbers in string");
		}
	}

}
