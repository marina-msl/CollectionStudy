package com.company;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;

public class TestingLists {

	
	public static void main(String[] args) {
		String classOne = "Lists class";
		String classTwo = "Modeling the classes";
		String classThree = "Working with courses and Sets";
		
		ArrayList<String> classes = new ArrayList<>();
		classes.add(classOne);
		classes.add(classTwo);
		classes.add(classThree);
		
		System.out.println(classes);
		classes.remove(classOne);
		
		System.out.println(classes);
		
		for(String listClass : classes) {
			StringBuffer sb = new StringBuffer();
			sb.append("Aula: ");
			sb.append(listClass);
			System.out.println(sb.toString());
		}
		
		classes.forEach(classList -> {
			System.out.println("running: ");
			System.out.println(classList);});
		
		String firstClass = classes.get(0);
		System.out.println("The first class is " + firstClass);
		
		for (int i = 0 ; i < classes.size(); i ++) {
			System.out.println("The class number " + (i + 1) + ": " + classes.get(i));
		}
		
		classes.add("Calc number II");
		//Collections.sort(classes);
		classes.forEach(classList -> {System.out.println(classList);});
		
	}
}
