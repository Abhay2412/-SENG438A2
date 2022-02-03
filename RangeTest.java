package org.jfree.data.test;

import static org.junit.Assert.*; import org.jfree.data.Range; import org.junit.*;

public class RangeTest {
    private Range exampleRange;
    private Range testRange1;
    private Range testExpandRange;
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    	exampleRange = new Range(-1, 1);    	
    }

    @Test
    public void centralValueShouldBeZero() {
        assertEquals("The central value of -1 and 1 should be 0",
        0, exampleRange.getCentralValue(), .000000001d);
    }

	@Test
    public void expandTestLowerMarginInt() {
    	testRange1 = new Range(2, 6);
    	testExpandRange = Range.expand(testRange1, 0.25, 0.5);
    	assertEquals("The lower margin range will be 1", 
    			1, testExpandRange.getLowerBound(), .000000001d);
    }
	
	@Test
    public void expandTestUpperMarginInt() {
    	testRange1 = new Range(2, 6);
    	testExpandRange = Range.expand(testRange1, 0.25, 0.5);
    	assertEquals("The upper margin range will be 8", 
    			8, testExpandRange.getUpperBound(), .000000001d);
    }
	
	@Test
    public void expandTestLowerMarginDecimal() {
    	testRange1 = new Range(2, 6);
    	testExpandRange = Range.expand(testRange1, 0.33, 0.44);
    	assertEquals("The lower margin range will be 1", 
    			0.68, testExpandRange.getLowerBound(), .000000001d);
    }
	
	@Test
    public void expandTestUpperMarginDecimal() {
    	testRange1 = new Range(2, 6);
    	testExpandRange = Range.expand(testRange1, 0.33, 0.44);
    	assertEquals("The upper margin range will be 8", 
    			7.76, testExpandRange.getUpperBound(), .000000001d);
    }
	
	@Test
	public void expandToInlcudeInsideUpperRange(){
		Range tempRange1 = Range.expandToInclude(new Range (4, 6), 5);
		assertEquals("The upper value will be 6", 
				6, tempRange1.getUpperBound(), .000000001d);
	}
	
	@Test
	public void expandToInlcudeInsideLowerRange(){
		Range tempRange1 = Range.expandToInclude(new Range (4, 6), 5);
		assertEquals("The upper value will be 4", 
				4, tempRange1.getLowerBound(), .000000001d);
	}
	
	@Test
	public void expandToInlcudeOutsideUpperRange(){
		Range tempRange1 = Range.expandToInclude(new Range (4, 6), 7);
		assertEquals("The upper value will be 7", 
				7, tempRange1.getUpperBound(), .000000001d);
	}

	@Test
	public void expandToInlcudeOutsideLowerRange(){
		Range tempRange3 = Range.expandToInclude(new Range (3,7), 1);
		assertEquals("The upper value will be 1", 
				1, tempRange3.getLowerBound(), .000000001d);
	}
    
    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}
