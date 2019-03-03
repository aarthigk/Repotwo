package oopsConceptpart1;

public class StaticNonStatic {
	
	String name="art"; // global non static variable
	static int age=28; // global static  variable
	
	public static void main(String arg[])	{
		System.out.println(age);
		StaticNonStatic b = new StaticNonStatic();
		
		System.out.println(b.name);
		
		b.print();
		
	}
	
	public static void print()
	{
		int a=10; // local variable
		int b=20;
		int c =a+b;
		System.out.println("a add b = " +c);
	}
	
	public void message() {
		System.out.println("hello");
	}
	
 
}
