package com.practise2;

public class StringSplit {
public static void main(String[] args) {
	String s1= "Messi and ronaldo are the best in the world ever";
	String[] split = s1.split(" ");
	 for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
	}
}
}
