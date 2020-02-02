package week1.assignments;

public class ChangeOddIndexToUpper {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] ch=test.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i%2 != 0)
			{
				char c=Character.toUpperCase(ch[i]);
				System.out.print(c);
			}
			else
			{
				System.out.print(ch[i]);
			}
		}

	}

}
