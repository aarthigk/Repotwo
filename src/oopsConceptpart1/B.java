package oopsConceptpart1;

public class B extends A{
	
	public B()
	{
		System.out.println("Child");
	}
	
	public B(int i)
	{
		super(i);
		System.out.println("Child wit pARA");
	}
	
	
	public static void main(String a[]) {
		B b = new B();
		B b1 = new B(10);
	}
	

}
