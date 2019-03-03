package JavaBasics;

public class StringInterview {
	public static void main(String[] arg) {
		
		//1. reverse a string without inbuilt function ,string is immutable
		String str = "abcdefg";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{	rev=rev+str.charAt(i);
		
		}
		
		System.out.println(rev);
		
		//2.using string buffer which is mutable u can use reverse
		StringBuffer bu=new StringBuffer(str);
		System.out.println(bu.reverse());
		
		//3.Remove the junk,space characters from string
		
		String g="£$$£$$£ Helloworld @~~,.";
		
		//Regular experson[^a-zA-z0-9]
		
		g=g.replaceAll("[^a-zA-z0-9]","");
		System.out.println(g);
		
		//4.palindrome 
		
		
		
		
	}
}
