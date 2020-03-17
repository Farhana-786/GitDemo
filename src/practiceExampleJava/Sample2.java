package practiceExampleJava;

public class Sample2
{
	//Data Memebers
	 public int x;
	 public float y;
	 public char z;
	 public String w;
	 public boolean b;
	 
	 //Constructor Method
	 public Sample2()  
	 {
		 int x=10;
		 w="kalam";
	 }
	 public Sample2(int a)
	 {
		 x=a;
		 w="kalam";
	 }
	 public Sample2(float a)
	 {
		 y=a;
		 w="kalam";
		 
	 }
	 public Sample2(int a, String s)
	 {
		 x=a;
		 w=s;
	 }
	 
	  public void display() 
	  {
		  System.out.println(x);
		   System.out.println(y);
		   System.out.println(z);
		   System.out.println(w);
		   System.out.println(b);
	  }
}
