package com.practise;

public class Switch {
public static void main(String[] args) {
	int a = 1;
	int b =	2;
	char thala = '+';
			
	switch(thala) {
	case '+':
		System.out.println(a +"+"+b +"=" +(a+b));
		break;
	case '-':
		System.out.println(a +"-"+b +"=" +(a-b));
		break;
	case '*':
		System.out.println(a +"*"+b +"=" +(a*b));
		break;
	}
 }
}
