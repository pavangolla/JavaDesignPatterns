package com.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pgangadhar on 5/27/16.
 */
public class Employee {

	private String name;
	private String designation;
	private int salary;
	private List<Employee> subOrdinates = new ArrayList<>();

	public Employee(String name, String designation, int salary) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public int getSalary() {
		return salary;
	}

	public void addSubOridnate(Employee employee) {
		getSubOrdinates().add(employee);
	}

	public List<Employee> getSubOrdinates() {
		return subOrdinates;
	}

	@Override public String toString() {
		final StringBuffer sb = new StringBuffer("Employee{");
		sb.append("name='").append(name).append('\'');
		sb.append(", designation='").append(designation).append('\'');
		sb.append(", salary=").append(salary);
		sb.append(", subOrdinates=").append(subOrdinates);
		sb.append('}');
		return sb.toString();
	}
}
