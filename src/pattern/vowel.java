package pattern;

public class vowel 
{
	public static void main(String[] args)
	{
		String orgname = "Tushar Narayanra";
		 int vowel = 0;
		
		for(int i=0; i<=orgname.length()-1; i++)
		{
			char ch = orgname.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowel++;
				System.out.println(ch);
			}
			
			
		}
		System.out.println("total vowel = "+vowel);
		
	}

}
