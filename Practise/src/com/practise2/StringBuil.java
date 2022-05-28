package com.practise2;

public class StringBuil {
public static void main(String[] args) {
	StringBuilder s1= new StringBuilder("Welcome ");
	StringBuilder s2= new StringBuilder("Java ");
	StringBuilder s3= new StringBuilder("Python ");
	
	
	s1.append(s2);
	System.out.println(s1);
	s2.append(s3);
	System.out.println(s2);
	
	System.out.println(s1.reverse());
	
	
	
}
}
