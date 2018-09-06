package com.teamsankya.Calculator;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		Result rs=JUnitCore.runClasses(AdditionTest.class);
		
		List<Failure> failures=rs.getFailures();
		
		for (Failure failure	 : failures) {
			System.out.println(failure.getMessage());
		}
		
		System.out.println(rs.wasSuccessful());
		
	}
}
