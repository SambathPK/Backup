package com.practise;

public class Constructor2 extends Constructor1 {
	public Constructor2() {
		System.out.println("A");
	}
	
	
	public static void main(String[] args) {
		Constructor2 x = new Constructor2();
		Constructor1 y = new Constructor1(33);
		
	}

}
