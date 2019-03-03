package CollectionsConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	
	public static void main(String a[]) {
	
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		
		ar.add(1);
		ar.add(3);
		ar.add(500);
		ar.set(0, 89);
		
		System.out.println(ar);
		
		
		Iterator it= ar.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(Integer n:ar) {
			
			System.out.println(ar);
		}
	
	}

}
