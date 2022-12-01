package pattern;

public class sample5 
{
	public static void main(String[] args)
	{
		//int [] t=new int[3];
		
		int[] t= {10,20,30};
		
		System.out.println(t.length);
		
		int sum=0;
		
		for(int i=0; i<=2; i++)
		{  
			System.out.println(t[i]);
			sum=sum+t[i];
		}
		System.out.println("===========");
		System.out.println(sum);
		
		
		
	}

}
