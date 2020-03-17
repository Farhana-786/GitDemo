package naveenJavaOOPSConcept;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) 
	{
      //Reverse String
		/*String x="Farhana";
		String z="";
		for(int i=x.length()-1;i>=0;i--) {
			z=z+x.charAt(i);
		}
		System.out.println(z+" is a Reverse word");*/
  	     // Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a number");
		//int x=sc.nextInt();
		int num=12345;	
		int rev=0;
		while(num!=0) 
		{
			rev=rev*10+num%10;
			num=num/10;
		 } 
		System.out.println("Reverse number is:: "+rev);
	}
	

}
