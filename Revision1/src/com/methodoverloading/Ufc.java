package com.methodoverloading;

public class Ufc {
public void mcgregor() {
	System.out.println("Heavyweight champion");
}
public void mcgregor(int a) {
	System.out.println("featherwight champion");
}
public void mcgregor(int b,String c) {
	System.out.println("welterweight champion");
}
public static void main(String[] args) {
	Ufc u=new Ufc();
	u.mcgregor();
	u.mcgregor(10);
	u.mcgregor(10, null);
}
}
