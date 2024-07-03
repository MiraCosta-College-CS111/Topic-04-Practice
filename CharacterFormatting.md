In this exercise, you will be formatting the characters using multiple format specifiers in one printf method.
Firstly, we declare our variables then assign them a value. It is important to know that assigning a value to a char variable, it requires an apostrophe in between ('a'). Quotation marks are meant for Strings.

Adding in multiple variables to format in one-go, is as simple as adding one format specifier. 

```java
// If 
char someChar = 'e';
System.out.printf("%3c", someChar); // prints out __e where _ is empty space

// Then
System.out.printf("%3c%3c", someChar, someChar); // prints out __e__e
```

Notice that the e's are far apart. In fact, they are apart by 2 white spaces. 
Although 3 is the width of this format specifier, a character takes one of those spaces resulting to two empty white spaces.

In addition, the e is on the far right because that is how the format specifier outputs by default. In order to move it to the left, the value of - has to be written within its flag. 
Just like:
```java
System.out.printf("%-3c", someChar);
```

Interestingly, there is an ability to make the characters in a format specifier to uppercase them. Simply uppercase the specifier and, bwaalah! 
For example:
```java
System.out.printf("%-3C%-3c", someChar, someChar);
```
Will print out:
```
E  e
```

I think we're ready to start!
Oh, little tip... printf has a couple special cases, similar to Strings. We will be using %n which is like \n (for a new line)

Follow the instructions to complete this exercise:
Using one printf method, call in multiple variables from c1 to c4, no field width, nothing special. (add in a new line)
Using one printf method, sort the characters to appear like MARK. Then add in a new line.
Using one printf method, make something similar as:
```
   mA    rK  
```
*Where the width is 3 for each specifier*

***You're done!***


***Recall:***

The structure of formatting:
System.out.printf(format, argument);

As for the format syntax: 
```
%<flags><width><.precision>specifier
```
ex: `System.out.printf("%-10.2f", 5.009); => 5.01 `
