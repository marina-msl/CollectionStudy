package com.company.exercises;

import java.util.Comparator;

public class OrderByAge implements Comparator<Employee> {
	
	@Override
	public int compare(Employee employee, Employee otherEmployee) {
		return employee.getAge() - otherEmployee.getAge();
	}
}
