DO NOT REMOVE THIS PARAGRAPH  
STUDENT ID: 46358757  
STUDENT NAME: Dominic Wright  
[]: add an 'x' inside the square brackets to declare that you haven't seen any other person's code

# Assignment 1 - Worth 5%

## Who doesn't like ice cream!

### Due 5pm (17:00:00) Sydney Time, Sunday 13th March, 2022

### Learning objectives

1. Applications of arrays and two-dimensional arrays
2. Unit testing

[Lecture notes from COMP1000 - 1](https://softwaretechnologymq.github.io/composite_data)

[Lecture notes from COMP1000 - 2](https://softwaretechnologymq.github.io/reference_semantics)

### Introduction

Assignment 1 is the shortest of the three assignments and deals with some data stored in two-dimensional arrays.

1. `iceCreamDetails: String[][]`: Each sub-array has three items. For index `i`:
    1. `iceCreamDetails[i][0]`: Company name
    2. `iceCreamDetails[i][1]`: Ice cream flavour
    3. `iceCreamDetails[i][2]`: Type 
2. `sizeAndPrices : double[][]`: Each sub-array has two items. For index `i`:
    1. `sizeAndPrices[i][0]`: Size (1 - kids, 2 - small, 3 - regular, 4 - jumbo) 
    2. `sizeAndPrices[i][1]`: Price

These arrays are already read and ready for you to operate on.

Since each ice cream flavour must have a corresponding data, and each data value must belong to an ice cream flavour, you can assume that the size of both arrays is the same. That is, number of sub-arrays in `iceCreamName` is the same as the number of sub-arrays in `data`.

Further, you may assume that none of the sub-arrays in either array is `null`.

For example, if the first record (after header) in the raw csv file is:

```
Cow & the Moon,	Passionfruit Cream, Cup, 1, 6
```
 
It will result in 

```java
iceCreamDetails[0] = {"Cow & the Moon", "Passionfruit Cream", "Cup"}
sizeAndPrices[0] = {1, 6}
```

Which means

```java
iceCreamDetails[0][0] = "Cow & the Moon";
iceCreamDetails[0][1] = "Passionfruit Cream";
iceCreamDetails[0][2] = "Cup";
```

and 

```java
sizeAndPrices[0][0] = 1;
sizeAndPrices[0][1] = 6;
```

You should only modify the functions in file `IceCreamPrices.java`. None of the other files in the assignment must be changed. Definitely, not the test file ` IceCreamTest.java`.

There are a total of 12 function, the last one, `sameSize`, being a *bonus*, unassessed function, purely for bragging rights. 

The first 9 functions are worth 10 marks each and the last two functions are worth 5 marks each.

Please pay very very very very very, very close attention to:

<center>
**"Rules applicable to all assignment and weekly submissions"**
</center>

on iLearn. Create a checklist and tick off each item to ensure you don't get caught out.

### Use of helper functions

You can add other functions that the functions you need to complete then call. In fact, this is encouraged and makes coding more efficient through delegation.

### Student Declaration

Make sure you put an `x` inside the square brackets for student declaration at the top of `IceCreamPrices.java`.
Failure to do so will incur a 10% (0.5 mark) penalty.

### File to be submitted

Submit only one file - `IceCreamPrices.java`. Do not submit any other file.

Late submissions are not accepted. Any extension requests must be made through [askMQ](https://ask.mq.edu.au/).


