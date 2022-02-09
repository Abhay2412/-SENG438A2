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
	public void createNumber2DNullArray() {
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
	
	/**
	 * This test will simulate creating a Values2D table with negative values. The
	 * table is passed to calculateRowTotal() with a row number of 1 and expects
	 * that the total of the values in the row is correct.
	 */
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
	
	/* Rachel codes and Abhay Reviews */
	
	/**
	 * This test will simulate creating a Values2D table with a negative index.
	 * Expectation is that an exception should be thrown.
	 */
	@Test
	public void calculateRowTotalNegativeIndex() {
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
				will(returnValue(2));
				// will always returns 5 when getColumnCount() is called

				one(values).getValue(-1, 0);
				// invocation of getValue(1, 0) is expected once
				will(returnValue(-1.0));
				// will always returns -1.0 when getValue(1, 0) is called

				one(values).getValue(-1, 1);
				// invocation of getValue(1, 1) is expected once
				will(returnValue(-2.0));
				// will always returns -2.0 when getValue(1, 1) is called
			}
		});
		
		int rowNumber = -1; // setting rowNumber to have an int value of -1
		try {
			DataUtilities.calculateRowTotal(values, rowNumber);
			// calling calculateRowTotal with Values2D = values and at rowNumber -1
			fail("This method should throw an exception!");
			// creating a failure message for if an exception is not thrown
		} catch (Exception e) {
			assertEquals("The exception thrown type is IllegalArgumentException", IllegalArgumentException.class,
					e.getClass());
			// catching the exception, asserting that an IllegalArgumentException was thrown
		}
	}
	
	// ------------- createNumberArray(double[] data) Tests ----------------------

	/**
	 * This test will simulate creating a 1D array of doubles and passing the object
	 * to a createNumberArray. The double array passed contains 3 positive double
	 * elements. The test asserts that the expected positive 3 element array of
	 * doubles is created.
	 */
	@Test
	public void createNumberArrayPositiveDouble() {
		Number[] expectedArray = { 1.7, 2.2, 3.4 };
		// creating the expected 1D array with positive values to be used in the assert
		double[] arrayToPass = { 1.7, 2.2, 3.4 };
		// creating a 1D array of type double to pass to createNumberArray()
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		// calling the function to test
		assertArrayEquals("The expected array should contain double values of {1.7, 2.2, 3.4}", expectedArray,
				actualArray);
		// asserting the resulting Number array created matches the expected array
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
		// creating the expected 1D array with negative values to be used in the assert
		double[] arrayToPass = { -1.7, -2.2, -3.4 };
		// creating a 1D array of type double to pass to createNumberArray()
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		// calling the function to test
		assertArrayEquals("The expected array should contain double values of {-1.7, -2.2, -3.4}", expectedArray,
				actualArray);
		// asserting the resulting Number array created matches the expected array
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
	
	/**
	 * This test will simulate creating an empty Values2D table. The empty table is
	 * passed to calculateColumnTotal() with a column number of 0 and expects that
	 * the total of the values in the row equal to 0.
	 */
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
		double result = DataUtilities.calculateColumnTotal(values, columnumber);
		assertEquals("The column total is adding up to 0", 0, result, .000000001d);
	}

	/**
	 * This test will simulate passing a null object to calculateColumnTotal() with
	 * a column number of 0 and expects that an IllegalArgumentException is thrown.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void calculateColumnTotalNull() {
		double result = DataUtilities.calculateColumnTotal(null, 0);
		assertEquals("The exception thrown type is IllegalArgumentException", 0.0, result, .000000001d);
	}

	/**
	 * This test will simulate passing a negative number for the column. The
	 * negative number is passed to calculateColumnTotalNegativeColumnNumber() with
	 * a Values2D table and expects that an IllegalArgumentException is thrown.
	 */
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
		assertEquals("The columnNumber is zero-based (no negatives).", 0.0, result, .000000001d);
	}

	/**
	 * This test will simulate creating a Values2D table with positive values. The
	 * table is passed to calculateColumnTotal() with a column number of 1 and
	 * expects that the total of the values in the column is correct.
	 */
	@Test
	public void calculateColumnTotalPositive() {
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);

		mockingContext.checking(new Expectations() {
			{
				one(values).getRowCount();
				will(returnValue(3));

				one(values).getValue(0, 1);
				will(returnValue(0.1));

				one(values).getValue(1, 1);
				will(returnValue(0.23));

				one(values).getValue(2, 1);
				will(returnValue(0.009));
			}
		});
		int columnNumber = 1;
		double result = DataUtilities.calculateColumnTotal(values, columnNumber);
		assertEquals("The column total is adding up to 0.339", 0.339, result, .000000001d);
	}

	/**
	 * This test will simulate creating a Values2D table with negative values. The
	 * table is passed to calculateColumnTotal() with a column number of 1 and
	 * expects that the total of the values in the column is correct.
	 */
	@Test
	public void calculateColumnTotalNegative() {
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);

		mockingContext.checking(new Expectations() {
			{
				one(values).getRowCount();
				will(returnValue(2));

				one(values).getValue(0, 1);
				will(returnValue(-45.8));

				one(values).getValue(1, 1);
				will(returnValue(-5569.9));
			}
		});
		int columnNumber = 1;
		double result = DataUtilities.calculateColumnTotal(values, columnNumber);
		assertEquals("The row total is adding up to -5615.7", -5615.7, result, .000000001d);
	}
	
	
	
	
	/* Alexis codes and Lauraine reviews */
	// ------------- equal(double[][] a, double[][] b) Tests ---------------------
	
	/**
	 * This test will check the equals() function to see if two equal (and same length) double 2D arrays can be passed in as arguments
	 * and are found to be equal.
	 */
	@Test
	public void testEqualityOfEqualArrays_SameLength() {
		double[][] array1 = {{4, -19.23, 20, 4, 17.2233, 10, 8, 6.00, 30, 1.11}, {4.1, -19, 20.44, 4, 17.1234, 10, 8.77, 6, 30, 1}};
		double[][] equalArray = {{4, -19.23, 20, 4, 17.2233, 10, 8, 6.00, 30, 1.11}, {4.1, -19, 20.44, 4, 17.1234, 10, 8.77, 6, 30, 1}};
		
		boolean equality = DataUtilities.equal(array1, equalArray);
		
		assertEquals("The equality should be true", true, equality);
	}
	
	/**
	 * This test will check the equals() function to see if two different (but same length) double 2D arrays can be passed in as arguments
	 * and are found not equal.
	 */
	@Test
	public void testEqualityOfUnequalArrays_SameLength() {
		//set up two equal length unequal valued arrays
		double[][] array1 = {{4, -19, 20.4, 2.22, 17.2, 10, 8.7, 6.999, 30, 1.21}, {100.22, -66.2, 20.33, 4, 17, 10.01, 8, 17, 9.4, 2039.22}};
		double[][] array2 = {{1.0, -15, -11, 4.88, -17, 10, 8.66, 6, -78.22, 1}, {4.88, -19.4, 16, 17, -9.44, 10, 10.00, 6.4, 30, 1.6524}};
		
		boolean equality = DataUtilities.equal(array1, array2);
		
		assertEquals("The equality should be false", false, equality);
	}
	
	/**
	 * This test will check the equals() function to see if two different length double 2D arrays can be passed in as arguments
	 * and are found to be not equal.
	 */
	@Test
	public void testEqualityOfArrays_DifferentLength() {
		//set up 2 arrays of different length
		double[][] array1 = {{4, -19.23, 20, 4, 17.2233, 10, 8, 6.00, 30, 1.11}, {4.1, -19, 20.44, 4, 17.1234, 10, 8.77, 6, 30, 1}};
		double[][] array2 = {{4, -19.23, 20, 4, 17.2233, 10, 8, 6.00, 30, 1.11}, {4.1, -19, 20.44, 4, 17.1234}};
		
		boolean equality = DataUtilities.equal(array1, array2);
		
		assertEquals("The equality should be true", false, equality);
	}
	
	/**
	 * This test will check the equals() function to see if a null and double array can be passed in as arguments
	 * and are found to be not equal.
	 */
	@Test
	public void testEqualityOfFirstNullArray() {
		//set up first array as null, second with values
		double[][] array1 = null;
		double[][] array2 = {{55, -1, 0, 23, 777}, {1000, -63, 620}};
		
		boolean equality = DataUtilities.equal(array1, array2); //check if arrays are equal
		
		assertEquals("The equality should be false", false, equality);
	}
	
	/**
	 * This test will check the equals() function to see if a null and double array can be passed in as arguments
	 * and are found to be not equal.
	 */
	@Test
	public void testEqualityOfSecondNullArray() {
		//set up second array as null, first with values
		double[][] array2 = null;
		double[][] array1 = {{55, -1, 0, 23, 777}, {1000, -63, 620}};
		
		boolean equality = DataUtilities.equal(array1, array2); //check if arrays are equal
		
		assertEquals("The equality should be false", false, equality);
	}
	
	/**
	 * This test will check the equals() function to see if two null arrays can be passed in as arguments
	 * and are found to be equal.
	 */
	@Test
	public void testEqualityOfTwoNullArrays() {
		//set up two null arrays
		double[][] array1 = null;
		double[][] array2 = null;
		
		boolean equality = DataUtilities.equal(array1, array2); //check if arrays are equal
		
		assertEquals("The equality should be true", true, equality);
	}
	
	
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
