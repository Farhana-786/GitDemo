package practiceExampleJava;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) 
	{
		//Give a Number from Keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int x=sc.nextInt();
		//Check the Number is Even or Odd
		if(x%2==0)
		{
			System.out.println(x+" is a Even Number");
		}
		else
		{
			System.out.println(x+" is a Odd Number");
			
		}

	}

}
