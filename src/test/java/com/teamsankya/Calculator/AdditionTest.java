package com.teamsankya.Calculator;

import org.junit.After;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/*import junit.framework.TestCase;*/
import static junit.framework.TestCase.assertEquals;


@RunWith(Parameterized.class)
public class AdditionTest {

	int a, b, expected;

	public AdditionTest(int a, int b, int expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	/*@Test
	public void add1() {
		int sum = Addition.add(a, b);
		TestCase.assertEquals(expected, sum);
	}*/
	  @Test 
	  public void add2() {
		  int sum=Addition.add(100, 100);
	 assertEquals(200, sum);
	  }
	  /* 
	  @Test
	  public void add4() {
		  int sum=Addition.add(-1, -1);
	  TestCase.assertEquals(-2, sum);
	  }
	  */
	/*  @Test 
	  public void add5() { 
		  int sum=Addition.add(50, 50);
	  TestCase.assertEquals(100, sum);
	  }*/
	
	
	
	@Before
	public void execeuteBefore() {
		System.out.println("before test case");
	}
	

	@After
	public void execeuteAfter() {
		System.out.println("After test case");
	}
	
	@BeforeClass
	public static void execeuteBeforeClass() {
		System.out.println("before test class");
	}
	

	@AfterClass
	public static void execeuteAfterClass() {
		System.out.println("After test class");
	}
	
	
	
	@Parameters
	public static int[][] testParameters(){
		int arr[][]= {{0,0,0},
				{-1,-1,-2},
				{99,99,198},
				{100,100,200},
				{101,101,202}};
		return arr;	
	}
	
	
}
