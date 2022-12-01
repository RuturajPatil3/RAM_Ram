package String_with_forloop_and_otherway;

import java.util.Scanner;

public class sample3 //extends sample4 
{
	public void name()
	{
		System.out.println("Airbus A373");
		System.out.println("passanger name : Tushar Narayanrao");
	    System.out.println("seat no. = A 4455");
		System.out.println("departure 7:20 AM(local time) at Mum.");
		System.out.println("Arriaval 11:30 AM(local time) at lon.");
		System.out.println("happy journey");
	    
	}
	
	public static void main(String[] args) 
	{	
		System.out.println("enter your PNR No.");
		Scanner t=new Scanner(System.in);
		int a=t.nextInt();
		int b=t.nextInt();
		System.out.println("PNR is "+a);
		System.out.println("=====================");
	    System.out.println("last 3 digit "+b);
		System.out.println("=====================");
	    
		sample3 s3=new sample3();
		s3.name();
		
//		sample4 s4=new sample4();
//		s4.name();
		
		int c=t.nextInt();
		System.out.println(s3);
	
	}

}
