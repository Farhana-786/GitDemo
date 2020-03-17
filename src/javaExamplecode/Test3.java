package javaExamplecode;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) 
	{
		//Reverse a integer
		/*int num=123456643;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse number is:"+rev );*/
		
	//2.Using String Buffer Reverse method
		int num1=123456789;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
      /*Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
     / int x=sc.nextInt();
      int y=0;
      while(x!=0){
    	  
    	 int d=x%10;
    	 y=y*10+d;
    	 x=(int)x/10;
      }
      System.out.println("Reverse a number "+y);*/ 
		//Reverse String[Difference between String and String Buffer]
		//Do u we have reversefunction in string ? no
   /*  String s="Selenium";
      int len=s.length();
      String rev="";
      for(int i=len-1;i>=0;i--) 
      {
    	  rev=rev+s.charAt(i);
      }
      System.out.println(rev);
	//Using String buffer class
		StringBuffer sf=new StringBuffer(s);
		System.out.println(sf.reverse());*/
		
		
	}

}
