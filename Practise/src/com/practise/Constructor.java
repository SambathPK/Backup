package com.practise;

public class Constructor {
 int number;
 String Name;
 static String College = "SRM";

public Constructor(int empnum,String EmpName) {
	 number= empnum;
	 Name = EmpName;
}
public void idCard() {
	
System.out.println("EmpName is"+Name);
System.out.println("Empnum is "+number);
System.out.println("clg is"+College);
}
public static void main(String[] args) {
	Constructor c= new Constructor(10, "Sambath");
			c.idCard();
			Constructor c2= new Constructor(20, "Pablo");
			c2.idCard();
}
}
