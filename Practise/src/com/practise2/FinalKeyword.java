package com.practise2;

public class FinalKeyword {
public void dhoni() {
	System.out.println("HELICOPTER");
}
public final void sachin() {
	System.out.println("100");// by using final keyword we cannot modify,inherit,overide anything

}
public static void main(String[] args) {
	FinalKeyword f=new FinalKeyword();
	f.dhoni();
	f.sachin();
}
}
