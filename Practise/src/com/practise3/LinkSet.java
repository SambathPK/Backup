package com.practise3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkSet {
public static void main(String[] args) {
	 Set<Object> hs= new LinkedHashSet<Object>();
	  
	  hs.add(1);
	  hs.add(2);
	  hs.add(3);
	  hs.add(4);
	  hs.add(null);
	  hs.add("Hello");
	  hs.add('c');
	  
	  System.out.println(hs);
	  
	  
	 
}
}
