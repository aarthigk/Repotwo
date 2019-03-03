package InheritanceConcept;

public class TestCar {


	public static void main(String a[]) {
		BMW b= new BMW();
		b.start(); // static polymorphism or compile time polymorephism
		b.theftsafety();
		b.refuel();
		b.engine();
		
		Car c= new Car();
		c.start();
		c.stop();
		
		//top casting
		Car g=new BMW();//child class object can be reference by parent class
						//variable this is called run time polymorphism
						//only common methods can be accessed and be overridden
		g.start();
		g.refuel();
		
//down casting will give Exception java.lang.ClassCastException: InheritanceConcept.Car cannot be cast to InheritanceConcept.BMW
		BMW b1=(BMW)new Car();
		
	}
}
