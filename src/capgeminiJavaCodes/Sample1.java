package capgeminiJavaCodes;

public class Sample1 {

	public static void main(String[] args) 
	{
       int num= 153;
       int temp = num;
       int r;
       int sum=0;
       
       while(num>0)
       {
       r=num%10;
       num=num/10;
       sum=sum + r*r*r;
       
       }
       
       if(temp== sum)
       {
    	   System.out.println("It is an Armstrong Number");
       }
       else
       {
    	   System.out.println("It is not Armstrong Number");
       }
	}

}
