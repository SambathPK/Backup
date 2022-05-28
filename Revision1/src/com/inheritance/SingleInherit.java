package com.inheritance;

public class SingleInherit {
public void stdName() {
	System.out.println("My name is sampath");
}
public void stdId() {
	System.out.println("My id is 100");

}
public static void main(String[] args) {
	SingleInherit si=new SingleInherit();
	si.stdId();
	si.stdName();
}
}
