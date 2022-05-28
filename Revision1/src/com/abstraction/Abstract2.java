package com.abstraction;

public class Abstract2 extends Abstract1 {

	@Override
	public void stdId() {
		System.out.println("Hola1");
		
	}

	@Override
	public void stdDetails() {
		System.out.println("Hola2");
		
	}
@Override
public void stdName() {
	// TODO Auto-generated method stub
	super.stdName();
}
public static void main(String[] args) {
	Abstract2 a=new Abstract2();
	a.stdId();
	a.stdDetails();
}
}
