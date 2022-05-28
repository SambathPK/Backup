package com.practise2;

public class SuperKeyword extends ThisKeyword{
public void cricbuzz() {
		System.out.println("OUT "+super.a);
	}
public void cricTracker() {
	System.out.println(super.a);

}
public static void main(String[] args) {
	SuperKeyword s1=new SuperKeyword();
	s1.cricbuzz();
	s1.cricTracker();
}

}
