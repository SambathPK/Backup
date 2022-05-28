package com.practise2;

public class StringMutable {
	public static void main(String[] args) {
		
	

	StringBuffer s1= new StringBuffer("Welcome ");
	StringBuffer s2= new StringBuffer("Welcome ");
	StringBuffer s3= new StringBuffer("Welcome ");
	
	
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	System.out.println(System.identityHashCode(s3));
	
	
	StringBuffer append = s1.append(s2);
	System.out.println(append);
	System.out.println(System.identityHashCode(append));
	System.out.println(s1);
	s2.append(s3);
	System.out.println(s2);
	
	s1.replace(1, 7, "Hola");
	System.out.println(s1);
	
	s1.insert(1, 'a');
	System.out.println(s1);
	
	System.out.println(s1.reverse());
	
	s1.ensureCapacity(50);
	System.out.println(s1.capacity());
	
	System.out.println(System.identityHashCode(s1));
	System.out.println(s1);
	
	
	}
}
