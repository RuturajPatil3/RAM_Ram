package pattern;

public class sample4 extends sample3
{
	public void m3()
	{
		System.out.println("concrit m3");
	}
	public void m4()
	{
		System.out.println("concrit m4");
	}
	
	public static void main(String[] args)
	{
		sample4 s4=new sample4();
		s4.m1();
		s4.m2();
		s4.m3();
		s4.m4();
		
	}

}
