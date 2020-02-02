package week1.day2;

public class FindTypes {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Automation Class $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] charArray=test.toCharArray();
		
		
		for(int i=0;i<charArray.length;i++)
		{
			if(Character.isLetter(charArray[i]))
			{
				System.out.println( "letter:" +charArray[i]  );
				letter=letter+1;
			}
			else if (Character.isDigit(charArray[i]))
			{
				System.out.println("Digit: " +charArray[i]);
				num=num+1;
			}
			else if (Character.isSpaceChar(charArray[i]))
			{
				System.out.println("Space:" +charArray[i]);
				space=space+1;
			}
				
			else
			{
				System.out.println("It is special character :" +charArray[i]);
				specialChar=specialChar+1;
			}
		}
System.out.println(letter);
System.out.println(num);
System.out.println(space);
System.out.println(specialChar);
}

}
