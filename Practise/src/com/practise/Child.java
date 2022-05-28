package com.practise;

public class Child implements Practise1,Practise2{

	@Override
	public void fun1() {
		System.out.println("Size = "+a);
	}

	public static void main(String[] args) {
	Child c=new Child();
	c.fun1();
	
}
}
