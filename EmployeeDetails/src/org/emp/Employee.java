package org.emp;

public class Employee {
public void empId() {
	int id=10;
	System.out.println("Emp Id is "+id);
}
public void empName() {
	String name= "Sampath";
	System.out.println("Emp Name is "+name);
}
public void empDob() {
	System.out.println("Emp DOB is 10/10/1997");
}
public void empPhone() {
	long no = 1234567890;
	System.out.println("Emp ph no is "+no);
}
public void empEmail() {
	System.out.println("Emp email is sambath351@gmail.com");
}
public void empAddress() {
	System.out.println("Emp Address is Chennai");
}
public static void main(String[] args) {
	Employee e = new Employee();
	e.empId();
	e.empName();
	e.empDob();
	e.empPhone();
	e.empEmail();
	e.empAddress();
}
}
