 In this exercise, we will see the difference between g and e specifiers for printf. Check the syntax at the bottom for some help, but we will only be using 3 flags.

## Instructions
1. Use the same printf to add in your results for e and g.
1. The first calculation should be using the g specifier as for the second should be using the e specifier
1. Both should be aligned to the left side (make sure to use a flag for that)
1. For the multiplication prints, include a group separator
1. For the negative prints, use the flag that prints out +/-


### Syntax for the printf Method
As known, the *printf* method can be used to give the output a specific format. However, there are data types that have to be taken into consideration. 

Recall the structure of formatting:
```java
System.out.printf(format, argument);
```
As for the format syntax: 
`%<flags><width><.precision>specifier`
*ex: System.out.printf("%-10.2f", 5.009); => 5.01*

### ~ Within Specifier ~
For integers — 
* `d` is Decimal (ordinary) integer

For decimal numbers —
* `f` is for Fixed-point (everyday notation) fixed point
* `e` is for E-notation floating-point
* `g` is for General floating-point. However, Java decides whether to use E-notation or not

**Within <.precision>:**.precision is telling the formatter how many numbers should be after the decimal, it will round up if eligible.Thus, the example about tells for there to be two numbers after the decimal plus rounds up.

### Flags
![Flags](https://imgur.com/ni91Wxy.jpg)

*__NOTE:__ We won't be dealing with flags or width for this exercise, but don't be discouraged to play around with it!*
