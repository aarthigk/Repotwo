package oopsConceptpart1;

public class WrapperClass {
	
	public static void main(String a[])
	{
		String i = "100";
		System.out.println(i+20);
		
		//String to integer
		int x=Integer.parseInt(i);
		System.out.println(x+20);
		
		//String to double
		String k="10.0";
		double q =Double.parseDouble(k);
		System.out.println(k+20.8);
		
		//String to boolean
		String y="true";
		boolean m=Boolean.parseBoolean(y);
		System.out.println(y+m);
		
		//int to String
		int l=100;
		String j=String.valueOf(l);
		System.out.println(l+j+"world");
		

	
		
	}

}
