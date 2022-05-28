package com.inheritance;

public class SingleInherit1 extends SingleInherit{
public void stdClass() {
	System.out.println("Class is A");

}
public static void main(String[] args) {
	SingleInherit1 si1=new SingleInherit1();
	si1.stdName();
	si1.stdId();
	si1.stdClass();
}
}
