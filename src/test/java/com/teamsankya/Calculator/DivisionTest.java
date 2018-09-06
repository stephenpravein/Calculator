package com.teamsankya.Calculator;

import org.junit.Ignore;
import org.junit.Test;

import junit.framework.TestCase;

public class DivisionTest {
	
	@Ignore
	@Test
	public void div1() {
		int div=Division.division(25, 5);
		TestCase.assertEquals(5, div);
	}
}
