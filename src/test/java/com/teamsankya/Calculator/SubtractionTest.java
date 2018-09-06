package com.teamsankya.Calculator;

import org.junit.Ignore;
import org.junit.Test;

import junit.framework.TestCase;

public class SubtractionTest {
	
	@Test
	public void sub1() {
		int sub = Subtraction.sub(20, 10);
		TestCase.assertEquals(10, sub);
	}

	@Ignore
	@Test
	public void sub2() {
		int sub = Subtraction.sub(200, 10);
		TestCase.assertEquals(10, sub);
	}
}
