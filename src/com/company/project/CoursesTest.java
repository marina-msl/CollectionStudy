package com.company.project;

import java.util.List;

public class CoursesTest {

	public static void main(String[] args) {
		
		Course course = new Course("Business Administration","Sagar Kothari");
		
		List<Subject> subjectList = course.getSubjects();
		
		System.out.println(subjectList);
		
		
		//course.getSubjects().add(new Subject("Collections: Set and Maps", 34));
		//subjectList.add(new Subject("Principles of Comunication", 37));
		
		System.out.println(subjectList);
		
		//course.getSubjects().add(new Subject("Business Environment", 12));
		//course.getSubjects().add(new Subject("Financial Market", 25));
		
		System.out.println(course.getSubjects());
		
		course.add(new Subject("Machine Learning II", 26));
		
		System.out.println(subjectList);
		
	}
}
