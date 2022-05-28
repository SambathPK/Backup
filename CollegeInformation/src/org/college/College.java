package org.college;

import org.staff.Staff;
import org.student.Student;

public class College {
public void collegeName() {
	System.out.println("College Name is JIT");
}
public static void main(String[] args) {
	College c = new College();
	c.collegeName();
	
	Student s = new Student();
	s.stdId();
	s.stdName();
	s.stdDept();
	
	Staff sf = new Staff();
	sf.stfDept();
	sf.stfId();
	sf.stfName();
}
}
