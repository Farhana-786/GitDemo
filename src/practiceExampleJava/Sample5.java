package practiceExampleJava;

public class Sample5
{
   public int x;
   private Sample5()
   {
	   x=10;
   }
   public static Sample5 create()
   {
	   Sample5 obj1=new Sample5();
	   return(obj1);
   }
   public void dispaly()
   {
	   System.out.println(x);
   }
}
