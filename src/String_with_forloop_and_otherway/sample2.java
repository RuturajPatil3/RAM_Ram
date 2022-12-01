package String_with_forloop_and_otherway;

import java.util.Scanner;

public class sample2
{
	public static void main(String[] args)
	{
		System.out.println("enter your name");
		Scanner s=new Scanner (System.in);
		String t=s.nextLine();
		System.out.println("   ");
		System.out.println("your name is "+t);
		
		System.out.println("===========");
		System.out.println("any charector youii want to print please type its no. here");
		
		System.out.println("charetor is "+t.charAt(1));
		System.out.println("===========");
		
		for(int i=0; i<t.length(); i++)
		{
            System.out.println(t.charAt(i));
            System.out.println("   ");
		}
		
		
		
		
	}

}
