package com.scanner;

import java.util.Scanner;

public class Scanner1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the name");
	String s2=s.nextLine();
	System.out.println("Nmae is "+s2);
	System.out.println("Enter the age");
	int s3 = s.nextInt();
	System.out.println("Age is "+s3);
}
}
