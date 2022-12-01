package mockpractice;

public class sample3 
{
	public static void main(String[] args)
	{
		String a="hello";
		String aa="hello";
		String a1="HELLO";
		String a3="tushar";
		String a4="PriYANka";
		String a41="priyanka";
		String a5="pranali123";
		String a6="sagaR@753";
        String a7="";
		
		System.out.println(a1.concat(a6));
		System.out.println(a1+a6);
		System.out.println(a3.indexOf('d'));   //-1
		System.out.println(a3.indexOf('s'));    //2
		System.out.println(a5.charAt(2));
		System.out.println(a1.replace("HELLO", "hii"));
		System.out.println(a3.toUpperCase());
		System.out.println(a4.toLowerCase());
		System.out.println("a6+a= "+a6.equals(a));
		System.out.println("a+a= "+a.equals(a));
		System.out.println("a4+a41= "+a4.equalsIgnoreCase(a41));
		System.out.println("startwith p ="+a5.startsWith("p"));
		System.out.println(a.endsWith(aa));
		System.out.println(a4.endsWith("a"));
		System.out.println(a4.endsWith("g"));
		System.out.println(a4.endsWith("A"));
		System.out.println(a5.substring(5));
		System.out.println(a41.subSequence(1, 5));
		System.out.println(a3.isEmpty());
		System.out.println(a7.isEmpty());
		System.out.println(a6.contains("@75"));
		
		
		
		
		
		
	}

}
