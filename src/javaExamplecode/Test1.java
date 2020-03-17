package javaExamplecode;

public class Test1 {

	public static void main(String[] args) 
	{
      SampTess1 obj1=new SampTess1();
      obj1.display();
      SampTess1 obj2=new SampTess1(100);
      obj2.display();
      SampTess1 obj3=new SampTess1((float)10.0);
      obj3.display();
      SampTess1 obj4=new SampTess1(100,"book");
      obj4.display();
	}

}
