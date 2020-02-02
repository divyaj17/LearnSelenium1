package week1.day2;

public class CharacterOccurance {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String test = "I am getting better with Java";
		char ch='t';
		int totalCount=0;
		
		String test1=test.trim()
;		
		char[] charArray=test1.toCharArray();
		
		
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[i] == ch)
				{
				totalCount=totalCount+1;
				}
		}
		System.out.println("Total count of character("+ch+"): " + totalCount);	

	}

}
