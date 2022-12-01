package mockpractice;

public class starpatternSample5 
{
	//    *
	//   * *
	//  * * *
	// * * * *
	// * * * *
	//  * * *
	//   * *
	//    *
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=5-i; j>=1; j--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=5; i++)
			{
				System.out.println("*");
			}
			System.out.println();
		}
		
	}

}
