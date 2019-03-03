package JavaBasics;

public class IncrementDecrement {
	
	public static void main(String[] arg) {
	int i=1;
	int j= i++;
	
	//post increment ++
	System.out.println("post increment");
	System.out.println(i);
	System.out.println(j);

	//pre increment ++a
	
	int a=1;
	int b= ++a;
	
	System.out.println("pre increment");
	System.out.println(a);
	System.out.println(b);
	
	//post decrement ++a
	
	int p=1;
	int q= p--;
	
	System.out.println("post decrement");
	System.out.println(p);
	System.out.println(q);
	
	//post decrement ++a
	
	int k=1;
	int l=--k;
	
	System.out.println("pre decrement");
	System.out.println(k);
	System.out.println(l);
	
	System.out.println();
		
	
	
}
}
	
