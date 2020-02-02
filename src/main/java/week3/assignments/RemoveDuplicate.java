package week3.assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args)
	{
		Set<Character> set=new LinkedHashSet<>();
		String st="PayPal India";
		char[] ch=st.toCharArray();
		System.out.println(ch.length);
		
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
		
		
		
		
		
		/*for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i] != ' ')
				{
					if(set.contains(ch[i]) && set.contains(ch[j]))
					{
						set.remove(ch[i]);
						set.remove(ch[j]);
						
					}
					else
					{
						set.add(ch[i]);
						
					}
				}
			}
		}
		System.out.println(set);*/
		
		
		/*
		 * for (char c : ch) { if(c != ' ') { if(!set.contains(c)) { set.add(c); } }
		 * 
		 * }
		 * 
		 * System.out.println(set);
		 */
		
		/*
		 * for(int i=0;i<ch.length;i++) { for(int j=i+1;j<ch.length;j++) { if(ch[j]
		 * != ' ') {
		 * 
		 * if(ch[i] == ch[j]) { ch[i]=' '; ch[j]=' '; } } } System.out.print(ch[i]); }
		 */

	}

}
