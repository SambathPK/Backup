package com.constructor;

public class Construct1 {
int a;
String b;
public Construct1(int a,String b) {
	this.a=a;
	this.b=b;
}
public void display() {
System.out.println("Emp name is "+b);
System.out.println("Emp id is "+a);
}
public static void main(String[] args) {
	Construct1 c1=new Construct1(10, "Sampath");
			c1.display();
	Construct1 c2=new Construct1(20, "Pablo");
	c2.display();
}
}
