package com.abstraction;

public class AbstractDemo2 extends AbstractionDemo {

	@Override
	public void football() {
		System.out.println("messi");// TODO Auto-generated method stub
		
	}

	@Override
	public void hockey() {
		System.out.println("goalllllll");
		
	}
@Override
public void cricket() {
	// TODO Auto-generated method stub
	super.cricket();
}
public static void main(String[] args) {
	AbstractDemo2 ab=new AbstractDemo2();
	ab.football();
	ab.cricket();
	ab.hockey();
}
}
