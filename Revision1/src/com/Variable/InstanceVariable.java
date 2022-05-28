package com.Variable;

public class InstanceVariable {
int a;
public void stdName(int a) {
	this.a=a;
	System.out.println("HI "+a);
}
public static void main(String[] args) {
	InstanceVariable i=new InstanceVariable();
	i.stdName(10);
	System.out.println(i.a);
}
}
