package com.practise2;

public class ThisKeyword {
int a=20;
public void test() {
	
	System.out.println(a);

}
public static void main(String[] args) {
	ThisKeyword t= new ThisKeyword();
	t.test();
}
}
