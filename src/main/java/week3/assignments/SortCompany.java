package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCompany 
{

	public static void main(String[] args) 
	{
		List<String> li=new ArrayList<>();
		li.add("CTS");
		li.add("HCL");
		li.add("Aspire Systems");
		System.out.println("Before sorting the list :");
		for (String string : li) 
		{
			System.out.println(string);
		}
		System.out.println("After sorting the list in ascending order:");
		
		 Collections.sort(li);
		 for (String string1 : li) 
		 {
			 System.out.println(string1); 
		 }
		 System.out.println("After sorting the list in descebding order:");
		 Collections.reverse(li);
		
		 for
		 (String string2 : li)
		 { 
			 System.out.println(string2);
		 }	

	}

}
