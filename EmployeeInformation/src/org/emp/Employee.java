package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
public void empName() {
	System.out.println("Employee Name is Sampath");

}
public static void main(String[] args) {
	Employee e = new Employee();
	e.empName();
	
	Company c = new Company();
	c.companyName();
	
	Client ce = new Client();
	ce.clientName();
	
	Project p = new Project();
	p.projectName();
}
}
