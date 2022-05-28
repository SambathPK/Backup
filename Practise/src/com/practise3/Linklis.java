package com.practise3;


import java.util.LinkedList;
import java.util.List;

public class Linklis {
public static void main(String[] args) {
	List<Object> li= new LinkedList<Object>();
	 li.add(10);
	 li.add(20);
	 li.add(30);
	 li.add(40);
	 li.add(50);
	 li.add("Hello");
	 li.add('C');
	 
	 System.out.println(li);
	 
	 li.add(2, 25);
	 
	 System.out.println(li);
	 
	 li.set(2,23);
	 System.out.println(li);
	 
	 System.out.println(li.get(2));
	 
	 int size = li.size();
	 System.out.println(size);
	 
	 li.remove(2);
	 System.out.println(li);
	 
	boolean contains = li.contains(30);
	System.out.println(contains);
	
	System.out.println(li);
System.out.println(li.get(2));
	
	
    
	
	
	
}
}
