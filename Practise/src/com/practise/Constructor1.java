package com.practise;

public class Constructor1 {
	public Constructor1() {
		System.out.println("Hello");
	}
	
	
	public Constructor1(int i) {
		System.out.println("My Rank is "+i);
	}
	public static void main(String[] args) {
		
		Constructor1 b =new Constructor1(12);
		Constructor1 a = new Constructor1();
	}

}
