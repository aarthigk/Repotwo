package JavaBasics;

public class TwoDimension {
	public static void main(String[] arg) {
		
		String x[][]=new String [3][5];
		
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
		x[0][4]="E";
		
		
		x[1][0]="A1";
		x[1][1]="B1";
		x[1][2]="C1";
		x[1][3]="D1";
		x[1][4]="E1";
		
		x[2][0]="A11";
		x[2][1]="B11";
		x[2][2]="C11";
		x[2][3]="D11";
		x[2][4]="E11";
		
	for(int i=0;i<x.length;i++)
	{
		for (int j=0;j<x[0].length;j++)
		{
			System.out.println(x[i][j]);
		}
	}
		
	}
}
