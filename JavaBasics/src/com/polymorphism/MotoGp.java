package com.polymorphism;

public class MotoGp {
private void vr46() {
		System.out.println("Thailand gp winner");
	}
private void vr46(int a) {
	System.out.println("Australian gp winner");
}
private void vr46(int a,int b) {
	System.out.println("Belgium gp winner");
}
public static void main(String[] args) {
	MotoGp m= new MotoGp();
	m.vr46();
	m.vr46(10);
	m.vr46(10, 20);
}


}
