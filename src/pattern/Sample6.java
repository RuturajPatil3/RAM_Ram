package pattern;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sample6 
{
	public static void main(String[] args)
	{
		int t1[]= {10, 20, 30};
		int t2[]= {50, 40, 10};
		int t3[]= {50, 60, 90};
		int t4[]= {50, 60, 90};
		
		boolean result = Arrays.equals(t1, t2);
		boolean result1 = Arrays.equals(t2, t3);
		boolean result2 = Arrays.equals(t3, t4);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		
		
	}

}
