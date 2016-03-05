package solution400_500;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Test488 extends TestCase{
	public Solution_488 test;
	
	@Before
	public void setUp() {
		test = new Solution_488();
	}
	
	@Test
	public void test1 () {
		test = new Solution_488();
		boolean actual = test.isHappy(19);
		boolean expected = true;
		assertEquals (actual, expected);
	}
	
	@Test
	public void test2 () {
		test = new Solution_488();
		boolean actual = test.isHappy(Integer.MIN_VALUE);
		boolean expected = false;
		assertEquals (actual, expected);
	}
	
	@Test
	public void test3 () {
		test = new Solution_488();
		boolean actual = test.isHappy(Integer.MAX_VALUE);
		boolean expected = false;
		assertEquals (actual, expected);
	}
	
	@Test
	public void test4 () {
		test = new Solution_488();
		boolean actual = test.isHappy(0);
		boolean expected = false;
		assertEquals (actual, expected);
	}
	
	@After
	public void tearDown () {
		test = null;
	}
}
