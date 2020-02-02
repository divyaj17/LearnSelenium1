package week1.assignments;

public class RemoveDuplicatesWords {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String text = "We learnt java basics as part of java sessions in week1";
		String[] str=text.split(" ");
		//int count=0;
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					//count=count+1;
				    str[j]="";
				    str[i]="";
				}						
			}
		}
		/*
		 * for (String string : str) { System.out.println(string); }
		 */
		
		  for(int k=0;k<str.length;k++)
		  {
			  if(str[k] != "")
			  {
				  System.out.print(" " +str[k]);
			  } 
		   }
		 		
	}

}
