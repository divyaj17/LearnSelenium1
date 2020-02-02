package week3.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharacter
{

	public static void main(String[] args) 
	{
		Set<Character> set=new LinkedHashSet<>();
		String st="Infosys Limited";
		char[] ch=st.toCharArray();
		int len=ch.length;
		System.out.println("Length of string is " +len);
		
		  for(int i=0;i<ch.length;i++) 
		  { 
			  for(int j=i+1;j<ch.length;j++)
			  { 
				  if(ch[i] != ' ') 
				  {		  
					  if(ch[i] == ch[j]) 
					  	{ 
						  set.add(ch[i]);
					  	} 
				  } 
			 } 
			  
		 }
		  System.out.print(set);
	}

}
