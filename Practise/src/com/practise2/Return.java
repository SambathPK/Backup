package com.practise2;

public class Return {
public int add() {
		int a=20;
		int b=30;
		int c=a+b;
		return c;

	}
public static void main(String[] args) {
	Return r= new Return();
	int c =r.add();
	System.out.println(c);
}

}
