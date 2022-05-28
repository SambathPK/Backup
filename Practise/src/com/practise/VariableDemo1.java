package com.practise;

public class VariableDemo1 {
int a=20;

public void fifa() {
	int a=30;
System.out.println(a);
}
public static void main(String[] args) {
	VariableDemo1 v= new VariableDemo1();
	
	v.fifa();
	System.out.println(v.a);
}
}
