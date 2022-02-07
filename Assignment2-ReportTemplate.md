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

// including the input partitions you have designed

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
