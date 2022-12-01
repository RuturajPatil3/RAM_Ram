package pattern;

import java.util.Scanner;

public class sample8_armstrong_num
{
	public static void main(String[] args)
	{
		int orgnum = 153;
		int sum = 0;
		for(int i=orgnum; i>0; i=i/10)
		{
			int rm=i%10;
		   sum=sum+(rm*rm*rm);	
		   System.out.println(sum);
		}
		System.out.println("===============");
		if(orgnum==sum)
		{
			System.out.println("given no "+orgnum+" is armstrong no");
		}
		else
		{
			System.out.println("given no "+orgnum+" is not armstrong");
		}
		
		
		
	}

}
