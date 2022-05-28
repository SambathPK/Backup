package com.practise;

public class StaticVariable {
static int a=10;

public  static void sam() {
	int b=30;
	System.out.println(b);
	a++;// for counting the objects ...common
	
}
static int a1=40;
static int a2= 50;


public static void main(String[] args) {
StaticVariable s=new StaticVariable();
StaticVariable s2=new StaticVariable();
System.out.println(a);
System.out.println(a1);
System.out.println(a2);
s.sam();
s2.sam();

System.out.println(StaticVariable.a);
}
}
