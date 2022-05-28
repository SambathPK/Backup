package com.polymorphism;

public class FifaPlayer2 {
public void ronaldoRecords() {
	System.out.println("Won Ballon D'or for 4 times");
	}
public void ronaldoRecords(int a,String b) {
	System.out.println("Has fifa player of year for "+a +" "+b);
	}
public void ronaldoRecords(String c) {
	System.out.println("4 times winner of "+c);
	}
public static void main(String[] args) {
	FifaPlayer2 f2=new FifaPlayer2();
	f2.ronaldoRecords();
	f2.ronaldoRecords(4, "times");
	f2.ronaldoRecords("Golden boot");
}

}
