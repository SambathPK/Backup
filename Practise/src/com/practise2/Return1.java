package com.practise2;

public class Return1 {
public int add() {
	int a=20;
	int b=30;
	
	if (a>b) {
		return a;
	}
	else {
		return b;
	}

}
public static void main(String[] args) {
	Return1 r=new Return1();
	int c =r.add();
	System.out.println(c);
}
}
