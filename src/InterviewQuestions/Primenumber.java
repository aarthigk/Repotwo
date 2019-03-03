package InterviewQuestions;

public class Primenumber {
	
	public static boolean Isprimenumber(int num) {
		
		if(num<=1)
		{
			return false;
		}
		
		for (int i=2; i<num;i++) {
			if(num % i ==0)
			{
				return false;
			}
		}
		return true;
	
	}
	public static void main(String a[])
	{
		System.out.println(Isprimenumber(2));
		System.out.println(Isprimenumber(12));
		System.out.println(Isprimenumber(22));
		System.out.println(Isprimenumber(13));
	}

}
