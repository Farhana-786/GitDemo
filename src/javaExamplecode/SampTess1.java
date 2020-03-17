package javaExamplecode;

public class SampTess1
{
 //Data Members
	public int x;
	public float y;
	public char z;
	public String s;
	public boolean b;
	//methods
	public SampTess1()
	{
		x=10;
		s="book";
	}
	public SampTess1(int a)
	{
	  x=a;
	  s="book";
	}
	public SampTess1(float a)
	{
		y=a;
		s="book";
	}
	public SampTess1(int a, String w)
	{
		x=a;
		s="w";
	}
	public void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(s);
		System.out.println(b);
	}
}
