package com.practise;

import java.util.Scanner;

public class ScannerClass {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Name");
	String nextLine = s.nextLine();
	System.out.println("Name is "+nextLine);
	System.out.println("Enter the age");
	int a = s.nextInt();
	System.out.println("Age is "+a);
	System.out.println("enter the school");
	String b =s.next();
	System.out.println("School name is "+b);
	}

}
