package oopsConceptpart1;

public class Functions {

	public static void main (String arg[])
	{
		Functions f=new Functions();
		
		f.print();
		
		int x =f.add(10,20);
		System.out.println("added number"+ x);
		
		String c =f.messgae();
		System.out.println("message is "+c);
	}
	
	public void print()
	{
		System.out.println("hello world");
	}
	
	public int add(int a,int b)
	{
		
		return a+b;
		
	}
	
	public String messgae()
	{
		String a="hai there" ;
		

		return a;
		
	}
}
