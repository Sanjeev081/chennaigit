package JavaBasics;

import java.util.Hashtable;

public class HashTableconcept {
 
	public static void main(String[] args) {
		Hashtable h=new Hashtable();
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("c", "world");
		System.out.println(h.size());
		h.put(1, 100);
		h.put(2, 200);
		System.out.println(h.size());
		System.out.println(h.get(2));
		System.out.println(h.get("c"));
		h.put(3,"TOM");
		Hashtable<Integer, Integer> h1=new Hashtable<Integer,Integer>();
		h1.put(1, 100);
		Hashtable<Integer, String> h2=new Hashtable<Integer,String>();
		h2.put(1, "Tom");
			
		
		

	}

}
