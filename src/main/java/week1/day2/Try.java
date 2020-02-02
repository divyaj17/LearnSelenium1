package week1.day2;

import java.util.Arrays;

public class Try {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] data = {3,2,4,5,7,8};
		Arrays.sort(data);
		for(int i=2;i<=data.length;i++) {
			if(i != data[i-2]) 
			{
				System.out.println("missing number is" +" "+i);
			}
			
		}
	}

}
