package com.SpringEmployee.model;

public class SpringEmployeeService {

	private String name;
	private int salary;
	@Override
	public String toString() {
		
		return "SpringEmployeeService [name=" + name + ",salary= " + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
