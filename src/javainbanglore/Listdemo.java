package javainbanglore;

import java.util.ArrayList;
import java.util.List;

public class Listdemo {


	public static void main(String[] args) {
		      List<Integer> li=new ArrayList<Integer>();
		      li.add(0,1);
		      li.add(1,2);
		      li.add(2,3);
		      System.out.println(li);
		      List<Integer> l2=new ArrayList<>();
		      l2.add(1);
		      l2.add(2);
		      l2.add(3);
		      li.addAll(2, l2); 
		        System.out.println(li); 
		  
		      // Removes element from index 1 
		        li.remove(1);      
		        System.out.println(li); // [1, 2, 3, 2] 
		  
		       // Prints element at index 3 
		        System.out.println(li.get(3)); 
		  
		       //Replace 0th element with 5 
		        li.set(0, 5);    
		        System.out.println(li);  
		       
		    } 
	}


