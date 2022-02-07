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

Text…

# 2 Detailed description of unit test strategy

**Test plan**:

We will begin by reviewing the java documentation to understand how both the DataUtilities and Range classes and methods work. Once we have developed a strong understanding of both classes, we will start the planning and development of our 10 test cases. Since DataUtilities only has 5 methods, we will conduct unit tests for each method. If we determine that some of the methods need more than one test case to truly test the behavior, we will create another test case for that method. For the Range class, we will choose 5 out of 15 of the methods to test. Similar to the DataUtilities class, we will add more test cases for these methods as necessary. After we have decided which methods to test, we will determine which black-box test-case design techniques should be used in our test case implementation (such as equivalence classes, boundary conditions, etc.).

**Input Partitions**

*Range Class Methods*

expand(Range range, double lowerMargin, double upperMargin)
1. The parameter: “the range (null not permitted) ” created a partition with two inputs: the range is null, and the range is not null.
2. The Range was assumed to contain positive or negative lower and upper margins, which added two more inputs to the partition: test with range margins that are negative values, and range margins that are positive values.
3. The parameters: “lowerMargin and upperMargin can be negative and positive percentages” added multiple outputs to the partition: varying sizes of negative and positive values for lowerMargin and upperMargin.

expandToInclude(Range range, double value)
1. The parameter: “the range (null permitted) ” created a partition with two inputs: the range is null, and the range is not null. 
2. The parameter value was assumed to be either a negative or positive double value, which added multiple outputs to the partition: varying sizes of negative and positive values to include in the new range

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


*DataUtilities Class Methods*

calculateRowTotal(Values2D data, int row)
1. The parameter: “the data is basically all of the values that are in the mock objects” in this function it will be the row values. 
2. The parameter: “the row is the number of the row which is being passed in” this number symbolizes the value which row currently is being added up to its total. 
3. This function primarily focused on being able to create an object premade and then check if the calculateRowTotal would work as if it was a real object. 

createNumberArray(double [] data)
1. The parameter: “the data is basically the array object” which takes in the arrays which are created in order to be tested. 
2. The function was responsible for creating an array which would be passed into the function to test if it properly creates the array with the data that is in it with the test cases being passed in it as well. 

createNumberArray2D(double[][] data)
1. The parameter: “the data is basically the array object” which takes in a double array in which we focus our tests to be on it
2. Similarly to the one with one array indexed this one would have two arrays being passed into its data and then checking if it is able to create an array successfully.  

calculateColumnTotal(Values2D data, int column)
1. The parameter: “the table of values (null not permitted)” created a partition with both null and not null Values2D object parameters, either an empty object or not empty.
2. The parameter: “the column index (zero-based)” adds more inputs to the partition with both positive and negative integer parameters.

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
| Range | expandToInlcude |   | expandToInlcudeOutsideLowerRangeUpper() | 	|
| Range | expandToInlcude |   | expandToInlcudeOutsideLowerRangeLower() |	|
| Range | expandToInlcude |   | expandToInlcudeInsideRangeUpperNegative() |	|
| Range | expandToInlcude |   | expandToInlcudeInsideRangeLowerNegative() |	|
| Range | expandToInlcude |   | expandToInlcudeOutsideUpperRangeUpperNegative() |	|
| Range | expandToInlcude |   | expandToInlcudeOutsideUpperRangeLowerNegative() |	|
| Range | expandToInlcude |   | expandToInlcudeOutsideLowerRangeLowerNegative() |	|
| Range | expandToInlcude |   | expandToInlcudeOutsideLowerRangeUpperNegative() | Pass |
| Range | combine |   | combineFirstParameterNullUpperBound() |	|
| Range | combine |   | combineFirstParameterNullLowerBound() |	|
| Range | combine |   | combineSecondParameterNullUpperBound() | Pass |
| Range | combine |   | combineSecondParameterNullLowerBound()| Pass |
| Range | combine |   | combineBothParametersNullUpperBound() | Pass |
| Range | combine |   | combineBothParametersNullLowerBound() | Pass |
| Range | combine |   | combineNoParametersNullUpperBound() |	|
| Range | combine |   | combineNoParametersNullLowerBound() | Pass |
| Range | getLength |   | testGetLengthZero() | Pass |
| Range | getLength |   | testGetLengthLargePositive() | Pass |
| Range | getLength |   | testGetLengthLargeNegative() | Pass |
| Range | getLength |   | testGetLengthRangeIsDouble() | Pass |
| Range | getLength |   | testGetLengthRangeIsInt() | Pass |
| Range | getLength |   | testGetLengthRangeDoubleAndInt() | Pass |
| Range | shift |   | shiftByPositiveDoubleUpperBound() | Pass |
| Range | shift |   | shiftByPositiveDoubleLowerBound() | Pass |
| Range | shift |   | shiftByNegativeDoubleUpperBound() | Pass |
| Range | shift |   | shiftByNegativeDoubleLowerBound() | Pass |
| Range | shift |   | shiftByNegativeDoubleToGetNegativeValueUpperBound() | Fail |
| Range | shift |   | shiftByNegativeDoubleToGetNegativeValueLowerBound() | Fail |

**DataUtilities**
|  Class Name | Method | Partition # Related | Test Case Name | Pass/Fail | 
| ----------------- | ---------  | ------------------------  | ----------------------  | ------------ | 
| DataUtilities | calculateRowTotal |  |  | |
| DataUtilities | createNumberArray |  |  | |
| DataUtilities | createNumberArray2D |  |  | |
| DataUtilities | calculateColumnTotal |  |  | |
| DataUtilities | equal |  |  | |



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

Text…

# 6 Comments/feedback on the lab itself

As a group, we found the differences between what was posted on D2L and what was posted on Git to be quite confusing. These differences resulted in major uncertainties and obstacles that prevailed throughout the lab. Specifically, comparing the files on D2L and git, the artifacts folder and lab document were different versions and performed differently when testing. Due to this lack of consistency between platforms, initially half of our group operated on the D2L files and half operated on the git files - resulting in us being very confused when we had different tests fail. For example, on the D2L version, the getUpperBound() function in the Range class failed to return the upper bound value, but in the Git version, getUpperBound() returned the correct value. It was more frustrating to hear that other groups were experiencing the same problems, yet there was no announcement made during the lab or in lectures that we were meant to use the git files explicitly; groups had to contact the professor or TA to know that the D2L version was out of date. 

As mentioned in the above section, after our group switched to working on the Git version, there still were issues with the files from the artifact folder. The mock test were all failing due to hamcrest not being included in our artifacts folder. This issue was resolved AFTER we contacted the TA and Professor to clarify if we are allowed/meant to include external jars such as hamcrest.

Overall, this miscommunication caused confusion and resulted in us having to constantly adapt and work around these obstacles.
