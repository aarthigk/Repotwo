package oopsConceptpart1;

public class Car {
	int mod;
	int wheel;
	public static void main(String[] arg) {
		
		//new Car is the object of the class
		// new is a keyword to create object
		//a,bc are object reference
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod=1990;
		a.wheel=3;
		
		b.mod=2010;
		b.wheel=2;
		
		c.mod=2018;
		c.wheel=4;
		
	System.out.println(a.mod);
	System.out.println(a.wheel);
	
	System.out.println(b.mod);
	System.out.println(b.wheel);
	
	System.out.println(c.mod);
	System.out.println(c.wheel);
	
	
	a=b;
	b=c;
	c=a;
	
	a.mod=10;
		
	System.out.println(a.mod);
	c.mod=101;
	b.mod=90;
	System.out.println(b.mod);
	System.out.println(a.mod);
	
	}

}
