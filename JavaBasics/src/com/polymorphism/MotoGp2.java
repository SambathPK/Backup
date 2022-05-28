package com.polymorphism;

public class MotoGp2 {
public void marcMarquez() {
		System.out.println("Germany gp winner");
	}
public void marcMarquez(int a) {
	System.out.println("France gp winner");
}
public void marcMarquez(float b,int a) {
	System.out.println("Spain gp winner");
}
public static void main(String[] args) {
	MotoGp2 m=new MotoGp2();
	m.marcMarquez();
	m.marcMarquez(10);
	m.marcMarquez(10, 20);;
}

}
