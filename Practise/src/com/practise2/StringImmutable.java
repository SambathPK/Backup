package com.practise2;

public class StringImmutable {
	public static void main(String[] args) {
String s1="Hello";
String s2="Hello";
String s3="Hello";

s1="Bro";

System.out.println(System.identityHashCode(s1));
System.out.println(System.identityHashCode(s2));
System.out.println(System.identityHashCode(s3));

String concat = s1.concat(s2);
System.out.println(concat);
System.out.println(System.identityHashCode(concat));
System.out.println(s1);

String concat2 = s2.concat(s3);
System.out.println(concat2);
System.out.println(System.identityHashCode(concat2));



	}
}
