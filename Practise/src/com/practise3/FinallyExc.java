package com.practise3;

public class FinallyExc {
public static void main(String[] args) {
	int a=10,b=0;
	int c;
	try {
		c=a/b;
		System.out.println(c);
	} finally{
		System.out.println("Finally code execution");
	}
}
}
