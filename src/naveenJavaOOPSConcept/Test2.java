package naveenJavaOOPSConcept;

public class Test2 {
	
	//main() is void it will Never returns is value.
     //Y  main() is void because we never write return statement inside the main() method...
	//main() method--- starting point of execution(java complier will check first this main is there or not)
	public static void main(String[] args) {
		
		Test2 obj=new Test2();
		//obj---(refrence varaible,to that object)
		//[after creating the object,the copy of all non static method will be given to this particular object]
       obj.test();
       int l=obj.pqr();
       System.out.println(l);
       String s1=obj.qa();
       System.out.println(s1);
       int div=obj.division(40,20);
       System.out.println(div);
	}
    // non-static method
	//void ---- doesnot return anyvalue(no return type)
	public void test() {   //no input no output
		System.out.println("test method");
	}
	
	public int pqr() {  //no input and some output
		System.out.println("Pqr method");
		 int a=10;
		 int b=20;
		 int c=a+b;
		 
		 return c;
	}
	//return type is String
	public String qa() {   //no input and some output
		System.out.println("qa");
		String s="selenium";
		return s;
	}
	//return type is interger
	//x,y-----input parameters//input arguments
	public int division(int x, int y) {
		System.out.println("division method");
		int d=x/y;
				return d;
	}
}
