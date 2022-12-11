package com.company.exercises;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestEmployee {
	
	public static void main(String[] args) {
		
	Employee employeeOne = new Employee("Catalina Catalao", 34);
	Employee employeeTwo = new Employee("Juan Bezerra", 83);
	Employee employeeThree = new Employee("Jacinto Rui", 56);
	
	Set<Employee> employees = new TreeSet<>(new OrderByAge());
	
	employees.add(employeeOne);
	employees.add(employeeTwo);
	employees.add(employeeThree);
	
	Iterator<Employee> iterator = employees.iterator();
	while (iterator.hasNext()) {
		Employee nextEmployee = iterator.next();
		System.out.println(nextEmployee);
		
	}
	
	
	}
}
