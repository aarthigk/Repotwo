package JavaBasics;

public class ArrayConcept {
	public static void main(String[] arg) {
		
	//	get lowest index ,highest index ,size 
		
		//1 dimension array sixe is fixed ,[ use dynmic array -->to overcome use collection  arraylist,hastable
		//only store similar datatype [to overcome use objectarray]
		
		//1.int array
		int i[]=new int[4];
		 i[0]=12;
		 i[1]=13;
		 i[2]=14;
		 i[3]=15;
		
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		//2.double array
		
		double k[]=new double[3];
		k[0]=7.0;
		k[1]=9.8;
		k[2]=1.23;
		
		for(int m=0;m<k.length;m++)
		{
			System.out.println(k[m]);
		}
		
		//3.char array
		
		char o[]=new char[4];
		o[0]='a';
		o[1]='b';
		o[2]='c';
		o[3]='d';
		
		for(int p=0;p<o.length;p++)
		{
			System.out.println(o[p]);
		}
		
		//4.boolean array
		
		boolean g[]=new boolean[3];
		g[0]=true;
		g[1]=false;
		g[2]=true;
		
		for (int x=0;x<g.length;x++)
		{
			System.out.println(g[x]);
		}
		
		//5.String array
		
		String a[]=new String[3];
		
		a[0]="aaplle";
		a[1]="ghty";
		a[2]="kfhs";
		
		for (int d=0;d<a.length;d++)
		{
			System.out.println(a[d]);
		}
		
		//6 Object array :object is super class
		
		Object obj[]=new Object[5];
		obj[0]="arti";
		obj[1]='f';
		obj[2]=28;
		obj[3]="london";
		obj[4]="02/04/1990";
		
		for (int n=0;n<obj.length;n++)
		{
			System.out.println(obj[n]);
		}
		
	}

}
