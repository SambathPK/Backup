package com.Variable;

public class StaticVariable {
static int a=100;
 static  {
	System.out.println("Do");
	//it is executed when class loads before main method
	a=50;
}
public void profession() {
	System.out.println("Hi");

}
public static void main(String[] args) {
	StaticVariable s=new StaticVariable();
	s.profession();
	System.out.println(a);
}
}
