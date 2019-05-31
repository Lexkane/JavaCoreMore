package edu.soft.com;
import static org.junit.Assert.*;
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
	
	@Test
	public void testDivZero() {
		assertEquals(calc.div(9, 2), 4);
	}
	
//	@Test
//	public void testAdd() {
//		assertTrue(calc.add(1, 5) == 6);
//	}
//
//	@Test
//	public void testDivPositive() {
//		int actual = 4;
//		int expected = calc.div(9, 2);
//		assertEquals(actual, expected);
//	}
//
//	@Test(expected = Exception.class)
//		public void testDivZero() {
//		int actual = calc.div(23, 0);
//	}

}
