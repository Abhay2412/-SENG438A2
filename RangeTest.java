package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.*;

/**
 * 
 * @author Group 21 (Lauraine Baffot, Alexis Hamrak, Abhay Khosla, Rachel
 *         Renegado). Class in which is for testing the methods of the Range
 *         Class Using boundaries and edge cases to create the following test
 *         cases for each method.
 *
 */
public class RangeTest {
	private Range exampleRange; // The example range which was given to us
	private Range testRange1; // Created this range to test other functionalities of the test range.
	private Range testExpandRange; // This is the expanded range in use for the expand method.

	// -----------------------------------------------------------------------------------------
	// The following code was taken from the SENG438 Lab Document
	// -----------------------------------------------------------------------------------------
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// This calls the setUpBefore even the class exists and does nothing.
	}

	@Before
	public void setUp() throws Exception {
		// Before each test case this object of range is ready for us to use.
		exampleRange = new Range(-1, 1);
	}

	@Test
	public void centralValueShouldBeZero() {
		// This is testing the centralValue function which checks what the value between
		// the range is.
		assertEquals("The central value of -1 and 1 should be 0", 0, exampleRange.getCentralValue(), .000000001d);
		// assertion that expected value matches the actual value (0)
	}
	// -----------------------------------------------------------------------------------------
	// End of Lab Document Code
	// -----------------------------------------------------------------------------------------

	// -----------------------------------------------------------------------------------------
	// Code created by Abhay and Rachel
	// -----------------------------------------------------------------------------------------
	/* Abhay codes and Rachel Reviews */
	// ------------- expand(Range range, double lowerMargin, double upperMargin) Tests -----------

	/**
	 * This test will simulate creating expand a null range. This test should throw
	 * an exception.
	 */
	@Test
	public void expandNull() {
		try {
			Range nullRange = null; // creating a null range
			testExpandRange = Range.expand(nullRange, 0.25, 0.5); // trying to expand the null range
			fail("This method should throw an exception!");
			// creating a failure message for if expand does not throw an
			// exception
		} catch (Exception e) {
			assertEquals("The exception thrown type is IllegalArgumentException", IllegalArgumentException.class,
					e.getClass());
			// catching the exception, asserting that an IllegalArgumentException was thrown
		}
	}
	
	/**
	 * This test will simulate expanding the range by 0.25 and 0.5 - asserting that
	 * the lower margin will be expanded to be 1.
	 */
	@Test
	public void expandTestLowerMarginInt() { // This is created the see if the range will change or not.
		// Using the margin value in percentages which will return the lower bound as an
		// integer.
		testRange1 = new Range(2, 6); // This is creating the range for testing purposes.
		testExpandRange = Range.expand(testRange1, 0.25, 0.5); // Using the expand method to pass in the test
		// range and the margin values
		assertEquals("The lower margin range will be 1", 1, testExpandRange.getLowerBound(), .000000001d);
		// assertion that expected value matches the actual value (1)
	}

	/**
	 * This test will simulate expanding the range by 0.25 and 0.5 - asserting that
	 * the upper margin will be expanded to be 8.
	 */
	@Test
	public void expandTestUpperMarginInt() {// This is created the see if the range will change or not.
		// Using the margin value in percentages which will return the upper bound as an
		// integer.
		testRange1 = new Range(2, 6); // This is creating the range for testing purposes.
		testExpandRange = Range.expand(testRange1, 0.25, 0.5);// Using the expand method to pass in the test
		// range and the margin values
		assertEquals("The upper margin range will be 8", 8, testExpandRange.getUpperBound(), .000000001d);
		// assertion that expected value matches the actual value (8)
	}
	
	/**
	 * This test will simulate expanding the range by 1.25 and 1.5 - asserting that
	 * the upper margin will be expanded to be 12.
	 */
	@Test
	public void expandTestUpperMarginOverOne() {// This is created the see if the range will change or not.
		// Using the margin value in percentages which will return the upper bound as an
		// integer.
		testRange1 = new Range(2, 6); // This is creating the range for testing purposes.
		testExpandRange = Range.expand(testRange1, 1.25, 1.5);// Using the expand method to pass in the test
		// range and the margin values which are greater than 1. 
		assertEquals("The upper margin range will be 12", 12, testExpandRange.getUpperBound(), .000000001d);
		// assertion that expected value matches the actual value (12)
	}
	
	/**
	 * This test will simulate expanding the range by -0.24 and -0.50 - asserting that
	 * the upper margin will be shrink to be 4.
	 */
	@Test
	public void expandTestUpperMarginLessOne() {// This is created the see if the range will change or not.
		// Using the margin value in percentages which will return the upper bound as an
		// integer.
		testRange1 = new Range(2, 6); // This is creating the range for testing purposes.
		testExpandRange = Range.expand(testRange1, -0.24, -0.5);// Using the expand method to pass in the test
		// range and the margin values which are less than 0. 
		assertEquals("The upper margin range will be 4", 4, testExpandRange.getUpperBound(), .000000001d);
		// assertion that expected value matches the actual value (4)
	}

	/**
	 * This test will simulate expanding the range by 0.33 and 0.44 - asserting that
	 * the lower margin will be expanded to be 0.68.
	 */
	@Test
	public void expandTestLowerMarginDecimal() {// This is created the see if the range will change or not.
		// Using the margin value in percentages which will return the lower bound as a
		// decimal.
		testRange1 = new Range(2, 6); // This is creating the range for testing purposes.
		testExpandRange = Range.expand(testRange1, 0.33, 0.44);// Using the expand method to pass in the test
		// range and the margin values
		assertEquals("The lower margin range will be 0.68", 0.68, testExpandRange.getLowerBound(), .000000001d);
		// assertion that expected value matches the actual value (0.68)
	}
	

	/**
	 * This test will simulate expanding the range by 0.33 and 0.44 - asserting that
	 * the upper margin will be expanded to be 7.76.
	 */
	@Test
	public void expandTestUpperMarginDecimal() {// This is created the see if the range will change or not.
		// Using the margin value in percentages which will return the upper bound as a
		// decimal.
		testRange1 = new Range(2, 6); // This is creating the range for testing purposes.
		testExpandRange = Range.expand(testRange1, 0.33, 0.44);// Using the expand method to pass in the test
		// range and the margin values
		assertEquals("The upper margin range will be 7.76", 7.76, testExpandRange.getUpperBound(), .000000001d);
		// assertion that expected value matches the actual value (7.76)
	}
	
	/**
	 * This test will simulate that if we pass in an expansion of zero in the parameters
	 * there should be an exception thrown. 
	 */
	@Test
	public void expandTestWithZero() {// This is created the see if the range will change or not.
		// Using the margin value in percentages which are all 0.
		try {
			testRange1 = new Range(2, 6); // This is creating the range for testing purposes.
			testExpandRange = Range.expand(testRange1, 0, 0);// Using the expand method to pass in the test
			assertEquals("The new range after the expansion of zero was different than orginal.", testRange1, testExpandRange);
		}
		catch(Exception e) {
			fail("Expanding it by zero threw an exception");
		}
		//The assert checks for the exception which is being thrown. 
	}

	/* Rachel codes and Abhay Reviews */
	// ------------- expandToInclude(Range range, double value) Tests -----------

	/**
	 * This test will simulate creating expandToInclude with a null range. This test should throw
	 * an exception.
	 */
	@Test
	public void expandToIncludeNull() {
		try {
			Range nullRange = null; // creating a null range
			testExpandRange = Range.expandToInclude(nullRange, 1); // trying to expand the null range
			fail("This method should throw an exception!");
			// creating a failure message for if expand does not throw an
			// exception
		} catch (Exception e) {
			assertEquals("The exception thrown type is IllegalArgumentException", IllegalArgumentException.class,
					e.getClass());
			// catching the exception, asserting that an IllegalArgumentException was thrown
		}
	}

	/**
	 * This test will simulate expanding a range of 4 and 6 to include the value 5 -
	 * asserting that the upper margin will remain the same and be 6.
	 */
	@Test
	public void expandToInlcudeInsideRangeUpper() { // This test is for testing the expanding the range
		// which will include 5 in the range and making sure the upper value bound is
		// still the same.
		Range tempRange = Range.expandToInclude(new Range(4, 6), 5); // This is creating the test range for this test.
		assertEquals("The upper value will be 6", 6, tempRange.getUpperBound(), .000000001d);
		// assertion that expected value matches the actual value (6)
	}

	/**
	 * This test will simulate expanding a range of 4 and 6 to include the value 5 -
	 * asserting that the lower margin will remain the same and be 4.
	 */
	@Test
	public void expandToInlcudeInsideRangeLower() {// This test is for testing the expanding the range
		// which will include 5 in the range and making sure the lower value bound is
		// still the same.
		Range tempRange = Range.expandToInclude(new Range(4, 6), 5);// This is creating the test range for this test.
		assertEquals("The upper value will be 4", 4, tempRange.getLowerBound(), .000000001d);
		// assertion that expected value matches the actual value (4)
	}

	/**
	 * This test will simulate expanding a range of 0.4 and 5.7 to include the value
	 * 11.2 - asserting that the upper margin will expand to be 11.2.
	 */
	@Test
	public void expandToInlcudeOutsideUpperRangeUpper() { // This test is for testing the expanding the range
		// which will include 5.7 in the range and making sure the upper value bound
		// reflects the updated range.
		Range tempRange = Range.expandToInclude(new Range(0.4, 5.7), 11.2);// This is creating the test range for this
																			// test.
		assertEquals("The upper value will be 11.2", 11.2, tempRange.getUpperBound(), .000000001d);
		// assertion that expected value matches the actual value (11.2)
	}

	/**
	 * This test will simulate expanding a range of 0.4 and 5.7 to include the value
	 * 7 - asserting that the lower margin will remain the same of 0.4.
	 */
	@Test
	public void expandToInlcudeOutsideUpperRangeLower() { // This test is for testing the expanding the range
		// which will include 5.7 in the range and making sure the lower bound remains
		// the same.
		Range tempRange = Range.expandToInclude(new Range(0.4, 5.7), 11.2);// This is creating the test range for this
																			// test.
		assertEquals("The lower value should remain the same and be 0.4", 0.4, tempRange.getLowerBound(), .000000001d);
		// assertion that expected value matches the actual value (0.4)
	}

	/**
	 * This test will simulate expanding a range of 1.6 and 2.6 to include the value
	 * 0.5 - asserting that the upper margin will remain the same of 2.6.
	 */
	@Test
	public void expandToInlcudeOutsideLowerRangeUpper() {// This test is for testing the expanding the range
		// which will include 0.5 in the range and making sure the upper bound will
		// remain the same.
		Range tempRange = Range.expandToInclude(new Range(1.6, 2.6), 0.5);// This is creating the test range for this
																			// test.
		assertEquals("The lower value will be 2.6", 2.6, tempRange.getUpperBound(), .000000001d);
		// assertion that expected value matches the actual value (2.6)
	}

	/**
	 * This test will simulate expanding a range of 1.6 and 2.6 to include the value
	 * 0.5 - asserting that the upper margin will expand to be 0.5.
	 */
	@Test
	public void expandToInlcudeOutsideLowerRangeLower() {// This test is for testing the expanding the range
		// which will include 0.5 in the range and making sure the lower value bound
		// reflects the updated range.
		Range tempRange = Range.expandToInclude(new Range(1.6, 2.6), 0.5);// This is creating the test range for this
																			// test.
		assertEquals("The lower value will be 0.5", 0.5, tempRange.getLowerBound(), .000000001d);
		// assertion that expected value matches the actual value (0.5)
	}

	/**
	 * This test will simulate expanding a range of -4.4 and -6.4 to include the
	 * value -5.4 - asserting that the upper margin will remain the same and be
	 * -4.4.
	 */
	@Test
	public void expandToInlcudeInsideRangeUpperNegative() { // This test is for testing the expanding the range
		// which will include -5 in the range and making sure the upper value bound
		// remains the same.
		Range tempRange = Range.expandToInclude(new Range(-6.4, -4.4), -5.4); // This is creating the test range for
																				// this test.
		assertEquals("The upper value will be -4.4", -4.4, tempRange.getUpperBound(), .000000001d);
		// assertion that expected value matches the actual value (-4.4)
	}

	/**
	 * This test will simulate expanding a range of -4 and -6 to include the value
	 * -5 - asserting that the lower margin will remain the same and be -6.
	 */
	@Test
	public void expandToInlcudeInsideRangeLowerNegative() {// This test is for testing the expanding the range
		// which will include -5 in the range and making sure the lower value bound
		// remains the same.
		Range tempRange = Range.expandToInclude(new Range(-6, -4), -5);// This is creating the test range for this test.
		assertEquals("The lower value will be -6", -6, tempRange.getLowerBound(), .000000001d);
		// assertion that expected value matches the actual value (-4)
	}

	/**
	 * This test will simulate expanding a range of -0.4 and -5.7 to include the
	 * value 11.2 - asserting that the upper margin will remain the same of -0.4.
	 */
	@Test
	public void expandToInlcudeOutsideUpperRangeUpperNegative() { // This test is for testing the expanding the range
		// which will include -5.7 in the range and making sure the upper bound remains
		// the same.
		Range tempRange = Range.expandToInclude(new Range(-5.7, -0.4), -11.2);// Creating the test range for this test.
		assertEquals("The upper value will be -0.4", -0.4, tempRange.getUpperBound(), .000000001d);
		// assertion that expected value matches the actual value (-0.4)
	}

	/**
	 * This test will simulate expanding a range of -0.4 and -5.7 to include the
	 * value 7 - asserting that the lower margin will expand to be -11.2.
	 */
	@Test
	public void expandToInlcudeOutsideUpperRangeLowerNegative() { // This test is for testing the expanding the range
		// which will include -5.7 in the range and making sure the lower value bound
		// reflects the updated range.
		Range tempRange = Range.expandToInclude(new Range(-5.7, -0.4), -11.2);// Creating the test range for this test.
		assertEquals("The lower value should remain the same and be -11.2", -11.2, tempRange.getLowerBound(),
				.000000001d);
		// assertion that expected value matches the actual value (-11.2)
	}

	/**
	 * This test will simulate expanding a range of -1.6 and -2.6 to include the
	 * value 0.5 - asserting that the upper margin will remain the same of -2.6.
	 */
	@Test
	public void expandToInlcudeOutsideLowerRangeLowerNegative() {// This test is for testing the expanding the range
		// which will include -0.5 in the range and making sure the lower bound will
		// remain the same.
		Range tempRange = Range.expandToInclude(new Range(-2.6, -1.6), -0.5);// This is creating the test range for this
																				// test.
		assertEquals("The lower value will be -2.6", -2.6, tempRange.getLowerBound(), .000000001d);
		// assertion that expected value matches the actual value (-2.6)
	}

	/**
	 * This test will simulate expanding a range of -1.6 and -2.6 to include the
	 * value 0.5 - asserting that the upper margin will expand to be -0.5.
	 */
	@Test
	public void expandToInlcudeOutsideLowerRangeUpperNegative() {// This test is for testing the expanding the range
		// which will include -0.5 in the range and making sure the upper value bound
		// reflects the updated range.
		Range tempRange = Range.expandToInclude(new Range(-2.6, -1.6), -0.5);// This is creating the test range for this
																				// test.
		assertEquals("The lower value will be -0.5", -0.5, tempRange.getUpperBound(), .000000001d);
		// assertion that expected value matches the actual value (-0.5)
	}
	// -----------------------------------------------------------------------------------------
	// End of code by Abhay and Rachel
	// -----------------------------------------------------------------------------------------

	// -----------------------------------------------------------------------------------------
	// Code written by Alexis and Lauraine
	// -----------------------------------------------------------------------------------------
	/* Alexis codes and Lauraine reviews */

	// ------------- combine(Range range1, Range range2) Tests ---------------------

	/**
	 * This test will be used to test what happens when the first parameter entered
	 * is null. The second value (the other range) should be returned.
	 */
	@Test
	public void combineFirstParameterNullUpperBound() {
		Range tempRange = Range.combine(null, new Range(4, 8)); // combine our null range with a given range of (4, 8)
		double upperBound = tempRange.getUpperBound(); // get our new upper bound for the combined range
		assertEquals("The combined upper bound should be 8.0 and it is " + upperBound, 8.0, upperBound, .000000001d);
		// assertion that expected value matches the actual value (8.0)
	}

	/**
	 * This test will be used to test what happens when the first parameter entered
	 * is null. The second value (the other range) should be returned.
	 */
	@Test
	public void combineFirstParameterNullLowerBound() {
		Range tempRange = Range.combine(null, new Range(4, 8)); // combine our null range with a given range of (4, 8)
		double lowerBound = tempRange.getLowerBound(); // get our new lower bound for the combined range
		assertEquals("The combined lower bound should be 4.0 and it is " + lowerBound, 4.0, lowerBound, .000000001d);
		// assertion that expected value matches the actual value (4.0)
	}

	/**
	 * This test will be used to test what happens when the second parameter entered
	 * is null. The first value (the other range) should be returned.
	 */
	@Test
	public void combineSecondParameterNullUpperBound() {
		Range tempRange = Range.combine(null, new Range(-8, -2)); // combine our null range with a given range of (-8,
																	// -2)
		double upperBound = tempRange.getUpperBound(); // get our new upper bound for the combined range
		assertEquals("The combined upper bound should be -2.0 and it is " + upperBound, -2.0, upperBound, .000000001d);
		// assertion that expected value matches the actual value (-2.0)
	}

	/**
	 * This test will be used to test what happens when the second parameter entered
	 * is null. The first value (the other range) should be returned.
	 */
	@Test
	public void combineSecondParameterNullLowerBound() {
		Range tempRange = Range.combine(null, new Range(-8, -2)); // combine our null range with a given range of (-8,
																	// -2)
		double lowerBound = tempRange.getLowerBound(); // get our new lower bound for the combined range
		assertEquals("The combined lower bound should be -8.0 and it is " + lowerBound, -8.0, lowerBound, .000000001d);
		// assertion that expected value matches the actual value (-8.0)
	}

	/**
	 * This test will be used to test what happens when both parameters are null.
	 * The return value should be null and thus throw a null pointer exception
	 */
	@Test(expected = NullPointerException.class)
	public void combineBothParametersNullUpperBound() {
		Range tempRange = Range.combine(null, null); // combine our null range with a given range of (null, null)
		double upperBound = tempRange.getUpperBound(); // get our new upper bound for the combined range
		assertNull("The combined upper bound should be null", upperBound);
		// assertion that expected value matches the actual value (null)
	}

	/**
	 * This test will be used to test what happens when both parameters are null.
	 * The return value should be null and thus throw a null pointer exception
	 */
	@Test(expected = NullPointerException.class)
	public void combineBothParametersNullLowerBound() {
		Range tempRange = Range.combine(null, null); // combine our null range with a given range of (null, null)
		double lowerBound = tempRange.getLowerBound(); // get our new lower bound for the combined range
		assertNull("The combined lower bound should be null", lowerBound);
		// assertion that expected value matches the actual value (null)
	}

	/**
	 * This test will be used to test what happens when no parameters are null. A
	 * new range should be created from the combination of the two input ranges.
	 */
	@Test
	public void combineNoParametersNullUpperBound() {
		Range tempRange = Range.combine(new Range(1, 10), new Range(-8, -2)); // combine two ranges of (1, 10) and (-8,
																				// -2)
		double upperBound = tempRange.getUpperBound(); // get our new upper bound for the combined range
		assertEquals("The combined upper bound should be 10.0 and it is " + upperBound, 10.0, upperBound, .000000001d);
		// assertion that expected value matches the actual value (10.0)
	}

	/**
	 * This test will be used to test what happens when no parameters are null. A
	 * new range should be created from the combination of the two input ranges.
	 */
	@Test
	public void combineNoParametersNullLowerBound() {
		Range tempRange = Range.combine(new Range(1, 10), new Range(-8, -2)); // combine two ranges of (1, 10) and (-8,
																				// -2)
		double lowerBound = tempRange.getLowerBound(); // get our new lower bound for the combined range
		assertEquals("The combined lower bound should be -8.0 and it is " + lowerBound, -8.0, lowerBound, .000000001d);
		// assertion that expected value matches the actual value (-8.0)
	}

	
	
	// ------------- getLength() Tests ---------------------

	/**
	 * This test will be used to test the length of a range when it should be zero.
	 */
	@Test
	public void testGetLengthZero() {
		Range tempRange = new Range(1, 1); // create a new Range object
		double length = tempRange.getLength(); // calculate the length of the range
		assertEquals("The length should be 0.0 and it is " + length, 0.0, length, .000000001d);
		// assertion that expected value matches the actual value (0.0)
	}

	/**
	 * This test will be used to test the length of an extremely large positive
	 * range
	 */
	@Test
	public void testGetLengthLargePositive() {
		Range tempRange = new Range(2, 200000000); // create a new Range object
		double length = tempRange.getLength(); // calculate the length of the range
		assertEquals("The length should be 199,999,998 and it is " + length, 199999998.0, length, .000000001d);
		// assertion that expected value matches the actual value
	}

	/**
	 * This test will be used to test the length of an extremely large negative
	 * range
	 */
	@Test
	public void testGetLengthLargeNegative() {
		Range tempRange = new Range(-200000000, -2); // create a new Range object
		double length = tempRange.getLength(); // calculate the length of the range
		assertEquals("The length should be 199,999,998 and it is " + length, 199999998.0, length, .000000001d);
		// assertion that expected value matches the actual value
	}

	/**
	 * This test will be used to test the length of a range composed of two double
	 * numbers
	 */
	@Test
	public void testGetLengthRangeIsDouble() {
		Range tempRange = new Range(-200.03, 200.50); // create a new Range object
		double length = tempRange.getLength(); // calculate the length of the range
		assertEquals("The length should be 400.53 and it is " + length, 400.53, length, .000000001d);
		// assertion that expected value matches the actual value
	}

	/**
	 * This test will be used to test the length of a range composed of integers
	 */
	@Test
	public void testGetLengthRangeIsInt() {
		Range tempRange = new Range(-30, 35); // create a new Range object
		double length = tempRange.getLength(); // calculate the length of the range
		assertEquals("The length should be 65 and it is " + length, 65, length, .000000001d);
		// assertion that expected value matches the actual value
	}

	/**
	 * This test will be used to test the length of a range composed of a double and
	 * an integer
	 */
	@Test
	public void testGetLengthRangeDoubleAndInt() {
		Range tempRange = new Range(-200.03, 200); // create a new Range object
		double length = tempRange.getLength(); // calculate the length of the range
		assertEquals("The length should be 400.03 and it is " + length, 400.03, length, .000000001d);
	}

	/* Lauraine codes and Alexis reviews */

	// ------------- shift(Range base, double delta) Tests ---------------------

	/**
	 * This test will be used to test what happens when a range is shifted by a
	 * positive amount. We are only checking the upper bound of the range.
	 */
	@Test
	public void shiftByPositiveDoubleUpperBound() {
		testRange1 = new Range(2, 6);
		Range testShiftedRange = Range.shift(testRange1, 158.3);
		assertEquals("The shifted value should be ", 164.3, testShiftedRange.getUpperBound(), .000000001d);
	}

	/**
	 * This test will be used to test what happens when a range is shifted by a
	 * positive amount. We are only checking the lower bound of the range.
	 */
	@Test
	public void shiftByPositiveDoubleLowerBound() {
		testRange1 = new Range(2, 6);
		Range testShiftedRange = Range.shift(testRange1, 2.2);
		assertEquals("The shifted value should be ", 4.2, testShiftedRange.getLowerBound(), .000000001d);
	}

	/**
	 * This test will be used to test what happens when a range is shifted by a
	 * negative amount. We are only checking the upper bound of the range.
	 */
	@Test
	public void shiftByNegativeDoubleUpperBound() {
		testRange1 = new Range(2, 6);
		Range testShiftedRange = Range.shift(testRange1, -2.2);
		assertEquals("The shifted value should be ", 3.8, testShiftedRange.getUpperBound(), .000000001d);
	}

	/**
	 * This test will be used to test what happens when a range is shifted by a
	 * negative amount. We are only checking the lower bound of the range.
	 */
	@Test
	public void shiftByNegativeDoubleLowerBound() {
		testRange1 = new Range(2, 6);
		Range testShiftedRange = Range.shift(testRange1, -1.2);
		assertEquals("The shifted value should be ", 0.8, testShiftedRange.getLowerBound(), .000000001d);
	}

	/**
	 * This test will be used to test what happens when a range is shifted by a
	 * negative amount where the range will now have a negative coordinate. We are
	 * only checking the upper bound of the range.
	 */
	@Test
	public void shiftByNegativeDoubleToGetNegativeValueUpperBound() {
		testRange1 = new Range(2, 6);
		Range testShiftedRange = Range.shift(testRange1, -6.8);
		assertEquals("The value for the upper bound is incorrect.", -0.8, testShiftedRange.getUpperBound(),
				.000000001d);
	}

	/**
	 * This test will be used to test what happens when a range is shifted by a
	 * negative amount where the range will now have a negative coordinate. We are
	 * only checking the lower bound of the range.
	 */
	@Test
	public void shiftByNegativeDoubleToGetNegativeValueLowerBound() {
		testRange1 = new Range(2, 6);
		Range testShiftedRange = Range.shift(testRange1, -2.2);
		assertEquals("The value for the lower bound is incorrect.", -0.2, testShiftedRange.getLowerBound(),
				.000000001d);
	}

	// -----------------------------------------------------------------------------------------
	// End of code by Alexis and Lauraine
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
	// End of SENG438 Lab Document Code
	// -----------------------------------------------------------------------------------------

}
