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

Text…

// write down the name of the test methods and classes. Organize the based on
the source code method // they test. identify which tests cover which partitions
you have explained in the test strategy section //above

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

Text…
