package week3.day2;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class CharCountMap {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String input="Please focus";
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
		System.out.println(map);
		
	
	}

}
