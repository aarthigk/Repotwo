package oopsConceptpart1;

public class Final {
	
	public static void main(String args[]) {
		
		test();
		test2();
		test3();
	}
	
	public static void test ()
	{
		try
		{
			System.out.println(" try block");
			throw new RuntimeException("test");
		}
		catch(Exception e)
		{
			System.out.println(" catch block");
			
		}
		finally {
			{
				System.out.println(" finaly block");
				
			}
			
		}
	}
	
	public static void test2()
	
	{ int u=10;
	
	
	try {
			System.out.println(" Try block");
		int k =u/0;
	}
	
	catch (ArithmeticException e)
	{

		System.out.println(" catch exceptiop"+e);
	}
	finally 
		{
			System.out.println(" finaly block");
			
		}
			
	}
	
public static void test3()
	
	{ int uj=10;
	
	
	try {
			System.out.println(" Try block");
		int gk =uj/0;
	}
	
	catch (NullPointerException e)
	{

		System.out.println(" catch exceptiop"+e);
	}
	finally 
		{
			System.out.println(" finaly block");
			
		}
			
	}

}
