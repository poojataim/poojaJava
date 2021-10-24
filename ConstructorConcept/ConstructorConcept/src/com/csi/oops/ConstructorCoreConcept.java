package com.csi.oops;
class Employee {
	int empAge;
	int empId = 121;
	String empName = "SWARA";
	double empSalary = 45756.78;
	String empAddress;
	long empContactNumber;
	public Employee() {
		System.out.println(
				"\n Employee Id: " + empId + "\n Employee Name: " + empName + "\n Employee Salary: " + empSalary);
	}
	public Employee(String empAddress, long empContactNumber, String empEmailId) {
		this.empAddress = empAddress;
		this.empContactNumber = empContactNumber;
	}
	public void displayData() {
		System.out.println("\n Employee Address: " + empAddress + "\n Employee Contact Number: " + empContactNumber);
	}
}
public class ConstructorCoreConcept {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee("PUNE", 634545656L,"POOJA@INSTA.COM");
		e2.displayData();
	}
}
