package week1.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "madam";
		String rev="";
		
		char[] ch=text.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println("Reverse of the given string is " +rev);
		if(text.equals(rev))
		{
			System.out.println("Given string is a palindrome");
		}
		else
		{
			System.out.println("Given string is not palindrome");
		}
	}

}
