package com.Variable;

public class LocalVariable {
public void hello() {
	int a=10;
	System.out.println(a);
}
public static void main(String[] args) {
	LocalVariable l=new LocalVariable();
	l.hello();
}
}
