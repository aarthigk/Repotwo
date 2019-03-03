package oopsConceptpart1;

public class ChildClass extends ParentClass {
	
	public void start()
	{
		int a=20;
		System.out.println(a);
		System.out.println("child class");
		
	}
	
	public void startone()
	{
		super.startone();
		System.out.println("child class method");
		
	}
	
	public static void main(String a[])
	{

		ChildClass c =new ChildClass();
		c.start();
		c.startone();
		
		
	}
}
