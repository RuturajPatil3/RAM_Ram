package pattern;

public class sample10
{
	public static void main(String[] args) {
		
		int orgnum=153;
		int sum=0;
	
		for(int i=orgnum; i>0; i=i/10)
		{
			int rm=i%10;
			sum=sum+(rm*rm*rm);
		}
		
		if(orgnum==sum)
		{
			System.out.println("given num is armstrong");
		}
		else
		{
			System.out.println("given num is not armstrong");
		}
	
		
	}

}
