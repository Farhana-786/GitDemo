package naveenJavaExamp;

public class Sample6 {

	public static void main(String[] args) 
	{
		String x[][]=new String[3][5];
		
		System.out.println(x.length);  //Total no of rows==3
		System.out.println(x[0].length);  //Total no of columns==5
		
		x[0][0]="a";
		x[0][1]="b";
		x[0][2]="c";
		x[0][3]="d";
		x[0][4]="e";
		
		x[1][0]="a1";
		x[1][1]="b1";
		x[1][2]="c1";
		x[1][3]="d1";
		x[1][4]="e1";
		
		x[2][0]="a2";
		x[2][1]="b2";
		x[2][2]="c2";
		x[2][3]="d2";
		x[2][4]="e2";
		
		
		System.out.println(x[1][2]);
		System.out.println(x[2][2]);
		System.out.println(x[0][4]);
		
		
		//Print all the values of 2d array
		//row =0,column= 0 to 4
		//row =1,column=0 to 4
		//row =2,column=0 to 4
		for(int rows=0;rows<x.length;rows++) {
			for(int colm=0;colm<x[0].length;colm++) {
				System.out.println(x[rows][colm]);
			}
		}
		
	}

}
