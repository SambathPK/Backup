package com.polymorphism;

public class FifaPlayers {
public void messiRecords() {
	System.out.println("5 time Ballon D'or");
	}
public void messiRecords(int b,String c) {
	System.out.println("Has won Fifa player of the year for "+b +" "+c);
	}
public void messiRecords(String a) {
	System.out.println("4 times winner of the year for "+a);
	}
public static void main(String[] args) {
	FifaPlayers f= new FifaPlayers();
	f.messiRecords();
	f.messiRecords(4, "times");
	f.messiRecords("Golden boot");
}

}
