package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	
	public static MyInteger n;
	public static MyInteger n2;
	public static MyInteger n3;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		n = new MyInteger(7);
		n2 = new MyInteger(8);
		n3 = new MyInteger(7);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertFalse(n.isEven());
		assertTrue(n2.isEven());
	}
	@Test
	public void test2()
	{
		assertFalse(n2.isOdd());
		assertTrue(n.isOdd());
	}
	@Test
	public void test3()
	{
		assertFalse(n2.isPrime());
		assertTrue(n.isPrime());
	}
	@Test
	public void test4()
	{
		assertFalse(MyInteger.isEven(5));
		assertTrue(MyInteger.isEven(6));
	}
	@Test
	public void test5()
	{
		assertFalse(MyInteger.isOdd(4));
		assertTrue(MyInteger.isOdd(3));
	}
	@Test
	public void test6()
	{
		assertFalse(MyInteger.isPrime(8));
		assertTrue(MyInteger.isPrime(7));
	}
	@Test
	public void test7()
	{
		assertFalse(MyInteger.isPrime(n2));
		assertTrue(MyInteger.isPrime(n));
	}
	@Test
	public void test8()
	{
		assertFalse(MyInteger.isEven(n));
		assertTrue(MyInteger.isEven(n2));
	}
	@Test
	public void test9()
	{
		assertFalse(MyInteger.isOdd(n2));
		assertTrue(MyInteger.isOdd(n));
	}
	@Test
	public void test10()
	{
		assertFalse(n.equals(2));
		assertTrue(n.equals(7));
	}
	@Test
	public void test11()
	{
		assertFalse(n2.equals(n3));
		assertTrue(n.equals(n3));
	}

}
