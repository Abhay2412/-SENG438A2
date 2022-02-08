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

In this lab, we were tasked with the concepts of unit testing which we used JUnit frameworks to create a testing environment that is composed of mock objects and test cases. The lab is meant for us to get familiar with using Eclipse and all of its functionality of JUnit as well as setting up a project with the JAR files given to us. The other focal point of the lab was to use Java documentation and create test cases for the classes from that as the foundation piece.

# 2 Detailed description of unit test strategy
##Test plan:##
 
We will begin by reviewing the java documentation to understand how both the DataUtilities and Range classes and methods work. Once we have developed a strong understanding of both classes, we will start the planning and development of our 10 test cases. We will choose 5 out of the 9 DataUtilities methods to conduct unit tests on. If we determine that some of the methods need more than one test case to truly test the behavior, we will create another test case for that method. For the Range class, we will choose 5 out of 23 of the methods to test. Similar to the DataUtilities class, we will add more test cases for these methods as necessary. After we have decided which methods to test, we will determine which black-box test-case design techniques should be used in our test case implementation (such as equivalence classes, boundary conditions, etc...).

### ‘Input Partitions: Range Class Methods’ ###
*expand(Range range, double lowerMargin, double upperMargin)*
1.	A null **range**
-	range is null (Invalid)
-	range is not null (Valid)
2. 	**range** margins
- 	range has negative margins (Valid)
- 	range has positive margins (Valid)
3. 	**lowerMargin and upperMargin** values
-	value is a negative number (Valid)
-	value is a positive number (Valid)


### ‘expandToInclude(Range range, double value)’ ###
1.	A null **range**
-	range is null (Valid)
-	range is not null (Valid)
2. 	**range** margins
- 	range has negative margins (Valid)
- 	range has positive margins (Valid)
3. 	**value** amount
-	value is a negative number (Valid)
-	value is a positive number (Valid)


### ‘combine(Range range1, Range range2)’ ###
1.	A null **range1**
-	range1 is null (Valid)
-	range1 is not null (Valid)
2. 	A null **range2**
-	range2 is null (Valid)
-	range2 is not null (Valid)
3. 	Null **range1 and range2**
-	ranges are both null (Valid)
-	ranges are not null (Valid)

### ‘shift(Range base, double delta)’ ###
1.	A null **base**
-	range is null (Invalid)
-	range is not null (Valid)
2. 	**delta** amount
-	value is a negative number (Valid)
-	value is a positive number (Valid)


### ‘getLength()’ ###
1. 	**input** amount
-	input is a negative number (Valid)
-	input is a positive number (Valid)
- 	input is zero (Valid)

##Input Partitions: DataUtilities Class Methods ##

### ‘calculateRowTotal(Values2D data, int row)’ ###
1.	A null **data** 
-	data is null (Invalid)
-	data is not null (Valid)
2. 	Positive or negative values in **data**
- 	elements are negative numbers (Valid)
- 	elements are positve number (Valid)
3.	Value in amounts in **data **
	-	values are small (Valid)
	- 	values are large (Valid)
4. 	Number of elements in **data**
-	data can be empty (Valid)
-	data can have one or multiple elements (Valid)
5. 	**row** value 
-	row is less than zero (Invalid)
-	row is equal or greater than zero (Valid)

### ‘createNumberArray(double [] data)’ ###
1.	A null **data** 
-	data is null (Invalid)
-	data is not null (Valid)
2. 	Positive or negative values in **data**
- 	values are negative numbers (Valid)
- 	values are positve number (Valid)
3.	Value(s) in amounts **data** 
	-	values are small (Valid)
	- 	values are large (Valid)
4. 	Number of elements in **data**
-	data can be empty (Valid)
-	data can have one or multiple elements (Valid)

### ‘createNumberArray2D(double[][] data)’ ###
1.	A null **data** 
-	data is null (Invalid)
-	data is not null (Valid)
2. 	Positive or negative values in **data**
- 	values are negative numbers (Valid)
- 	values are positive number (Valid)
3.	Value(s) in amounts **data** 
	-	values are small (Valid)
	- 	values are large (Valid)
4. 	Number of elements in **data**
-	data can be empty (Valid)
-	data can have one or multiple elements (Valid)

### ‘calculateColumnTotal(Values2D data, int column)’ ###
1. The parameter, data, has a restriction detailing “the table of values (null not permitted)” which creates our first partition.
2. The parameter, column, was detailed to be “zero-based” meaning that the index value starts at zero (no negative indexes can exist) and thus creates a second partition.
3. The parameter, data, should be able to contain varying sizes of very large and very small (positive and negative) double values, which creates a third and final partition.

### ‘equal(double[][] a, double[][] b)’ ###
1.	Null **a and b**
-	a and b are null (Valid)
-	a and b are not null (Valid)
- 	a is null and b is not null (Valid)
- 	a is not null and b is null (Valid)
2. 	**a and b** lengths and contents
- 	a and b have the same length and same contents (Valid)
- 	a and b have the same length and different contents (Valid)
- 	a and b have different lengths (Valid)

# 3 Test cases developed
**Range Class**
|  Class Name | Method | Partition # Related | Test Case Name | Pass/Fail | 
| ----------------- | ---------  | ------------------------  | ----------------------  | ------------ | 
| Range | expand | 1 | expandNull() | Pass |
| Range | expand | 2, 3 | expandTestLowerMarginInt() | Pass |
| Range | expand | 2, 3 | expandTestUpperMarginInt() | Pass |
| Range | expand | 3  | expandTestUpperMarginOverOne() | Pass |
| Range | expand | 3  | expandTestUpperMarginLessOne() | Pass |
| Range | expand |  2, 3 | expandTestLowerMarginDecimal() | Pass |
| Range | expand |  2, 3 | expandTestUpperMarginDecimal() | Pass |
| Range | expand | 3  | expandTestWithZero() | Pass |
| Range | expand |  3 | expandTestUpperMarginNegativeRange() | Pass |
| Range | expandToInlcude | 1 | expandToIncludeNullLower() | Pass |
| Range | expandToInlcude | 1 | expandToIncludeNullUpper() | Pass |
| Range | expandToInlcude | 2, 3 | expandToInlcudeInsideRangeUpper() | Pass |
| Range | expandToInlcude | 2, 3 | expandToInlcudeInsideRangeLower() | Pass |
| Range | expandToInlcude | 2, 3 | expandToInlcudeOutsideUpperRangeUpper() | Pass |
| Range | expandToInlcude | 2, 3 | expandToInlcudeOutsideUpperRangeLower() | Pass |
| Range | expandToInlcude | 2, 3 | expandToInlcudeOutsideLowerRangeUpper() | Pass |
| Range | expandToInlcude | 2, 3 | expandToInlcudeOutsideLowerRangeLower() | Pass |
| Range | expandToInlcude | 2, 3 | expandToInlcudeInsideRangeUpperNegative() | Pass |
| Range | expandToInlcude | 2, 3 | expandToInlcudeInsideRangeLowerNegative() | Pass |
| Range | expandToInlcude | 2, 3 | expandToInlcudeOutsideUpperRangeUpperNegative() | Pass |
| Range | expandToInlcude | 2, 3 | expandToInlcudeOutsideUpperRangeLowerNegative() | Pass |
| Range | expandToInlcude | 2, 3 | expandToInlcudeOutsideLowerRangeLowerNegative() | Pass |
| Range | expandToInlcude | 2, 3 | expandToInlcudeOutsideLowerRangeUpperNegative() | Pass |
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
| Range | shift | 1 | shiftNullUpperBound() | Pass |
| Range | shift | 1 | shiftNullLowerBound() | Pass |
| Range | shift | 2 | shiftByPositiveDoubleUpperBound() | Pass |
| Range | shift | 2 | shiftByPositiveDoubleLowerBound() | Pass |
| Range | shift | 2 | shiftByNegativeDoubleUpperBound() | Pass |
| Range | shift | 2 | shiftByNegativeDoubleLowerBound() | Pass |
| Range | shift | 3 | shiftByNegativeDoubleToGetNegativeValueUpperBound() | Fail |
| Range | shift | 3 | shiftByNegativeDoubleToGetNegativeValueLowerBound() | Fail |

*DataUtilities*
|  Class Name | Method | Partition # Related | Test Case Name | Pass/Fail | 
| ----------------- | ---------  | ------------------------  | ----------------------  | ------------ | 
| DataUtilities | createNumberArray2D | 1,2  | createNumberRegular2DArrayOfFive() | Pass | 
| DataUtilities | createNumberArray2D | 1,2 | createNumberRegular2DArrayOfOne() | Pass |
| DataUtilities | createNumberArray2D | 1,2 | createNumberRegular2DArrayOfNegativeValues() | Pass |
| DataUtilities | createNumberArray2D | 1,2 | createNumberRegular2DArrayOfHugeValues() | Pass |
| DataUtilities | createNumberArray2D | 4 | createNumber2DNullArray() | Pass |
| DataUtilities | createNumberArray2D | 3 | createNumber2DEmptyArrayOne() | Pass | 
| DataUtilities | createNumberArray2D | 3  | createNumber2DEmptyArrayEmpty() | Pass | 
| DataUtilities | calculateRowTotal | 2,3 | calculateRowTotalEmptyChart() | Pass |
| DataUtilities | calculateRowTotal | 1 | createRowTotalNull() | Pass |
| DataUtilities | calculateRowTotal | 2,3 | createRowTotalPositive() | Pass |
| DataUtilities | calculateRowTotal | 2, 3 | createRowTotalNegative() | Pass |
| DataUtilities | calculateRowTotal | 2 | calculateRowTotalNegativeIndex() | Fail |
| DataUtilities | createNumberArray | 1, 2 | createNumberArrayPositiveDouble() | Pass |
| DataUtilities | createNumberArray | 1, 2 | createNumberArrayNegativeDouble() | Pass |
| DataUtilities | createNumberArray | 4 | createNumberArrayNull() | Pass |
| DataUtilities | createNumberArray | 1, 2 | createNumberArrayZero() | Pass |
| DataUtilities | createNumberArray | 3 | createNumberArrayEmpty() | Pass |
| DataUtilities | createNumberArray | 1, 2 | createNumberArrayNegativePositive() | Pass |
| DataUtilities | createNumberArray | 1, 2 | createNumberArrayMaxDoubleFour() | Pass |
| DataUtilities | createNumberArray | 1, 2 | createNumberArrayMinDoubleFour() | Pass |
| DataUtilities | calculateColumnTotal | 3 | calculateColumnTotalEmptyChart() | Pass | 
| DataUtilities | calculateColumnTotal | 1 | calculateColumnTotalNull() | Pass |
| DataUtilities | calculateColumnTotal | 2 | calculateColumnTotalNegativeColumnNumber() | Fail |
| DataUtilities | calculateColumnTotal | 3 | calculateColumnTotalPositive() | Pass |
| DataUtilities | calculateColumnTotal | 3 | calculateColumnTotalNegative() | Pass | 
| DataUtilities | equal | 1 | testEqualityOfEqualArrays_SameLength() | Pass |
| DataUtilities | equal | 1 | testEqualityOfUnequalArrays_SameLength() | Pass |
| DataUtilities | equal | 1 | testEqualityOfArrays_DifferentLength() | Pass |
| DataUtilities | equal | 2 | testEqualityOfFirstNullArray() | Pass |
| DataUtilities | equal | 2 | testEqualityOfSecondNullArray() | Pass |
| DataUtilities | equal | 2 | testEqualityOfTwoNullArrays() | Pass |

Each partition number matches the corresponding number for that function as listed in Section 2. 

# 4 How the team work/effort was divided and managed

As a group, we decided to use pair testing and divided the unit tests among ourselves. All of the work was also being done remotely using Discord with each group member sharing their screens in the pairs that were previously formed. The methods were also divided to make it easier to complete the lab instead of doing it all in one large group. The work was divided as followed:

*Pair #1 (Rachel/Abhay):*
This pair developed unit test cases for 2 methods in the Range class:
- expand(Range range, double lowerMargin, double upperMargin)
- expandToInclude(Range range, double value)
This pair also developed unit test cases for 3 methods in the DataUtilitiesclass:
- calculateRowTotal(Values2D data, int row)
- createNumberArray(double [] data)
- createNumberArray2D(double[][] data)

*Pair 2 (Alexis/Lauraine):*
This pair developed unit test cases for 3 methods in the Range class:
- combine(Range range1, Range range2)
- getLength()
- shift(Range base, double delta)
This pair also developed unit test cases for 2 methods in the DataUtilitiesclass:
- calculateColumnTotal(Values2D data, int column)
- equal(double[][] a, double[][] b)

With this testing strategy, both pairs were able to develop their understanding of both classes and each of their methods while completing the tests in an efficient time. Once both pairs have completed their test cases, we will review and explain our processes as a group. As a strategy for creating the test cases, we used the boundary values, which were seen in various of our test cases, where we would test to see if it was near the boundary or not. It would have been redundant to do test cases that were similar to each other. For example, we can use the variables using values above the upper boundary (AUB). In the boundary values, we used the function values which can be passed as parameters to test these cases of these independent variables. This strategy was similar to the equivalence classes but instead, examined the minimum and maximum values. After these steps, we were able to create a project in Eclipse with the SUT  which was showcased in our two test classes. 

# 5 Difficulties encountered, challenges overcome, and lessons learned

One of the major difficulties we ran into was that some of the JAR files were missing. We needed to include the *hamcrest-all* jar file in order for the mocking objects to work for the DataUtlitiesTest class. Another challenge we faced was trying to have the JFreeChart demo work on MacBook laptops. The windows would not always pop up properly which forced us to switch to using Windows machines to create the Eclipse project. The complexity of the lab document was also another challenge we faced because some of the things were not as clear like how to run the mocking objects. We also had challenges in overcoming the ability to effectively split the work among ourselves. We solved this by dividing ourselves into pairs where we would have one person code and another review. 

Mocking objects is creating an implementation for being able to execute tests with premade objects to mimic real objects. For the mocking, we used jMock which is similar to Mockito as seen in the lectures. jMock allowed us to have this interaction between the real function and the mock object - giving us the ability to test the method calls. With jMock, it is easier to define the mock object and keep a continuous flow of the code. jMock also provides the functionality of creating an object tailored to the function being tested in the unit testing framework. This ability to mock objects enables us to simulate the behavior of a complicated real object in our unit testing - whereas including a real object is impractical. 

There are some problems with mocking as it overrides the logic of a class because the real logic for the object creation is not fully shown when doing unit testing. The mock object may not include all of the methods/parameters a real object is executing. The second drawback is that the mock object could have a different return type from the object in the class since it has different attributes. The behavior of a mocking object will not always be identical to the real object. For example, there could be a situation where the mock is not throwing an exception when it should. 

# 6 Comments/feedback on the lab itself

As a group, we found the differences between what was posted on D2L and what was posted on GitHub to be quite confusing. These differences resulted in major uncertainties and obstacles that prevailed throughout the entirety of the lab. Specifically, comparing the files on D2L and GitHub, the artifacts folder and lab document were different versions and performed differently when testing. Due to this lack of consistency between platforms, initially half of our group operated on the D2L files and half operated on the GitHub files - resulting in us being very confused when we had different tests fail. For example, on the D2L version, the getUpperBound() function in the Range class failed to return the upper bound value, but in the GitHub version, getUpperBound() returned the correct value. It was more frustrating to hear that other groups were experiencing the same problems, yet there were no announcement made during the lab or in lectures that we were meant to use the GitHub files explicitly; groups had to contact the professor or the TA to know that the D2L version was out of date. 

As mentioned in the section above, after our group switched to working on the GitHub version, there still were issues with the files from the artifact folder. The mock test were all failing due to  the *hamcrest-all* jar file not being included in our artifacts folder. This issue was resolved after we contacted the TA and Professor to clarify if we are allowed/meant to include external jars such as the *hamcrest-all* jar file.

Overall, this miscommunication caused confusion and resulted in us having to constantly adapt and work around these obstacles.
