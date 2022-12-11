package com.company.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CoursesTest2 {

	public static void main(String[] args) {
		
		Course courses = new Course("Business Administration", "Sagar Kathori");
		
		courses.add(new Subject("Market Inteligence", 15));
		courses.add(new Subject("Principle of comunication", 42));
		courses.add(new Subject("Business Environment", 27));
		
		System.out.println(courses.getSubjects());
		
		//It won't work!
		//Collections.sort(courses.getSubjects());
		
		// -> the library can do it for you!
		//System.out.println(courses.sortOfSubjectsName());
		//System.out.println(courses.sortOfSubjectsLast());
		
		List<Subject> listOfSubjectImmutable = courses.getSubjects();
		
		List<Subject> listOfSubject = new ArrayList<>(listOfSubjectImmutable);
		
		Collections.sort(listOfSubject);
		
		System.out.println(listOfSubject);
		
		listOfSubject.sort(Comparator.comparing(Subject :: getLast));
		
		System.out.println(listOfSubject);
		System.out.println(listOfSubjectImmutable);
	}
}
