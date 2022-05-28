package com.encapsulation;

public class Encap {
private int a;

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}
public static void main(String[] args) {
	Encap e=new Encap();
	e.setA(10);
	System.out.println(e.getA());
}
}
