package com.inheritance;

public class MultiInherit1 extends MultiInherit{
public void hola2() {
	System.out.println("Amigo2");
}
public static void main(String[] args) {
	MultiInherit1 m1=new MultiInherit1();
	m1.hola2();
	m1.hola1();
}
}
