package com.company.project;

public class Subject implements Comparable<Subject> {
	
	private String name;
	private int last;
	//private String professor;
	
	public Subject(String name, int last) {
		this.name = name;
		this.last = last;
	}
	

//	public Subject(String name, int last, String professor) {
//		this.name = name;
//		this.last = last;
//		this.professor = professor;
//	}

	public String getName() {
		return name;
	}

	public int getLast() {
		return last;
	}

	@Override
	public String toString() {
		//return "[Course=" + this.name + ", " + this.last + ", " + this.professor + "]";
		return "[Course=" + this.name + ", " + this.last + "]";
	}

	@Override
	public int compareTo(Subject otherCourse) {
		//return this.professor.compareTo(otherCourse.professor);
		return this.name.compareTo(otherCourse.name);
	}
	
}
