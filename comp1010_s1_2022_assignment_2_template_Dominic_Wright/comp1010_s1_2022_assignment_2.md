DO NOT REMOVE THIS PARAGRAPH  
STUDENT ID: 46358757  
STUDENT NAME: Dominic Wright  
[x]: add an 'x' inside the square brackets to declare that you haven't seen any other person's code

# COMP1010 S1 2022 Assignment 2

## Due: Sunday 1st May, 17:00:00 (5pm) Sydney Time


# Introduction

This is an assignment that implements a geometric entity in `Polygon`.

Some of the definitions of a *polygon* are:

- a plane figure that is described by a finite number of straight line segments connected to form a closed polygonal chain (or polygonal circuit). The bounded plane region, the bounding circuit, or the two together, may be called a polygon. (Source: https://en.wikipedia.org/wiki/Polygon)
- a plane shape (two-dimensional) with straight sides. (Source: https://www.mathsisfun.com/definitions/polygon.html)
- a geometric object "consisting of a number of points (called vertices) and an equal number of line segments (called sides), namely a cyclically ordered set of points in a plane, with no three successive points collinear, together with the line segments joining consecutive pairs of the points. In other words, a polygon is closed broken line lying in a plane" (Source: Coxeter and Greitzer 1967, p. 51, via https://mathworld.wolfram.com/Polygon.html)


## Stages 

First stage is implementing a simple point class. Several aspects of this class have already been implemented, and labelled as `//DO NOT MODIFY`.

Second stage is implementing the `Polygon` class. This class holds an array holding Point objects, in the order the are connected in the polygon. 

Every item, except the last one, say `points[i]`, is connected to `points[i+1]`. The last point `points[points.length-1]` is connected back to `points[0]`.

Specifications for each method are provided as method javadoc.

## Polygon constructor

The two constructors in the `Polygon` class will decide if this assignment is a nightmare or a breeze for you. Make sure you watch the lectures, read the lecture notes, and most importantly read the specifications carefully. I will not spell out the concepts and the traps in the specification.

## Unit tests

Unit tests for all methods, except the following (all in `Polygon` class), are provided. For the following methods, students must write their own unit tests. You do not need to submit the test files. The more comprehensive is your test data, the higher is the assurance that you will pass our tests (which, we would hope, are exhaustive).

1. `goingFurtherFromOrigin`
2. `circumference`
3. `closestToOriginIndex`

## Submission

Submit only two java files `Point.java`, `Polygon.java`. Please see the unit guide for our late submission policy.

## Grading

- `Point.java`: 20 marks
- `Polygon.java`: 60 marks
- `Coding style`: Proportional to automarking output, up to a maximum of 20 marks. If you get 0 marks for the automarker, you can get up to 0 marks in coding style. If you get full marks for the automarker, you can get up to 20 marks in coding style. If you get 60/80 (75%) for the automarker, you can get up to 15/20 in coding style.

## Rules

Standard rules listed on iLearn apply. Some common problems: any use of any function from outside the classes provided will get you an automatic zero. Any infinite loop will get you an automatic zero. Any compilation error (including, one caused by incorrect filename) will get you an automatic zero.
