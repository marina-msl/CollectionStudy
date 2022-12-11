package com.company.project;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Set<String> students = new HashSet<>();
		
		students.add("Rodrigo Turino");
		students.add("Catalina Calaon");
		students.add("Satar Kathori");
		students.add("Josh Checkes");
		students.add("Alex Stepped");
		
		
		System.out.println(students);
		
		for (String string : students) {
			System.out.println(string);
		}
		System.out.println(students.size());
		
		students.add("Satar Kathori");
		
		System.out.println(students.size());
	}
}