package com.methodoverriding;

public class Ufc1 {
public void khabib() {
	System.out.println("Nurmagadov");
}
public void khabib(int a) {
	System.out.println("Nurmagadov1");
}
public static void main(String[] args) {
	Ufc1 u1=new Ufc1();
	u1.khabib();
	u1.khabib(10);
}
}
