package edu.soft.com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalc {

	Calc calc = new Calc();
	
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}
//
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}

	@Test
	public void testAdd() {
//		fail("Not yet implemented");
		assertTrue(calc.add(2, 3) == 5);
	}

	@Test
	public void testDiv() {
//		fail("Not yet implemented");
		assertEquals(calc.div(9, 4), 2);
	}
	
	@Test(expected = Exception.class)
	public void testDivZero() {
		calc.div(9, 0);
	}

}
