package week1.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Declare a String 
		String text1 = "stop";
		//Declare another String
		String text2 = "pots";
		
		int len1=text1.length();
		System.out.println("Length of string1: " +len1);
		
		int len2=text2.length();
		System.out.println("Length of string2: " +len2);
		
		char[] ch1=text1.toCharArray();
		Arrays.sort(ch1);
		System.out.println("First string after sorting the text:");
		System.out.println(ch1);
		
		char[] ch2=text2.toCharArray();
		Arrays.sort(ch2);
		System.out.println("Second string after sorting the text:");
		System.out.println(ch2);
		if(Arrays.equals(ch1,ch2))
		{
			System.out.println("Given string is anagram");
		}
		else
		{
			System.out.println("Not anagram");
		}
			
		 

	}

}
