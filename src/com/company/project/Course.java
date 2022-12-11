package com.company.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Course {

	private String name;
	private String professor;
	private List<Subject> subjects = new ArrayList<>();
	private Set<Student> students = new HashSet<>();
	
	public Course(String name, String professor) {
		this.name = name;
		this.professor = professor;
	}

	public String getName() {
		return name;
	}

	public String getProfessor() {
		return professor;
	}

	public List<Subject> getSubjects() {
		return Collections.unmodifiableList(subjects);
	}

	@Override
	public String toString() {
		return "Courses [name=" + name + ", professor=" + professor + ", subjects=" + subjects + 
				", Students= " + students + " ]";
	}
	
	public void add(Subject subject) {
		subjects.add(subject);
	}
	
	public List<Subject> sortOfSubjectsName() {
		 Collections.sort(subjects);
		 return subjects;
	}
	
	public List<Subject> sortOfSubjectsLast() {
		subjects.sort(Comparator.comparing(Subject :: getLast));
		return subjects;
	}
	
	public int getTotalLast() {
		int totalTime = 0;
			for (Subject subject : subjects) {
				totalTime += subject.getLast();
			}
			return totalTime;
	}

	public void registerStudent(Student student) {
		students.add(student);
	}

	public Set<Student> getStudents() {
		return Collections.unmodifiableSet(this.students);
	}

	public boolean studentIsRegistered(Student studentOne) {
		return this.students.contains(studentOne);
	}
}
