package com.interf;

public class Interf2 implements Interf1 {

	@Override
	public void cricket() {
System.out.println("dhoni");		
	}

	@Override
	public void football() {
	System.out.println("Messi");
		
	}

	@Override
	public void hockey() {
		System.out.println("hockey2");		
	}
	public static void main(String[] args) {
		Interf2 i2=new Interf2();
		i2.cricket();
		i2.football();
		i2.hockey();
	}

}
