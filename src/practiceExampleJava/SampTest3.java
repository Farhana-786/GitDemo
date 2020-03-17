 package practiceExampleJava;

public class SampTest3 {

	public static void main(String[] args)
	{
		//Create an object to Interface with the help of Concrete class
		Sample3 obj=new Sample4();
		int x=obj.add(20, 80);
		System.out.println(x);
		
		//Create object to Concrete class
		Sample4 obj1 =new Sample4();
		int y=obj1.add(10, 50);
		System.out.println(y);
		
		

	}

}
