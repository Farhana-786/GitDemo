package naveenJavaOOPSConcept;

public class Test3 {

	public static void main(String[] args) 	{
		
		Test3 obj=new Test3();
		obj.sum();
		obj.sum(10);
		obj.sum(10,5);
	}
	public static void main(int p) {
		
		
	}
	public static void main(int q,int h) {
		
	}
	//main() method can be overloaded
	//You cannot create a method inside a method
	//Duplicate method---same method name with same number of arguments/input parameters are not allowed
	//Method overloading---is when the method name is same with different arguments//input parameters within the same class 
	public void sum() { //zero input para
		System.out.println("sum method---zero para");
		
	}
	public void sum(double d) {
		
	}
    public void sum(int i) {
    	System.out.println("sum method");
    }
    public void sum(int k,int l) {
    	System.out.println("Sum method");
    	System.out.println(k+l);
    }
}
