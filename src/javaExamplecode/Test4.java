package javaExamplecode;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  limit number");
		int x=sc.nextInt();
		int a=0;
		int b=1;
		System.out.println(a+" "+b+" ");
		do {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
		}while((a+b)<x);
	}

}
