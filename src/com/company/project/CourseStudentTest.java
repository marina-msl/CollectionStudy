package com.company.project;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CourseStudentTest {

	public static void main(String[] args) {
		
		Course course = new Course("Software Engineering", "Philip Chan");
		
		course.add(new Subject("Market Inteligence", 15));
		course.add(new Subject("Principle of comunication", 42));
		course.add(new Subject("Business Environment", 27));
		

		Student studentOne = new Student("Carola Catalina", 3473);
		Student studentTwo = new Student("Markon Stwep", 8323);
		
		Collection<Student> students = new HashSet<>();
		students.add(studentOne);
		students.add(studentTwo);
		
		//course.registerStudent(studentOne);
		course.registerStudent(studentTwo);
		
		
		
		System.out.println(course + " " + course.getStudents());
		
		System.out.println(students);
		
		//System.out.println("All students registrations: " + course.getStudents());
		System.out.println("========||========");
//		System.out.println("All students registrations: ");
//		course.getStudents().forEach(student -> {
//			System.out.println(student);
//		});
		
		
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student nextStudent = iterator.next();
			System.out.println(nextStudent);
		}
		
		//course.getStudents().add(studentTwo);
		
		System.out.println(course.studentIsRegistered(studentOne));
		
		Student carola = new Student("Carola Catalina", 3473);
		//Student carola = new Student(null, 3473);
		
		System.out.println("Student One: " + studentOne);
		System.out.println(studentOne.equals(carola));
		System.out.println(studentOne.equals(carola));
		
		System.out.println(studentOne.hashCode() == carola.hashCode());
		
		System.out.println(studentOne);
		System.out.println(carola);
		
	}
}
