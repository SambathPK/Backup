package com.practise2;

public class Stringsplit1 {
public static void main(String[] args) {
	String s1="HOLA AMIGO HERMANO MIERDA PUTHA";
	String[] split = s1.split(" ",3);
	 for (String string : split) {
		System.out.println(string);
		
	}
}
}
