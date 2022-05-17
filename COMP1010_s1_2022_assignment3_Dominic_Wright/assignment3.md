DO NOT REMOVE THIS PARAGRAPH  
STUDENT ID: 46358757  
STUDENT NAME: Dominic Wright  
[]: add an 'x' inside the square brackets to declare that you haven't seen any other person's code

# COMP1010 - Assignment 3 - Worth 15%

### Due 5pm (17:00:00) Sydney Time, Sunday 5th June, 2022.

### Objectives
The purpose of this assignment is to test your ability to use **recursion** and **Linked lists as recursive data structures**. Hence you are strictly limited in your design and implementation: pay particular attention to the rules (at the bottom, as well as Rules applicable to all assignment and weekly submissions on iLearn). 


### Background
The [Collatz conjecture](https://en.wikipedia.org/wiki/Collatz_conjecture), or 3n+1 problem, is a simple to understand but not yet solved math problem. Given a positive integer, if it is even, halve it; if it is odd, triple it and add 1. Continue doing this until you reach the number 1. Even thought it has not yet been proven that every number will reach 1, it has been verified for every number less than 2^68.

The chain starting at **6** looks like: 6 -> 3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> **1** -> 4 -> 2 -> 1 -> 4 -> ...  
And the chain starting at **11**: 11 -> 34 -> 17 -> 52 -> 26 -> 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> **1** -> ...



For this assignment, you'll be filling in the two classes `Block` and `Chain`. A `Block` represents one number in the Collatz `Chain`. The chains that you create, should end at the first 1, and **NOT** have an infinite loop. To make it more interesting, every Block also contains a `rank`, indicating the position in the Chain. Given that every Block is formatted as `(id, rank)`.

The chain for **6** will look like: `(6, 1) -> (3, 2) -> (10, 3) -> (5, 4) -> (8, 4) -> (4, 6) -> (2, 7) -> (1, 8)`  
And the chain for **26** will look like: `(26, 1) -> (13, 2) -> (40, 3) -> (20, 4) -> (10, 5) -> (5, 6) -> (16, 7) -> (8, 8) -> (4, 9) -> (2, 10) -> (1, 11)`


### Grading
This assignment is will be automarked out of 100 points. P/CR questions are worth 11 points, D questions are worth 5 points and HD questions are worth 3 points. `CreateChain()` and `size()` both have 2 unit tests. The first one (11 points), checks that the logic of the method is correct while the second test (3 points) ensures that the solution is efficiently written. 

The Chain has been manually created for you to work in the `Block` class but all the tests for the `Chain` class are dependent on `CreateChain` since that is where the Collatz chains are created.

The questions sorted by class (and not difficulty) are:

**Block**
* numberEvenBlocks - 11 points
* numberOddBlocks - 11 points
* isValid - 11 points
* isValidAdvanced - 3 points

**Chain**
* createChain - 11 points + 3 points for efficiency
* size - 11 points + 3 points for efficiency
* maxValue - 11 points
* createFasterChain - 5 points
* firstCommonBlock - 5 points
* removeId - 5 points
* sort - 5 points
* logestChain - 5 points

### Rules
* Any use of <span style="color:red">**loops**</span> - **EVEN IF ONLY USED ONCE** - will result in a maximum grade of 70.
* Any use of <span style="color:red">**arrays**</span> will result in an automatic 0. It does not matter if it is an integer, Block or even String array, you need to solely rely on recursive data structures for this assignment.
* Other standard rules listed on iLearn apply. Some common problems: any use of any function from outside the classes provided will get you an automatic zero. Any infinite loop will get you an automatic zero. Any compilation error (including, one caused by incorrect filename) will get you an automatic zero.

### Submission
Submit only two java files `Block.java`, `Chain.java`. Please see the unit guide for our late submission policy.

### Student Declaration
Make sure you put an `x` inside the square brackets for student declaration at the top of `Block.java` and `Chain.java`.
Failure to do so will incur a 10% (1.5 mark) penalty.

### Tips to get started
* Write a iterative solution to the problem before the recursive one. You can always come back to try the recursive solution later (especially createChain).
* Helper methods are your best friends.
