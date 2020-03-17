package javaExamplecode;

public class Sample1 {

	   static void methodOne()
	     {
	          System.out.println("From Method One");
	          methodTwo();
	     }
	 
	     static void methodTwo()
	     {
	          System.out.println("From Method Two");
	     }
	public static void main(String[] args) 
	{
		//int i=10;
        //System.out.println(i);
        //int i=0;
        //System.out.println(i++);
        //System.out.println(++i);
        //System.out.println(i--);
       // System.out.println(--i);

        System.out.println("Main Method Started");
        methodOne();
        System.out.println("Main Method Ended");
	}

}
