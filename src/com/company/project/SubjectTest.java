package com.company.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SubjectTest {
	
	public static void main(String[] args) {
		
//		Subject c1 = new Subject("ArrayList", 21, "Mark");
//		Subject c2 = new Subject("Reference of Lists", 35, "Inderpal");
//		Subject c3 = new Subject("Objects Lists", 15, "Philip Chan");
		
		Subject c1 = new Subject("ArrayList", 21);
		Subject c2 = new Subject("Reference of Lists", 35);
		Subject c3 = new Subject("Objects Lists", 15);
		
		ArrayList<Subject> courseList = new ArrayList<>();
		
		courseList.add(c1);
		courseList.add(c2);
		courseList.add(c3);
		
		System.out.println(courseList);
		
		Collections.sort(courseList);
		
		System.out.println(courseList);
		
		//Collections.sort(courseList, Comparator.comparing(Course::getLast));
		courseList.sort(Comparator.comparing(Subject::getLast));
		System.out.println(courseList);
		
//		courseList.sort(Comparator.comparing(Subject::getName));
//		System.out.println(courseList);
		
	}

}
