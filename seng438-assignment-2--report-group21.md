**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#2 – Requirements-Based Test Generation**

| Group \#:      |     |
| -------------- | --- |
| Student Names: |     |
| Rachel Renegado|     |
| Lauraine Baffot|     |
| Abhay Khosla   |     |
| Alexis Hamrak  |     |

# 1 Introduction

In this lab, we were tasked with the concepts of unit testing which we used JUnit frameworks to create a testing environment that is composed of mock objects and test cases designed. The lab is meant to get familiar with using Eclipse and its functionality of JUnit and setting up a project with the JAR files given to us. The other focal point of the lab was to use Java documentation and create test cases for the classes from that as the foundation piece. 

# 2 Detailed description of unit test strategy
**Test plan**:

We will begin by reviewing the java documentation to understand how both the DataUtilities and Range classes and methods work. Once we have developed a strong understanding of both classes, we will start the planning and development of our 10 test cases. Since DataUtilities only has 5 methods, we will conduct unit tests for each method. If we determine that some of the methods need more than one test case to truly test the behavior, we will create another test case for that method. For the Range class, we will choose 5 out of 15 of the methods to test. Similar to the DataUtilities class, we will add more test cases for these methods as necessary. After we have decided which methods to test, we will determine which black-box test-case design techniques should be used in our test case implementation (such as equivalence classes, boundary conditions, etc.).

**Input Partitions: Range Class Methods**

expand(Range range, double lowerMargin, double upperMargin)
1. The parameter: “the range (null not permitted) ” created a partition with two inputs: the range is null, and the range is not null.
2. The Range was assumed to contain positive or negative lower and upper margins, which added two more inputs to the partition: test with range margins that are negative values, and range margins that are positive values.
3. The parameters: “lowerMargin and upperMargin can be negative and positive percentages” added multiple outputs to the partition: varying sizes of negative and positive values for lowerMargin and upperMargin.

expandToInclude(Range range, double value)
1. The parameter: “the range (null permitted) ” created a partition with two inputs: the range is null, and the range is not null. 
2. The Range was assumed to contain positive or negative lower and upper margins, which added two more inputs to the partition: test with range margins that are negative values, and range margins that are positive values.
3. The parameter value was assumed to be either a negative or positive double value, which added multiple outputs to the partition: varying sizes of negative and positive values to include in the new range

combine(Range range1, Range range2)
1. The parameter: “the first range (null permitted)” created a partition with three inputs: the range is null, the range is not null and is a positive value, and the range is not null and is a negative value.
2. The parameter: “the second range (null permitted)” added three more inputs to the partition: the range is null, the range is not null and is a positive value, and the range is not null and is a negative value.
3. The last note “if both ranges are null, the return value is null” added another input to the partition where both ranges were null.
4. The final input was if both ranges were not null and either positive or negative values.

shift(Range base, double delta)
1. The parameter: “base range (null not permitted)” created a partition with both null and not null Range object parameters.
2. The parameter: “the shift amount” created a partition with two inputs: the amount and the Range are positive, the amount is negative and the range is positive.
3. The parameter: “the shift amount” also created a partition with one input: the amount is a large negative number and the range is positive. This allowed us to see if the Range is able to be negative.

getLength()
1. There were no given parameters and requirements for the input, so we created a partition with a predicted output of length zero, output lengths that are large positive and negative values, as well as a predicted double output, and int output. This created a variety of input ranges including an input of 0, a large positive and negative, as well as both double and int values.


**Input Partitions: DataUtilities Class Methods**

calculateRowTotal(Values2D data, int row)
1. The parameter: “the data is basically all of the values that are in the mock objects” in this function it will be the row values. 
2. The parameter: “the row is the number of the row which is being passed in” this number indicates the row which will be used to calculate the total of its values. 
3. This function primarily focused on being able to create an object premade and then check if the calculateRowTotal would work as if it was a real object. 
4. The function should calculate the row total even if nothing is in it. 
5. The function should throw an exception since null cannot be in the data parameter.
6. Testing with negative and positive values in the rows to calculate it’s total

createNumberArray(double [] data)
1. The parameter, data, takes a double array and returns an array of type Number
2. The parameter, data, should be able to contain varying sizes of very large and very small (positive and negative) double values
3. The function should be able to create an empty array
4. The parameter, data has the restriction “null not permitted”

createNumberArray2D(double[][] data)
1. The parameter, data, takes a double array and returns a 2D array of type Number
2. The parameter, data, should be able to contain varying sizes of very large and very small (positive and negative) double values 
3. The function should be able to create an empty 2D array
4. The parameter, data, has the restriction “null not permitted”

calculateColumnTotal(Values2D data, int column)
1. The parameter, data, has a restriction detailing “the table of values (null not permitted)” 
2. The parameter, column, was detailed to be “zero-based” meaning that the index value starts at zero (no negative indexes can exist).
3. The parameter, data, should be able to contain varying sizes of very large and very small (positive and negative) double values 

equal(double[][] a, double[][] b)
1. The parameter: “To be considered equal, the arrays must have exactly the same dimensions, and the values in each array must also match (with NaN being equal in this test)” created a partition with multiple inputs; a and b with the same dimensions and same values, a and b with different dimensions, and a and b with the same dimensions but different values. 
2. The parameters: “the first array and second array are null permitted” adds three more inputs to the partition; a is null and b is not, a is not null and b is null, and a and b are both null.

# 3 Test cases developed
**Range Class**
|  Class Name | Method | Partition # Related | Test Case Name | Pass/Fail | 
| ----------------- | ---------  | ------------------------  | ----------------------  | ------------ | 
| Range | expand | 1 | expandNull() | Pass |
| Range | expand |  | expandTestLowerMarginInt() | Pass |
| Range | expand |  | expandTestUpperMarginInt() | Pass |
| Range | expand |   | expandTestLowerMarginDecimal() | Pass |
| Range | expand |   | expandTestUpperMarginDecimal() | Pass |
| Range | expandToInlcude | 1 | expandToIncludeNullLower() | Pass |
| Range | expandToInlcude | 1 | expandToIncludeNullUpper() | Pass |
| Range | expandToInlcude |   | expandToInlcudeInsideRangeUpper() | Pass |
| Range | expandToInlcude |   | expandToInlcudeInsideRangeLower() | Pass |
| Range | expandToInlcude |   | expandToInlcudeOutsideUpperRangeUpper() | Pass |
| Range | expandToInlcude |   | expandToInlcudeOutsideUpperRangeLower() | Pass |
| Range | expandToInlcude |   | expandToInlcudeOutsideLowerRangeUpper() | Pass |
| Range | expandToInlcude |   | expandToInlcudeOutsideLowerRangeLower() | Pass |
| Range | expandToInlcude |   | expandToInlcudeInsideRangeUpperNegative() | Pass |
| Range | expandToInlcude |   | expandToInlcudeInsideRangeLowerNegative() | Pass |
| Range | expandToInlcude |   | expandToInlcudeOutsideUpperRangeUpperNegative() | Pass |
| Range | expandToInlcude |   | expandToInlcudeOutsideUpperRangeLowerNegative() | Pass |
| Range | expandToInlcude |   | expandToInlcudeOutsideLowerRangeLowerNegative() | Pass |
| Range | expandToInlcude |   | expandToInlcudeOutsideLowerRangeUpperNegative() | Pass |
| Range | combine | 1 | combineFirstParameterNullUpperBound() | Pass |
| Range | combine | 1 | combineFirstParameterNullLowerBound() | Pass |
| Range | combine | 2 | combineSecondParameterNullUpperBound() | Pass |
| Range | combine | 2 | combineSecondParameterNullLowerBound()| Pass |
| Range | combine | 3 | combineBothParametersNullUpperBound() | Pass |
| Range | combine | 3 | combineBothParametersNullLowerBound() | Pass |
| Range | combine | 4 | combineNoParametersNullUpperBound() | Pass |
| Range | combine | 4 | combineNoParametersNullLowerBound() | Pass |
| Range | getLength | 1 | testGetLengthZero() | Pass |
| Range | getLength | 1 | testGetLengthLargePositive() | Pass |
| Range | getLength | 1 | testGetLengthLargeNegative() | Pass |
| Range | getLength | 1 | testGetLengthRangeIsDouble() | Pass |
| Range | getLength | 1 | testGetLengthRangeIsInt() | Pass |
| Range | getLength | 1 | testGetLengthRangeDoubleAndInt() | Pass |
| Range | shift |   | shiftByPositiveDoubleUpperBound() | Pass |
| Range | shift |   | shiftByPositiveDoubleLowerBound() | Pass |
| Range | shift |   | shiftByNegativeDoubleUpperBound() | Pass |
| Range | shift |   | shiftByNegativeDoubleLowerBound() | Pass |
| Range | shift |   | shiftByNegativeDoubleToGetNegativeValueUpperBound() | Fail |
| Range | shift |   | shiftByNegativeDoubleToGetNegativeValueLowerBound() | Fail |

**DataUtilities**
|  Class Name | Method | Partition # Related | Test Case Name | Pass/Fail | 
| ----------------- | ---------  | ------------------------  | ----------------------  | ------------ | 
| DataUtilities | createNumberArray2D |  | createNumberRegular2DArrayOfFive()| Pass | 
| DataUtilities | createNumberArray2D |  | createNumberRegular2DArrayOfOne()| Pass |
| DataUtilities | createNumberArray2D |  | createNumberRegular2DArrayOfNegativeValues() | Pass |
| DataUtilities | createNumberArray2D |  | createNumberRegular2DArrayOfHugeValues()| Pass |
| DataUtilities | createNumberArray2D |  | createNumber2DEmptyArray()| Pass |
| DataUtilities | createNumberArray2D |  | createNumber2DEmptyArrayOne()| Pass | 
| DataUtilities | createNumberArray2D |  | createNumber2DEmptyArray()Empty| Pass | 
| DataUtilities | calculateRowTotal |  | calculateRowTotalEmptyChart()| Pass |
| DataUtilities | calculateRowTotal |  | createRowTotalNull()| Pass |
| DataUtilities | calculateRowTotal |  | createRowTotalPositive()| Pass |
| DataUtilities | calculateRowTotal |  | createRowTotalNegative()| Pass |
| DataUtilities | createNumberArray |  | createNumberArrayPositiveDouble()| Pass |
| DataUtilities | createNumberArray |  | createNumberArrayNegativeDouble()| Pass |
| DataUtilities | createNumberArray |  | createNumberArrayNull()| Pass |
| DataUtilities | createNumberArray |  | createNumberArrayZero()| Pass |
| DataUtilities | createNumberArray |  | createNumberArrayEmpty()| Pass |
| DataUtilities | createNumberArray |  | createNumberArrayNegativePositive()| Pass |
| DataUtilities | createNumberArray |  | createNumberArrayMaxDoubleFour()| Pass |
| DataUtilities | createNumberArray |  | createNumberArrayMinDoubleFour()| Pass |
| DataUtilities | calculateColumnTotal |  | calculateColumnTotalEmptyChart()| Pass | 
| DataUtilities | calculateColumnTotal |  | calculateColumnTotalNull()| Pass |
| DataUtilities | calculateColumnTotal |  | calculateColumnTotalNegativeColumnNumber()| Fail |
| DataUtilities | calculateColumnTotal |  | calculateColumnTotalPositive()| Pass |
| DataUtilities | calculateColumnTotal |  | calculateColumnTotalNegative()| Pass | 
| DataUtilities | equal | 1 | testEqualityOfEqualArrays_SameLength()| Pass |
| DataUtilities | equal | 1 | testEqualityOfUnequalArrays_SameLength()| Pass |
| DataUtilities | equal | 1 | testEqualityOfArrays_DifferentLength()| Pass |
| DataUtilities | equal | 2 | testEqualityOfFirstNullArray()| Pass |
| DataUtilities | equal | 2 | testEqualityOfSecondNullArray()| Pass |
| DataUtilities | equal | 2 | testEqualityOfTwoNullArrays()| Pass |

Each partition number matches the corresponding number for that function as listed in section 2. 

# 4 How the team work/effort was divided and managed

As a group, we decided to use pair testing and divided the unit tests among ourselves. All of the work was also being done remotely using Discord with each group member sharing the screens in the pairs which we had formed. The functions were also divided to make it easier to complete the lab instead of doing it in all one large group. The work was divided as followed:

**Pair #1 (Rachel/Abhay):**

This pair developed unit test cases for 2 methods in the Range class:
expand(Range range, double lowerMargin, double upperMargin)
expandToInclude(Range range, double value)
This pair also developed unit test cases for 3 methods in the DataUtilitiesclass:
calculateRowTotal(Values2D data, int row)
createNumberArray(double [] data)
createNumberArray2D(double[][] data)

**Pair 2 (Alexis/Lauraine):**

This pair developed unit test cases for 3 methods in the Range class:
combine(Range range1, Range range2)
getLength()
shift(Range base, double delta)
This pair also developed unit test cases for 2 methods in the DataUtilitiesclass:
calculateColumnTotal(Values2D data, int column)
equal(double[][] a, double[][] b)

With this testing strategy, both pairs were able to develop their understanding of both classes and each of their methods while completing the tests in an efficient time. Once both pairs have completed their test cases, we will review and explain our processes as a group. As a strategy for using creating the test cases we used the boundary values which was seen in various of our test cases where would test for if it was near the boundary or not. For example, it would have been redundant to do test cases that were similar to each other for example we can use the variables using values above the upper boundary(AUB). In the boundary values, we examine it using the function values which can be passed as parameters to test these cases of these independent variables. This strategy was similar to the equivalence classes but instead examined the minimum and maximum values. After these steps we were able to create a project in Eclipse with the SUT like a test suite which was showcased in our two test classes. 


# 5 Difficulties encountered, challenges overcome, and lessons learned

One of the major difficulties we ran into was that some of the JAR files were missing for example we needed to include Hamcrest-all in order for the mocking objects to work for the DataUtlitiesTest class. Another challenge we faced was being able to have the JFreeChart demo be able to work on the Apple laptops the windows would not always pop out properly hence having us switch to using Windows machines to create the Eclipse project. The complexity of the lab document was also another challenge we faced because some of the things were not as clear for example, on how to run the mocking objects. We also had challenges in overcoming the ability to effectively split the work among ourselves we solved this by dividing in pair reviews where we would have one person code and other review. Mocking objects is creating an implementation of being able to execute tests with premade objects which can mimic a real object. For the mocking we used jMock which was provided to us which is essentialy similar to Mockito in the lectures. jMock allowed us to have this interaction between the a real function and mock object gives the ability to test the method calls not only it’s easier to define the mock objects but it lets keep a continuous flow of the code. It also provides the functionality of creating an object tailored to the feature which is being tested in the unit testing framework. The other benefit is that we are able to make testing more fluid with the help of jMock since they can be independent of each other. This ability of mocking objects enables us to stimulate the behavior of a complicated real object into our unit testing whereas including a real object is imporatical. There does come some problems with mocking because ti does override the logic of a class since the real logic for the object creation is not fully shown when doing unit testing. The mock object may not include all of the methods or parameters it is taking in as a real object would do. The second drawback is that the mock object could even have a different return type from the object in the class since it has different attributes. Not always the behaviour of a mocking object will be identical to the object which is real for example there could be a situation where the mock is not raising an exception which it should be. 

# 6 Comments/feedback on the lab itself

As a group, we found the differences between what was posted on D2L and what was posted on Git to be quite confusing. These differences resulted in major uncertainties and obstacles that prevailed throughout the lab. Specifically, comparing the files on D2L and git, the artifacts folder and lab document were different versions and performed differently when testing. Due to this lack of consistency between platforms, initially half of our group operated on the D2L files and half operated on the git files - resulting in us being very confused when we had different tests fail. For example, on the D2L version, the getUpperBound() function in the Range class failed to return the upper bound value, but in the Git version, getUpperBound() returned the correct value. It was more frustrating to hear that other groups were experiencing the same problems, yet there was no announcement made during the lab or in lectures that we were meant to use the git files explicitly; groups had to contact the professor or TA to know that the D2L version was out of date. 

As mentioned in the above section, after our group switched to working on the Git version, there still were issues with the files from the artifact folder. The mock test were all failing due to hamcrest not being included in our artifacts folder. This issue was resolved AFTER we contacted the TA and Professor to clarify if we are allowed/meant to include external jars such as hamcrest.

Overall, this miscommunication caused confusion and resulted in us having to constantly adapt and work around these obstacles.
