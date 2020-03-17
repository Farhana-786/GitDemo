package naveenJavaExamp;

public class Sample5 {

	public static void main(String[] args)
	{
		//array:To store similar data type in array variable
		
		//1. int array
		//Lowest bound/index= 0
		//Upper bound/index=n-1(n is size of array)
		 
		//One dim Array(advan-multiple values in a single variable with similar data type)
		//(disadvan= size is fixed----Static array---To overcome of this problem,we use collections--Arraylist,HashTable){dynamic array]
		//(stores only similar data type----To overcome of this problem,we use object array)
		
		int i[]=new int[4];
		  i[0]= 10;
		  i[1]= 20;
		  i[2]= 30;
		  i[3]= 40;
		  System.out.println(i[2]);
		  System.out.println(i[3]);
          System.out.println("********");
		 // System.out.println(i[4]); //*ArrayIndexOutOfBoundsException
		  System.out.println(i.length); //size of array
			System.out.println("********");		  
		  //print all the values of array (use for loop concepts)
		/*  for(int j=0;j<i.length;j++) {
			  System.out.println(i[j]);
		  }
			System.out.println("********");

		  //2.double array
		  double d[]=new double[3];
		  d[0]=12.33;
		  d[1]=13.44;
		  d[2]=45.55;
          System.out.println(d[2]);
  		System.out.println("********");

          //3.char array
          char c[]=new char[3];
          c[0]='q';
          c[1]='2';
          c[2]='$';
  		System.out.println("********");

          //4. Boolean array
          boolean b[]=new boolean[2];
          b[0]=true;
          b[1]=false;
          
  		System.out.println("********");

        //5. String array
  		String s[]=new String[3];
  		s[0]="test";
  		s[1]="Hello";
  		s[2]="World";
  		
  		System.out.println(s.length);
          
		System.out.println("********");*/

        //6.Object array:-(object is class)--- is used to store different dataTypes values
		/*Object ob[]=new Object[6];
		ob[0]="Tom";
		ob[1]=25;
		ob[2]=12.33;
		ob[3]="1/1/1990";
		ob[4]='m';
		ob[5]="London";
		for(int obj=0;obj<6;obj++) {
			System.out.println(obj);
		}
		//System.out.println(ob[5]);*/
	
	
	}

}
