package ArrayListConcept;

import java.util.*;
public class ArrayListC {
	
	public static void main(String a[]) {
		

		ArrayList a1=new ArrayList();
		
		a1.add("arti");
		a1.add(1);
		a1.add(28);
		

		System.out.println(a1.get(1));
		System.out.println(a1.get(2));
		System.out.println(a1.get(0));
		
		ArrayList<Integer> an=new ArrayList<Integer>();
		
		an.add(23);
		an.add(46);
		an.add(90);
		
		System.out.println(an.get(1));
		System.out.println(an.size());
		
		for(int i=0;i<=an.size()-1;i++)
		{
			System.out.println(an.get(i));
		}
	}

}
