package com.methodoverriding;

public class Ufc2 extends Ufc1{
@Override
public void khabib() {
	// TODO Auto-generated method stub
	super.khabib();
}
@Override
	public void khabib(int a) {
		// TODO Auto-generated method stub
		super.khabib(a);
	}
public static void main(String[] args) {
	
Ufc2 u2=new Ufc2();
u2.khabib();
u2.khabib(10);
}
}
