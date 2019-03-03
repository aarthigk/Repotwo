package CollectionsConcept;

import java.util.*;
import CollectionsConcept.Employee;
public class CollectionsConcept {
	
	public static void main(String a[]) {
	
	
	//dynamic array
	
	ArrayList<Integer> ar=new ArrayList<Integer>();
	ar.add(10);
	ar.add(20);
	ar.add(30);
	
	System.out.println(ar.size());
	
	ArrayList a1=new ArrayList();
	
	a1.add("aerti");
	a1.add(1);
	a1.add(28);
	a1.addAll(ar);
	
	System.out.println(a1.get(0));
	for (int i=0;i<=5;i++)
	{
		System.out.println("Printing array values"+a1.get(i));
	}
	
	Employee e1=new Employee("arti", 1, "cse");
	Employee e2=new Employee("ajay", 2, "cse");
	Employee e3=new Employee("katie", 3, "Hr");
	
	ArrayList<Employee>  a2=new ArrayList<Employee> ();
	
	a2.add(e1);
	a2.add(e2);
	a2.add(e3);
	
	
	// this is oject hence use Iterator
	for (int i=0;i<=2;i++) {
		
		System.out.println(a2.get(i));
	}
	
	Iterator<Employee> it=a2.iterator();
	while(it.hasNext()) {
		Employee emp=it.next();
		{
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
	}
	
	}

}
