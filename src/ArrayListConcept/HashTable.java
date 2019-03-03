package ArrayListConcept;

import java.util.Hashtable;

public class HashTable {
	/*Hash table  is dynamic array*/
	public static void main(String a[])
	{
		Hashtable<String,Integer> map=new Hashtable<String,Integer>();
		map.put("Aarti", 1);
		map.put("Ajay", 2);
		
		Hashtable<String,String> ma=new Hashtable<String,String>();
		ma.put("Aarti", "Num");
		ma.put("Ajay", "Num");
	
		map.replace("Aarti", 1001); 
		map.replace("Aarti", 1001,1002);
		System.out.println(map.size());
		System.out.println(map.get("Aarti"));
		
	}

}
