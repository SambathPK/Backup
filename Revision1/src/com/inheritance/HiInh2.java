package com.inheritance;

public class HiInh2 extends HiInh{
public void hombre2() {
	System.out.println("Amigo3");

}
public static void main(String[] args) {
	HiInh2 h2=new HiInh2();
	h2.hombre2();
	h2.hombre();
}
}
