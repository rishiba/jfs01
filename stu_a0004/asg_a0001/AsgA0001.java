class AsgA0001
{
	public static String alter_case_1(String str)
	{
		int lim=str.length();
		for(int i=0;i<lim;i++)
		{
			if(i%2==0)
			{
				char s=str.charAt(i);
				//str1=String.valueOf(s);
				System.out.print(Character.toUpperCase(s));
			}
			else
			{
				char t=str.charAt(i);
				//str1=String.valueOf(t);
				System.out.print(Character.toLowerCase(t));
				
			}
		
		}
	return(str);
	}
}