package week3.assignments;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections4.map.HashedMap;

public class SecondCharacter {

	public static void main(String[] args) {
		String input="PayPal India";
		int count=0;
		int temp=0;
		Map<Character,Integer> map= new HashedMap<>();
		char[] ch=input.toCharArray();
		
		for(char c:ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		//Collections.sort
		//Collections.reverseOrder();
		//for (Entry<Character,Integer> c : map.entrySet()) 
		//{
			//System.out.println(c.);
		//}
	}

}
