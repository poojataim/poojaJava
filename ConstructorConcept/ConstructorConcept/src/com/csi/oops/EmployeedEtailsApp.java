package com.csi.oops;

public class EmployeedEtailsApp {

	final int empId = 121;

	int empCode = 33;

	public static void main(String[] args) {

		System.out.println("\n Employee Name: " + Constants.EMPLOYEE_NAME);

		EmployeedEtailsApp e1 = new EmployeedEtailsApp();
		e1.show();

	}

	void show() {
		// empId = 501;
		System.out.println("\n Employee Id: " + empId);
	}
}
