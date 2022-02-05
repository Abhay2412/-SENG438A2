package org.jfree.data.test;

import static org.junit.Assert.*;

import org.junit.*;
import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;

/**
 * 
 * @author Group 21 Class in which is for testing the methods of the
 *         DataUtilities class Using boundaries and edge cases to create the
 *         following test cases for each method.
 *
 */
public class DataUtilitiesTest {

	// -----------------------------------------------------------------------------------------
	// The following code was taken from the SENG438 Lab Document
	// -----------------------------------------------------------------------------------------
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// This calls the setUpBefore even the class exists and does nothing.
	}

	@Before
	public void setUp() throws Exception {
		// Before each test case nothing is ready
	}

	// -----------------------------------------------------------------------------------------
	// End of Lab Document Code
	// -----------------------------------------------------------------------------------------

	// -----------------------------------------------------------------------------------------
	// CODE CREATED BY ABHAY AND RACHEL
	// -----------------------------------------------------------------------------------------
	/* Abhay codes and Rachel Reviews */

	// ------------- createNumberArray2D(double[][] data) Tests -----------
	@Test
	public void createNumberRegular2DArrayOfFive() {
		Number[][] expectedArray = { { 24.0, 12.0, 7.0, 4.0, 5.0 }, { 24.0, 12.0, 7.0, 4.0, 5.0 } };
		double[][] arrayToPass = { { 24.0, 12.0, 7.0, 4.0, 5.0 }, { 24.0, 12.0, 7.0, 4.0, 5.0 } };
		Number[][] actualArray = DataUtilities.createNumberArray2D(arrayToPass);
		assertArrayEquals("createNumberArray failed the correct array values are.", expectedArray, actualArray);
	}

	@Test
	public void createNumberRegular2DArrayOfOne() {
		Number[][] expectedArray = { { 21.0 }, { 21.0 } };
		double[][] arrayToPass = { { 21.0 }, { 21.0 } };
		Number[][] actualArray = DataUtilities.createNumberArray2D(arrayToPass);
		assertArrayEquals("createNumberArray failed the correct array values are.", expectedArray, actualArray);
	}

	@Test
	public void createNumberRegular2DArrayOfNegativeValues() {
		Number[][] expectedArray = { { -22.0 }, { -23.0 } };
		double[][] arrayToPass = { { -22.0 }, { -23.0 } };
		Number[][] actualArray = DataUtilities.createNumberArray2D(arrayToPass);
		assertArrayEquals("createNumberArray failed the correct array values are.", expectedArray, actualArray);
	}

	@Test
	public void createNumberRegular2DArrayOfHugeValues() {
		Number[][] expectedArray = { { 555e8 }, { 556e8 } };
		double[][] arrayToPass = { { 555e8 }, { 556e8 } };
		Number[][] actualArray = DataUtilities.createNumberArray2D(arrayToPass);
		assertArrayEquals("createNumberArray failed the correct array values are.", expectedArray, actualArray);
	}

	@Test
	public void createNumber2DEmptyArray() {

		try {
			double[][] arrayToPass = null;
			DataUtilities.createNumberArray2D(arrayToPass);
			fail("This method should throw an exception!");
		} catch (Exception e) {
			assertEquals("The exception thrown type is IllegalArgumentException", IllegalArgumentException.class,
					e.getClass());
		}
	}

	@Test
	public void createNumber2DEmptyArrayOne() {
		Number[][] expectedArray = { { 32.0, 33.0 }, {} };
		double[][] arrayToPass = { { 32.0, 33.0 }, {} };
		Number[][] actualArray = DataUtilities.createNumberArray2D(arrayToPass);
		assertArrayEquals("createNumberArray failed the correct array values are.", expectedArray, actualArray);
	}

	@Test
	public void createNumber2DEmptyArrayEmpty() {
		Number[][] expectedArray = { {}, {} };
		double[][] arrayToPass = { {}, {} };
		Number[][] actualArray = DataUtilities.createNumberArray2D(arrayToPass);
		assertArrayEquals("createNumberArray failed and is not an empty 2D array { {}, {} }; .", expectedArray,
				actualArray);
	}

	/* Rachel codes and Abhay Reviews */

	// ------------- createNumberArray(double[] data) Tests ----------------------
	@Test
	public void createNumberArrayPositiveDouble() {
		Number[] expectedArray = { 1.7, 2.2, 3.4 };
		double[] arrayToPass = { 1.7, 2.2, 3.4 };
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		assertArrayEquals("The expected array should contain double values of {1.7, 2.2, 3.4}", expectedArray,
				actualArray);
	}

	@Test
	public void createNumberArrayNegativeDouble() {
		Number[] expectedArray = { -1.7, -2.2, -3.4 };
		double[] arrayToPass = { -1.7, -2.2, -3.4 };
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		assertArrayEquals("The expected array should contain double values of {-1.7, -2.2, -3.4}", expectedArray,
				actualArray);
	}

	@Test
	public void createNumberArrayNull() {
		try {
			double[] arrayToPass = null;
			DataUtilities.createNumberArray(arrayToPass);
			fail("This method should throw an exception!");
		} catch (Exception e) {
			assertEquals("The exception thrown type is IllegalArgumentException", IllegalArgumentException.class,
					e.getClass());
		}
	}

	@Test
	public void createNumberArrayZero() {
		Number[] expectedArray = { 0.0 };
		double[] arrayToPass = { 0.0 };
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		assertArrayEquals("The expected array should contain double values of {0.0}", expectedArray, actualArray);
	}

	@Test
	public void createNumberArrayEmpty() {
		Number[] expectedArray = {};
		double[] arrayToPass = {};
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		assertArrayEquals("The expected array should contain double values of {}", expectedArray, actualArray);
	}

	@Test
	public void createNumberArrayNegativePositive() {
		Number[] expectedArray = { 1.2, -1.2 };
		double[] arrayToPass = { 1.2, -1.2 };
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		assertArrayEquals("The expected array should contain double values of {1.2, -1.2};", expectedArray,
				actualArray);
	}
	
	@Test
	public void createNumberArrayMaxDoubleFour() {
		Number[] expectedArray = {Double.MAX_VALUE,Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE};
		double[] arrayToPass = {Double.MAX_VALUE,Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE};
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		assertArrayEquals("The expected array should contain 4 elements of the max double value;", expectedArray,
				actualArray);
	}
	
	@Test
	public void createNumberArrayMaxDoubleOne() {
		Number[] expectedArray = {Double.MAX_VALUE};
		double[] arrayToPass = {Double.MAX_VALUE};
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		assertArrayEquals("The expected array should contain 1 element of the max double value;", expectedArray,
				actualArray);
	}
	
	@Test
	public void createNumberArrayMinDoubleFour() {
		Number[] expectedArray = {Double.MIN_VALUE,Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE};
		double[] arrayToPass = {Double.MIN_VALUE,Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE};
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		assertArrayEquals("The expected array should contain 4 elements of the min double value;", expectedArray,
				actualArray);
	}
	
	@Test
	public void createNumberArrayMinDoubleOne() {
		Number[] expectedArray = {Double.MIN_VALUE};
		double[] arrayToPass = {Double.MIN_VALUE};
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		assertArrayEquals("The expected array should contain 1 element of the min double value;", expectedArray,
				actualArray);
	}
	
	

	// ------------- **** calculateRowTotal(Values2D data, int row) Tests*****
	@Test
	public void calculateRowTotalEmptyChart() {
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);

		mockingContext.checking(new Expectations() {
			{
				one(values).getColumnCount();
				will(returnValue(0));
			}
		});
		int rowNumber = 0;
		double result = DataUtilities.calculateRowTotal(values, rowNumber);
		assertEquals("The row total is adding up to 0", 0, result, .000000001d);
	}

	@Test
	public void calculateRowTotalNull() {
		try {
			DataUtilities.calculateRowTotal(null, 0);
			fail("This method should throw an exception!");
		} catch (Exception e) {
			assertEquals("The exception thrown type is IllegalArgumentException", IllegalArgumentException.class,
					e.getClass());
		}
	}

	@Test
	public void calculateRowTotalPositive() {
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);

		mockingContext.checking(new Expectations() {
			{
				one(values).getColumnCount();
				will(returnValue(4));

				one(values).getValue(1, 0);
				will(returnValue(1.0));

				one(values).getValue(1, 1);
				will(returnValue(2.0));

				one(values).getValue(1, 2);
				will(returnValue(3.0));

				one(values).getValue(1, 3);
				will(returnValue(4.0));
			}
		});
		int rowNumber = 1;
		double result = DataUtilities.calculateRowTotal(values, rowNumber);
		assertEquals("The row total is adding up to 10", 10, result, .000000001d);
	}

	@Test
	public void calculateRowTotalNegative() {
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);

		mockingContext.checking(new Expectations() {
			{
				one(values).getColumnCount();
				will(returnValue(5));

				one(values).getValue(1, 0);
				will(returnValue(-1.0));

				one(values).getValue(1, 1);
				will(returnValue(-2.0));

				one(values).getValue(1, 2);
				will(returnValue(-3.0));

				one(values).getValue(1, 3);
				will(returnValue(-4.0));

				one(values).getValue(1, 4);
				will(returnValue(-5.0));
			}
		});
		int rowNumber = 1;
		double result = DataUtilities.calculateRowTotal(values, rowNumber);
		assertEquals("The row total is adding up to -15", -15, result, .000000001d);
	}
	// -----------------------------------------------------------------------------------------
	// End of code created by Abhday and Rachel
	// -----------------------------------------------------------------------------------------

	// -----------------------------------------------------------------------------------------
	// Code created by Alexis and Lauraine
	// -----------------------------------------------------------------------------------------

	// -----------------------------------------------------------------------------------------
	// End of code created by Alexis and Lauraine
	// -----------------------------------------------------------------------------------------

	// -----------------------------------------------------------------------------------------
	// The following code was taken from the SENG438 Lab Document
	// -----------------------------------------------------------------------------------------
	@After
	public void tearDown() throws Exception {
		// Tear down function for after running the tests it does nothing.
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// Do nothing once the class is over running the cases in the SUT
	}
	// -----------------------------------------------------------------------------------------
	// End of Lab Document Code
	// -----------------------------------------------------------------------------------------
}
