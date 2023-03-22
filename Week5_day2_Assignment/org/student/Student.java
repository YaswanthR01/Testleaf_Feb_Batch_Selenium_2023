package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		String name = "Yaswanth";
		System.out.println("The name of the student " + name);
	}
	public void studentDept() {
		String dept = "Mechatronics";
		System.out.println("Department " + dept);
	}
	public void studentId() {
		int id = 45879;
		System.out.println("Student Id " + id);
	}
	public static void main(String[] args) {
		Student data = new Student();
		data.collegeName();
		data.collegeCode();
		data.collegeRank();
		data.depName();
		data.studentName();
		data.studentDept();
		data.studentId(); 

	}}
