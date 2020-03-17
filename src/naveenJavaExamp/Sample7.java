package naveenJavaExamp;

import java.util.ArrayList;

public class Sample7 {

	public static void main(String[] args) 
	{
		ArrayList ar=new ArrayList();
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());
		
		ar.add(500);//3
		ar.add(600);//4
	
		System.out.println(ar.size());
		
		ar.add("Tom");//5
		ar.add("Hello");//6
		ar.add(12.33);//7
		ar.add('M');//8
		ar.add(600);//9
		System.out.println(ar.size());
		
		ar.remove(9);
		
		System.out.println(ar.size());
     
		System.out.println(ar.get(3));
		//Print all the values of array list
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		//al.add(12.33);
		ArrayList<String> as=new ArrayList<String>();
		as.add("tom");
		
	}

}
