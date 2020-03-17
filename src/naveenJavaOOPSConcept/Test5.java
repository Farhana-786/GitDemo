package naveenJavaOOPSConcept;

public class Test5 {

	public static void main(String[] args) {
      
		String x="100";
		System.out.println(x+20);
		
		//Data//Type conversion String to Integer
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer,double,character,boolean
	    String y="12.33";
	    double d=Double.parseDouble(y);
	    System.out.println(d+10);
	    
	    //boolean
 	    String k="true";
 	    boolean b=Boolean.parseBoolean(k);
	     System.out.println(b);
	    //Integer to String conversion
	     int j=200;
	     System.out.println(j+20);
	     String s=String.valueOf(j);
	     System.out.println(s+20);
	     
	     String u="100A";//NumberFormatException---for input String(100A)
	     Integer.parseInt(u);
	}

}
