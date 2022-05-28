package com.practise3;

public class Excep {
public static void main(String[] args) {
	int a=10,b=0;
	int c;
	try {
		c=a/b;
	} catch (NullPointerException e) {
		System.out.println("Null error occurred");
	} catch (ArithmeticException e) {
		System.out.println("Error occurred");
	}
	System.out.println("Hello");
	
}
}
