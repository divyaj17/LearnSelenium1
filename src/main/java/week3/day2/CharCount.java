package week3.day2;

public class CharCount {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="TestLeaf";
		int count=0;
		char[] ch=str.toCharArray();
		for(char c: ch)
		{
			if(c == 'T' || c=='t')
			{
				count++;
			}
		}
System.out.println("Number of T/t's that displayed are :" +count);
	}

}
