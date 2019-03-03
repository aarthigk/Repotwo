package JavaBasics;

public class IfLoops {
	public static void main(String[] arg) {
		
		int a=10;
		int b=20;
		int c=30;
		
		if(a>b)
		{
			System.out.println("a is greater");
		}
			
		else if(a<b & a<c)	
		{
			System.out.println("a is smaller");
		}
		
		else if(b<c)
		{
			System.out.println("b is smaller");
		}
		
		else
			
		{
			System.out.println("a is not greater");
			
		}
		
	}

}
