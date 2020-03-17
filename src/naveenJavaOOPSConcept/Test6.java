package naveenJavaOOPSConcept;

public class Test6 {

	public static void main(String[] args) 
	{
		Test6 obj=new Test6();
		int x=10;
		int y=20;
		obj.testSum(x,y); //Call by value//Pass by value

	}
	
    public int testSum(int a,int b) {
    	a=30;
    	b=40;
    	int c=a+b;
    	return c;
    }
    //
}
