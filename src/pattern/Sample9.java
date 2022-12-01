package pattern;

public class Sample9 
{
	public static void main(String[] args) {
		
		String orgname="MOM";
		String rvsname="";
		
		for(int i=orgname.length()-1; i>=0; i--)
		{
			rvsname = rvsname + orgname.charAt(i);
		}
		System.out.println(rvsname);
		if(orgname.equals(rvsname))
		{
			System.out.println("given string is palandrom");
		}
		else
		{
			System.out.println("given string is not palandrom");
		}
		
	}

}
