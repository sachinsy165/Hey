package Collection_iterator;

public class Action 
{

	
	public static void main(String[] args)
	{
		String s="sachin is a developer";
		
		 
		
		for (int i = 0; i < s.length(); i++) 
		{
			String res="";
			if((i==0 &&s.charAt(i)!=' ')||(s.charAt(i)!=' '&&s.charAt(i-1)==' '))
			{
				while (i<s.length()&&s.charAt(i)!=' ') 
				{
					res=res+s.charAt(i);
					i++;
				}
				System.out.println(res);
			}
		 
		}
	}
}
