package org.jfree.data.test;

import static org.junit.Assert.*;

import org.junit.*;
import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;

/**
 * 
 * @author Group 21 (Lauraine Baffot, Alexis Hamrak, Abhay Khosla, Rachel
 *         Renegado). Class in which is for testing the methods of the Range
 *         Class Using boundaries and edge cases to create the following test
 *         cases for each method.
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

	/**
	 * This test will simulate creating a 2D array of doubles and passing the object
	 * to a createNumberArray2D. The test asserts that the expected 5 row, 2 column
	 * array of positive doubles is created.
	 */
	@Test
	public void createNumberRegular2DArrayOfFive() {
		Number[][] expectedArray = { { 24.0, 12.0, 7.0, 4.0, 5.0 }, { 24.0, 12.0, 7.0, 4.0, 5.0 } };
		// creating the expected 2D array to be used in the assert
		double[][] arrayToPass = { { 24.0, 12.0, 7.0, 4.0, 5.0 }, { 24.0, 12.0, 7.0, 4.0, 5.0 } };
		// creating a 2D array of type double to pass to createNumberArray2D()
		Number[][] actualArray = DataUtilities.createNumberArray2D(arrayToPass);
		// calling the function to test
		assertArrayEquals("createNumberArray failed the correct array values are.", expectedArray, actualArray);
		// asserting the resulting Number array created matches the expected array
	}

	/**
	 * This test will simulate creating a 2D array of doubles and passing the object
	 * to a createNumberArray2D. The test asserts that the expected 2 row, 1 column
	 * array of positive doubles is created.
	 */
	@Test
	public void createNumberRegular2DArrayOfOne() {
		Number[][] expectedArray = { { 21.0 }, { 21.0 } };
		// creating the expected 2D array to be used in the assert
		double[][] arrayToPass = { { 21.0 }, { 21.0 } };
		// creating a 2D array of type double to pass to createNumberArray2D()
		Number[][] actualArray = DataUtilities.createNumberArray2D(arrayToPass);
		// calling the function to test
		assertArrayEquals("createNumberArray failed the correct array values are.", expectedArray, actualArray);
		// asserting the resulting Number array created matches the expected array
	}

	/**
	 * This test will simulate creating a 2D array of doubles and passing the object
	 * to a createNumberArray2D. The test asserts that the expected 2 row, 1 column
	 * array of negative doubles is created.
	 */
	@Test
	public void createNumberRegular2DArrayOfNegativeValues() {
		Number[][] expectedArray = { { -22.0 }, { -23.0 } };
		// creating the expected 2D array to be used in the assert
		double[][] arrayToPass = { { -22.0 }, { -23.0 } };
		// creating a 2D array of type double to pass to createNumberArray2D()
		Number[][] actualArray = DataUtilities.createNumberArray2D(arrayToPass);
		// calling the function to test
		assertArrayEquals("createNumberArray failed the correct array values are.", expectedArray, actualArray);
		// asserting the resulting Number array created matches the expected array
	}

	/**
	 * This test will simulate creating a 2D array of doubles and passing the object
	 * to a createNumberArray2D. The test asserts that the expected 2 row, 1 column
	 * array of positive large value doubles is created.
	 */
	@Test
	public void createNumberRegular2DArrayOfHugeValues() {
		Number[][] expectedArray = { { 555e8 }, { 556e8 } };
		// creating the expected 2D array to be used in the assert
		double[][] arrayToPass = { { 555e8 }, { 556e8 } };
		// creating a 2D array of type double to pass to createNumberArray2D()
		Number[][] actualArray = DataUtilities.createNumberArray2D(arrayToPass);
		// calling the function to test
		assertArrayEquals("createNumberArray failed the correct array values are.", expectedArray, actualArray);
		// asserting the resulting Number array created matches the expected array
	}

	/**
	 * This test will simulate creating a null double array and passing the object
	 * to a createNumberArray2D. The test asserts that the operation will throw an
	 * exception.
	 */
	@Test
	public void createNumber2DEmptyArray() {
		try {
			double[][] arrayToPass = null;
			// creating a null double 2D array
			DataUtilities.createNumberArray2D(arrayToPass);
			// passing the null object to the createNumberArray2D function
			fail("This method should throw an exception!");
			// creating a failure message for if createNumberArray2D does not throw an
			// exception
		} catch (Exception e) {
			assertEquals("The exception thrown type is IllegalArgumentException", IllegalArgumentException.class,
					e.getClass());
			// catching the exception, asserting that an IllegalArgumentException was thrown
		}
	}

	/**
	 * This test will simulate creating a 2D array of doubles and passing the object
	 * to a createNumberArray2D. The double array passed contains one row of 2
	 * positive double elements and one empty row. The test asserts that the
	 * expected 2 row array of doubles with one empty row is created.
	 */
	@Test
	public void createNumber2DEmptyArrayOne() {
		Number[][] expectedArray = { { 32.0, 33.0 }, {} };
		// creating the expected 2D array to be used in the assert
		double[][] arrayToPass = { { 32.0, 33.0 }, {} };
		// creating a 2D array of type double to pass to createNumberArray2D()
		Number[][] actualArray = DataUtilities.createNumberArray2D(arrayToPass);
		// calling the function to test
		assertArrayEquals("createNumberArray failed the correct array values are.", expectedArray, actualArray);
		// asserting the resulting Number array created matches the expected array
	}

	/**
	 * This test will simulate creating a 2D array of doubles and passing the object
	 * to a createNumberArray2D. The double array passed contains 2 empty rows. The
	 * test asserts that the expected 2D empty of doubles is created.
	 */
	@Test
	public void createNumber2DEmptyArrayEmpty() {
		Number[][] expectedArray = { {}, {} };
		// creating the expected empty 2D array to be used in the assert
		double[][] arrayToPass = { {}, {} };
		// creating a 2D array of type double to pass to createNumberArray2D()
		Number[][] actualArray = DataUtilities.createNumberArray2D(arrayToPass);
		// calling the function to test
		assertArrayEquals("createNumberArray failed and is not an empty 2D array { {}, {} }; .", expectedArray,
				actualArray);
		// asserting the resulting Number array created matches the expected array
	}

	// ------------- **** calculateRowTotal(Values2D data, int row) Tests*****
	/**
	 * This test will simulate creating an empty Values2D table. The empty table is
	 * passed to calculateRowTotal() with a row number of 0 and expects that the
	 * total of the values in the row equal to 0.
	 */
	@Test
	public void calculateRowTotalEmptyChart() {
		Mockery mockingContext = new Mockery();
		// creating a new mock object called mockingContext
		final Values2D values = mockingContext.mock(Values2D.class);
		// mock object (mockingContext) is stored in the local variable 'values'
		// 'values' is final so it can be referred to from within expectation blocks

		mockingContext.checking(new Expectations() {
			// a mock expectation block containing expectations of value
			{
				one(values).getColumnCount();
				// invocation of getColumnCount() is expected once
				will(returnValue(0));
				// will always returns 0 when getColumnCount() is called

				one(values).getRowCount();
				// invocation of getRowCount is expected once
				will(returnValue(0));
				// will always returns 0 when getRowCount is called
			}
		});
		int rowNumber = 0; // setting rowNumber to have an int value of 0
		double result = DataUtilities.calculateRowTotal(values, rowNumber);
		// calling calculateRowTotal with values and rowNumber
		assertEquals("The row total is adding up to 0", 0, result, .000000001d);
		// asserting the result adds up to 0
	}

	/**
	 * This test will simulate passing a null object to calculateRowTotal() with a
	 * row number of 0 and expects that an IllegalArgumentException is thrown.
	 */
	@Test
	public void calculateRowTotalNull() {
		try {
			DataUtilities.calculateRowTotal(null, 0);
			// calling calculateRowTotal() with a null object
			fail("This method should throw an exception!");
			// creating a failure message for if createNumberArray2D does not throw an
			// exception
		} catch (Exception e) {
			assertEquals("The exception thrown type is IllegalArgumentException", IllegalArgumentException.class,
					e.getClass());
			// catching the exception, asserting that an IllegalArgumentException was thrown
		}
	}

	/**
	 * This test will simulate creating a Values2D table with positive values. The
	 * table is passed to calculateRowTotal() with a row number of 1 and expects
	 * that the total of the values in the row is correct.
	 */
	@Test
	public void calculateRowTotalPositive() {
		Mockery mockingContext = new Mockery();
		// creating a new mock object called mockingContext
		final Values2D values = mockingContext.mock(Values2D.class);
		// mock object (mockingContext) is stored in the local variable 'values'
		// 'values' is final so it can be referred to from within expectation blocks

		mockingContext.checking(new Expectations() {
			// a mock expectation block containing expectations of value
			{
				one(values).getColumnCount();
				// invocation of getColumnCount() is expected once
				will(returnValue(4));
				// will always returns 4 when getColumnCount() is called

				one(values).getValue(1, 0);
				// invocation of getValue(1, 0) is expected once
				will(returnValue(1.0));
				// will always returns 1 when getValue(1, 0) is called

				one(values).getValue(1, 1);
				// invocation of getValue(1, 1) is expected once
				will(returnValue(2.0));
				// will always returns 2 when getValue(1, 1) is called

				one(values).getValue(1, 2);
				// invocation of getValue(1, 2) is expected once
				will(returnValue(3.0));
				// will always returns 3 when getValue(1, 2) is called

				one(values).getValue(1, 3);
				// invocation of getValue(1, 3) is expected once
				will(returnValue(4.0));
				// will always returns 4 when getValue(1, 3) is called
			}
		});
		int rowNumber = 1; // setting rowNumber to have an int value of 1
		double result = DataUtilities.calculateRowTotal(values, rowNumber);
		// calling calculateRowTotal with Values2D = values and at rowNumber 1
		assertEquals("The row total is adding up to 10", 10, result, .000000001d);
		// asserting the result adds up to 10 (1 + 2 + 3 + 4 = 10)
	}

	@Test
	public void calculateRowTotalNegative() {
		Mockery mockingContext = new Mockery();
		// creating a new mock object called mockingContext
		final Values2D values = mockingContext.mock(Values2D.class);
		// mock object (mockingContext) is stored in the local variable 'values'
		// 'values' is final so it can be referred to from within expectation blocks

		mockingContext.checking(new Expectations() {
			// a mock expectation block containing expectations of value
			{
				one(values).getColumnCount();
				// invocation of getColumnCount() is expected once
				will(returnValue(5));
				// will always returns 5 when getColumnCount() is called

				one(values).getValue(1, 0);
				// invocation of getValue(1, 0) is expected once
				will(returnValue(-1.0));
				// will always returns -1.0 when getValue(1, 0) is called

				one(values).getValue(1, 1);
				// invocation of getValue(1, 1) is expected once
				will(returnValue(-2.0));
				// will always returns -2.0 when getValue(1, 1) is called

				one(values).getValue(1, 2);
				// invocation of getValue(1, 2) is expected once
				will(returnValue(-3.0));
				// will always returns -3.0 when getValue(1, 2) is called

				one(values).getValue(1, 3);
				// invocation of getValue(1, 3) is expected once
				will(returnValue(-4.0));
				// will always returns -4.0 when getValue(1, 3) is called

				one(values).getValue(1, 4);
				// invocation of getValue(1, 4) is expected once
				will(returnValue(-5.0));
				// will always returns -5.0 when getValue(1, 4) is called
			}
		});
		int rowNumber = 1; // setting rowNumber to have an int value of 1
		double result = DataUtilities.calculateRowTotal(values, rowNumber);
		// calling calculateRowTotal with Values2D = values and at rowNumber 1
		assertEquals("The row total is adding up to -15", -15, result, .000000001d);
		// asserting the result adds up to 15
		// (-1) + (-2) + (-3) + (-4) + (-5) = (-15)
	}
	// ------------- createNumberArray(double[] data) Tests ----------------------
	/* Rachel codes and Abhay Reviews */

	/**
	 * This test will simulate creating a 1D array of doubles and passing the object
	 * to a createNumberArray. The double array passed contains 3 positive double
	 * elements. The test asserts that the expected positive 3 element array of
	 * doubles is created.
	 */
	@Test
	public void createNumberArrayPositiveDouble() {
		Number[] expectedArray = { 1.7, 2.2, 3.4 };
		// creating the expected 1D array to be used in the assert
		// creating a 1D array of type double to pass to createNumberArray()
		// calling the function to test
		// asserting the resulting Number array created matches the expected array
		double[] arrayToPass = { 1.7, 2.2, 3.4 };
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		assertArrayEquals("The expected array should contain double values of {1.7, 2.2, 3.4}", expectedArray,
				actualArray);
	}

	/**
	 * This test will simulate creating a 1D array of doubles and passing the object
	 * to a createNumberArray. The double array passed contains 3 negative double
	 * elements. The test asserts that the expected negative 3 element array of
	 * doubles is created.
	 */
	@Test
	public void createNumberArrayNegativeDouble() {
		Number[] expectedArray = { -1.7, -2.2, -3.4 };
		// creating the expected 1D array to be used in the assert
		// creating a 1D array of type double to pass to createNumberArray()
		// calling the function to test
		// asserting the resulting Number array created matches the expected array
		double[] arrayToPass = { -1.7, -2.2, -3.4 };
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		assertArrayEquals("The expected array should contain double values of {-1.7, -2.2, -3.4}", expectedArray,
				actualArray);
	}

	/**
	 * This test will simulate creating a null double array and passing the object
	 * to a createNumberArray. The test asserts that the operation will throw an
	 * exception.
	 */
	@Test
	public void createNumberArrayNull() {
		try {
			double[] arrayToPass = null;
			// creating a null double 1D array
			DataUtilities.createNumberArray(arrayToPass);
			// passing the null object to the createNumberArray2D function
			fail("This method should throw an exception!");
			// creating a failure message for if createNumberArray2D does not throw an
			// exception
		} catch (Exception e) {
			assertEquals("The exception thrown type is IllegalArgumentException", IllegalArgumentException.class,
					e.getClass());
			// catching the exception, asserting that an IllegalArgumentException was thrown
		}
	}

	/**
	 * This test will simulate creating a 1D array of doubles and passing the object
	 * to a createNumberArray. The double array passed contains one elements of the
	 * value 0.0. The test asserts that the expected single element array of 0.0 is
	 * created.
	 */
	@Test
	public void createNumberArrayZero() {
		Number[] expectedArray = { 0.0 };
		// creating the expected 0.0 1D array to be used in the assert
		double[] arrayToPass = { 0.0 };
		// creating an 0.0 1D array of type double to pass to createNumberArray()
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		// calling the function to test
		assertArrayEquals("The expected array should contain double values of {0.0}", expectedArray, actualArray);
		// asserting the resulting Number array created matches the expected array
	}

	/**
	 * This test will simulate creating a 1D array of doubles and passing the object
	 * to a createNumberArray. The double array passed is an empty array. The test
	 * asserts that the expected empty array of doubles is created.
	 */
	@Test
	public void createNumberArrayEmpty() {
		Number[] expectedArray = {};
		// creating the expected empty 1D array to be used in the assert
		double[] arrayToPass = {};
		// creating a 1D array of type double to pass to createNumberArray()
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		// calling the function to test
		assertArrayEquals("The expected array should contain double values of {}", expectedArray, actualArray);
		// asserting the resulting Number array created matches the expected array
	}

	/**
	 * This test will simulate creating a 1D array of doubles and passing the object
	 * to a createNumberArray. The double array passed is an array with a positive
	 * and negative element. The test asserts that the expected array matching the
	 * passed array is created of type Number.
	 */
	@Test
	public void createNumberArrayNegativePositive() {
		Number[] expectedArray = { 1.2, -1.2 };
		// creating the expected 1D array to be used in the assert
		double[] arrayToPass = { 1.2, -1.2 };
		// creating a 1D array of type double to pass to createNumberArray()
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		// calling the function to test
		assertArrayEquals("The expected array should contain double values of {1.2, -1.2};", expectedArray,
				actualArray);
		// asserting the resulting Number array created matches the expected array
	}

	/**
	 * This test will simulate creating a 1D array of doubles and passing the object
	 * to a createNumberArray. The double array passed is an array containing 4
	 * elements of the max double value. The test asserts that the expected array of
	 * max positive doubles is created.
	 */
	@Test
	public void createNumberArrayMaxDoubleFour() {
		Number[] expectedArray = { Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE };
		// creating the expected 1D array of max double values to be used in the assert
		double[] arrayToPass = { Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE };
		// creating a 1D array of type double to pass to createNumberArray()
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		// calling the function to test
		assertArrayEquals("The expected array should contain 4 elements of the max double value;", expectedArray,
				actualArray);
		// asserting the resulting Number array created matches the expected array
	}

	/**
	 * This test will simulate creating a 1D array of doubles and passing the object
	 * to a createNumberArray. The double array passed is an array containing 4
	 * elements of the minimum double value. The test asserts that the expected
	 * array of minimum negative doubles is created.
	 */
	@Test
	public void createNumberArrayMinDoubleFour() {
		Number[] expectedArray = { Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE };
		// creating the expected 1D array of minimum double values to be used in the
		// assert
		double[] arrayToPass = { Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE };
		// creating a 1D array of type double to pass to createNumberArray()
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		// calling the function to test
		assertArrayEquals("The expected array should contain 4 elements of the min double value;", expectedArray,
				actualArray);
		// asserting the resulting Number array created matches the expected array
	}
	// -----------------------------------------------------------------------------------------
	// End of code created by Abhay and Rachel
	// -----------------------------------------------------------------------------------------

	// -----------------------------------------------------------------------------------------
	// Code created by Alexis and Lauraine
	// -----------------------------------------------------------------------------------------
	/* Lauraine codes and Alexis reviews */
	
	// ------------- calculateColumnTotal(Values2D data, int column) Tests ---------------------
	@Test
	public void calculateColumnTotalEmptyChart() {
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);

		mockingContext.checking(new Expectations() {
			{
				one(values).getRowCount();
				will(returnValue(0));
			}
		});
		int columnumber = 0;
		double result = DataUtilities.calculateRowTotal(values, columnumber);
		assertEquals("The column total is adding up to 0", 0, result, .000000001d);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void calculateColumnTotalNull() {
		double result = DataUtilities.calculateRowTotal(null, 0);
		assertEquals("The exception thrown type is IllegalArgumentException", 0.0, result, .000000001d);
	}

	@Test(expected = IllegalArgumentException.class)
	public void calculateColumnTotalNegativeColumnNumber() {
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);

		mockingContext.checking(new Expectations() {
			{
				one(values).getRowCount();
				will(returnValue(2));

				one(values).getValue(0, -1);
				will(returnValue(5.0));

				one(values).getValue(1, -1);
				will(returnValue(10.0));
			}
		});
		int columnNumber = -1;
		double result = DataUtilities.calculateColumnTotal(values, columnNumber);
		assertEquals("The exception thrown type is IllegalArgumentException", 15.0, result, .000000001d);
	}

	@Test
	public void calculateColumnTotalPositive() {
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);

		mockingContext.checking(new Expectations() {
			{
				one(values).getRowCount();
				will(returnValue(3));

				one(values).getValue(0, 1);
				will(returnValue(1.0));

				one(values).getValue(1, 1);
				will(returnValue(2.0));

				one(values).getValue(2, 1);
				will(returnValue(3.0));
			}
		});
		int columnNumber = 1;
		double result = DataUtilities.calculateColumnTotal(values, columnNumber);
		assertEquals("The column total is adding up to 6", 6.0, result, .000000001d);
	}

	@Test
	public void calculateColumnTotalNegative() {
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);

		mockingContext.checking(new Expectations() {
			{
				one(values).getRowCount();
				will(returnValue(2));

				one(values).getValue(0, 1);
				will(returnValue(-4.8));

				one(values).getValue(1, 1);
				will(returnValue(-5.9));
			}
		});
		int columnNumber = 1;
		double result = DataUtilities.calculateRowTotal(values, columnNumber);
		assertEquals("The row total is adding up to -10.7", -10.7, result, .000000001d);
	}
	
	
	/* Alexis codes and Lauraine reviews */
	
	
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
