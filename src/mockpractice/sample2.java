package mockpractice;

public class sample2 
{
	public static void main(String[] args)
	{
		int[] t=new int[3];
		t[0]=10;
		t[1]=0;
		t[2]=50;
		//i[3]=35;
		
		//System.out.println(i[2]);
		
		try
		{
			for(int i=0; i<=10; i++)
			{
				System.out.println(t[i]);
			}
			t[3]=100;
		}
		
		catch(Exception a)
		{
			a.printStackTrace();
			System.out.println("exception handled");
		}
		
		System.out.println("hello");
	}

}


