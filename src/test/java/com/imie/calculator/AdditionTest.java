/**
 * 
 */
package com.imie.calculator;

import static org.junit.Assert.*;
import org.junit.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author BenBen
 *
 */
public class AdditionTest {

	private Addition add;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.imie.calculator.Addition#Addition(int)}.
	 */
	@Test
	public void testAddition() {
		Assert.assertNotNull(add);
		
		Addition add = new Addition(1);
		Assert.assertEquals(1, add.value);
	}

	/**
	 * Test method for {@link com.imie.calculator.Addition#make(int)}.
	 */
	@Test
	public void testMake() {
		Addition add = new Addition(1);
		Assert.assertNotNull(add);
		
		add.make(2);
		Assert.assertEquals(3, add.value);
	}

	/**
	 * Test method for {@link com.imie.calculator.Addition#getValue()}.
	 */
	@Test
	public void testGetValue() {
		Assert.assertNotNull(add);
		
		Addition add = new Addition(1);
		Assert.assertEquals(1, add.getValue());
	}

}
