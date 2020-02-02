package week3.assignments;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DistinctCharacter 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Set<Character> set=new LinkedHashSet<>();
		String input="Amazon India Private Limited";
		char[] ch=input.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] != ' ')
			{
				if(set.contains(ch[i]))
				{
					
				}
				else
				{
					set.add(ch[i]);
				}
			}
		}
		System.out.println("Output with only Distinct characters");
		for (char c : set) 
		{
			System.out.print(c);
		}
	}

}
