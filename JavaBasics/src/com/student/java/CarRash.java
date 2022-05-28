package com.student.java;

public class CarRash extends BikeRash{
	public void carName() {
		System.out.println("Car name is ford");

	}
	public static void main(String[] args) {
		CarRash c = new CarRash();
		c.carName();
		c.bikeName();
		
	}

}
