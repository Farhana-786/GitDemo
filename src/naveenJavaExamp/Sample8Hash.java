package naveenJavaExamp;

import java.util.Hashtable;

public class Sample8Hash {

	public static void main(String[] args) 
	{
		Hashtable ht=new Hashtable();
        ht.put("A","test");
        ht.put("B", "Hello");
        ht.put("C","World");
        
        System.out.println(ht.size());
        
        ht.put(1,100);
        ht.put(2,200);
        
        System.out.println(ht.size());
        
        System.out.println(ht.get(2));
        System.out.println(ht.get("A"));
        
        ht.put(3,"far");
        System.out.println(ht.get(3));
        
        
        Hashtable<Integer,Integer> hi=new Hashtable<Integer,Integer>();
        hi.put(1, 500);
       // hi.put(A,'g');
        
        Hashtable<Integer,String> hs=new Hashtable<Integer,String>();
        hs.put(6,"tom");
        
	}
	

}
