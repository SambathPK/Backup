package com.interf;

public class Inter2 implements Inter1 {

	@Override
	public void stdName() {
		System.out.println("Hi1");
		
	}

	@Override
	public void stdId() {
		System.out.println("Hi2");
		
	}

	@Override
	public void stdDetails() {
		System.out.println("Hi3");
		
	}
	public static void main(String[] args) {
		Inter2 i=new Inter2();
		i.stdDetails();
		i.stdId();
		i.stdName();
	}

}
