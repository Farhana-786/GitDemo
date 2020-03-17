package naveenJavaOOPSConcept;

public class Test4 {

	//Global var: The scope of global accross the function with one one condition
	String name="Tom";//non static global variable
	static int age=25; //static global variable
	
	public static void main(String[] args) 
	{
	  //how to call static methods and variables
		//1.direct calling
		sum();
		//2.Calling by class name
		Test4.sum();
		System.out.println(age);
		System.out.println(Test4.age);
		
	//how to call non static methods and variables
		Test4 obj=new Test4();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can i access static method by using object refrence? yes i can access but this is not a good practice one warning that 
		obj.sum();
		

	}
	public void sendMail() {  //static method
		System.out.println("Send mail method");
	}
    public static void sum() {  //non static methods
    	System.out.println("send sum");
    }
}
