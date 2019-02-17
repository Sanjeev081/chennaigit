package JavaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListconcept {

	public static  <E> void main(String[] args) {
		int a[]=new int[3];//static array---size is fixed
		//1.dynamic array--ArrayList:
		//2.cancontain dulicate values/element
		//3.Synchronised
		//4.allows random access to fetch the element  it store the values of index
		ArrayList ar=new ArrayList();
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		System.out.println(ar.size());
		ar.add(40);//3
		ar.add(50);//4
		ar.add(60);//5
		System.out.println(ar.get(5));
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			
		}
		//non	 generic vs generic:
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("sanjeev");
		ArrayList<E> ar3=new ArrayList<E>();
		//Employee class objects:
		Employee e1=new Employee("sanjeev",27,"qa");
		Employee e2=new Employee("Ajay",29,"qa");
		Employee e3=new Employee("gopal",24,"qa");
		//create arraylist:
		ArrayList<Employee> ar4=new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		//iterator 	to traverse the values:
		Iterator<Employee> it=ar4.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		//******************************
		//add all()
		ArrayList<String> ar5=new ArrayList<String>();
		ar5.add("test");
		ar5.add("selenium");
		ar5.add("QTP");
		ArrayList<String> ar6=new ArrayList<String>();
		ar6.add("dev");
		ar6.add("java");
		ar6.add("javascript");
		ar5.addAll(ar6);
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
			 
		}
		
		//remove all:
		ar5.removeAll(ar6);
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
			
		}
		System.out.println("***********************");
		//retainAll()
		ArrayList<String> ar7=new ArrayList<>();
		ar7.add("test");
		ar7.add("selenium");
		ar7.add("qtp");
		ArrayList<String> ar8=new ArrayList<>();
		ar8.add("test");
		ar8.add("java");
		ar8.add("javascript");
		ar7.retainAll(ar8);
		for(int i=0;i<ar7.size(); i++) {
			System.out.println(ar7.get(i));
			System.out.println();
		}
		
	   

			
		
		
		
		
 
	}

}
