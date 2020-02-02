package week1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String test="I am a software tester";
		String[] str=test.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			int len=str[i].length();
			//System.out.println(len);
			
			if(len%2 == 0)
			{
				System.out.print(" " +new StringBuffer(str[i]).reverse());
				
			}
			else
			{
				if(i!=0)
				{
				System.out.print(" ");
				}
				System.out.print(str[i]);
			}
		}
		
	}

}
