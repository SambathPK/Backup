package com.testng;

import org.testng.annotations.Test;

public class Groups {
    @Test(groups = "samsung")
	private void samsung() {
		System.out.println("Iam samsung");
	}
    
    @Test(groups = "samsung")
	private void samsung1() {
		System.out.println("Iam samsung1");
	}
    
    @Test(groups = "iphone")
	private void iphone() {
		System.out.println("Iam iphone");
	}
    
    @Test(groups = "iphone")
	private void iphone1() {
		System.out.println("Iam iphone1");
	}
    
    @Test(groups = "redmi")
	private void redmi() {
		System.out.println("Iam redmi");
	}
    
    @Test(groups = "redmi")
	private void redmi1() {
		System.out.println("Iam redmi1");
	}
}
