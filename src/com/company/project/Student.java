package com.company.project;

import java.util.Objects;

public class Student {
	
	private String name;
	private int registration;

	public Student(String name, int registration) {
		if(name == null) {
			throw new NullPointerException ("Student's name cannot be null");
		}
		this.name = name;
		this.registration = registration;
	}
	
	public String getName() {
		return name;
	}
	public int getRegistration() {
		return registration;
	}
	
	@Override
	public String toString() {
		return "[Student: " + name + ", registration: " + registration + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, registration);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && registration == other.registration;
	}

//	@Override
//	public int hashCode() {
//		return this.name.hashCode();
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		Student other = (Student) obj;
//		return this.name.equals(other.name);
//	}
	
	
}
