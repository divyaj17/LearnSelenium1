package week1.assignments;

public class ReverseEvenWords1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String test="I am a software tester";
		String[] str=test.split(" ");
		for(int i=0;i<str.length;i++)
		{
			if(i%2 == 0)
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
