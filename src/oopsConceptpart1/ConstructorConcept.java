package oopsConceptpart1;

public class ConstructorConcept {

	public ConstructorConcept()
	{
		System.out.println("default constructor");
	}
	
	public ConstructorConcept(int a)
	{
		System.out.println("1 parameter constructor");
	}
	
	public ConstructorConcept(int a,int b)
	{
		System.out.println("2 parameter constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorConcept c = new ConstructorConcept();
		ConstructorConcept c1 = new ConstructorConcept(10);
		ConstructorConcept c2 = new ConstructorConcept(10,20);
	}

}
