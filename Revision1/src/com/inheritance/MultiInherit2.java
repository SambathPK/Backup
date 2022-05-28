package com.inheritance;

public class MultiInherit2 extends MultiInherit1{
public void hola3() {
System.out.println("Amigo2");

}
public static void main(String[] args) {
	MultiInherit2 m2=new MultiInherit2();
	m2.hola3();
	m2.hola1();
	m2.hola2();
}
}
