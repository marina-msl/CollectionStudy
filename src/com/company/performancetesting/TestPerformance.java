package com.company.performancetesting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestPerformance {

	public static void main(String[] args) {

		Collection<Integer> numbers = new ArrayList<>();

		long start = System.currentTimeMillis();

		for (int i = 0; i <= 5000; i++) {
			numbers.add(i);
		}

		for (Integer number : numbers) {
			numbers.contains(number);
		}

		long finish = System.currentTimeMillis();

		long executeTime = finish - start;

		System.out.println("Time spent running with Array: " + executeTime);

		Collection<Integer> numbersHashSet = new HashSet<>();
	
		long startHashSet = System.currentTimeMillis();
	
		for(int i = 0; i <= 1000000;i++) {
			numbersHashSet.add(i);
		}
	
		for(Integer number:numbers) {
			numbersHashSet.contains(number);
		}
	
		long finishHashSet = System.currentTimeMillis();
	
		long runningSpentTimeWithHashSet = finishHashSet - startHashSet;
		
		System.out.println("Time spent running with HashSet: " + runningSpentTimeWithHashSet);
	}	
}
