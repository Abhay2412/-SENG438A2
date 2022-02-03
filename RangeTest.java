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
    public void expandTestLowerMargin() {
    	testRange1 = new Range(2, 6);
    	testExpandRange = Range.expand(testRange1, 0.25, 0.5);
    	assertEquals("The lower margin range will be 1", 1, testExpandRange.getLowerBound(), .000000001d);
    }
	
	@Test
    public void expandTestUpperMargin() {
    	testRange1 = new Range(2, 6);
    	testExpandRange = Range.expand(testRange1, 0.25, 0.5);
    	assertEquals("The upper margin range will be 8", 8, testExpandRange.getUpperBound(), .000000001d);
    }
    
    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}
