package com.practise3;

import java.util.ArrayList;
import java.util.List;

public class ArrLit {
public static void main(String[] args) {
	List<Object> li= new ArrayList<Object>();
	 li.add(10);
	 li.add(20);
	 li.add(30);
	 li.add(40);
	 li.add(50);
	 li.add(70);
	 li.add("dddddf");
	 
	 System.out.println(li);
	 
	 li.add(2, 22);
	 System.out.println(li);
	 
	 li.set(2, 25);
	 System.out.println(li);
	 
	 System.out.println(li.get(2));
	 
	 li.remove(2);
	 System.out.println(li);
	 
	
	 System.out.println(li.size());
	 
	 boolean contains = li.contains(30);
	 System.out.println(contains);
	  int size = li.size();
	  System.out.println(size);
	 
	 
	 
    

}
}
