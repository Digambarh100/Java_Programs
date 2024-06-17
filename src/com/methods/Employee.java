package com.methods;

public class Employee {
	int id = 101;
	String name = "Velocity";
	String city = "Pune";

	@Override
	 public String toString() {
	 return "Employee [id=" + id + ", name=" + name + ",city=" + city + "]";
	 }

	public void addEmployee() {
	Employee emp = new Employee();
	 System.out.println(emp);
	// return emp; // return object as emp to Employee  type method
	
	 }

	public static void main(String[] args) {
		Employee e = new Employee();
		e.addEmployee();
	}
}

