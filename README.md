# Java_Basics
**Install Packages**
1. JDK(Java Development Kit) 1.8
2. JRE (Java Runtime Environment)

**OS**
Linux(Ubuntu)

**IDE**
gedit 

**Compile the code on terminal**
Javac Filename.java

After compiling it creates .class file 
Run the .class file which has main method then only it runs successfully otherwise it gives error:main method not found

**Run the code on terminal**
Java classname

## Primitive Data Types in java
In Java, the primitive data types are the predefined data types of Java. They specify the size and type of any standard values.

There are 8 types of Java primitive data types namely:

a. int   -The maximum values of integer is 2^31 and the minimum value is -2^31.

b. float -float is used for storing decimal values. Its default value is 0.0f and has a size of 4 bytes. It has an infinite value range.

c. char  -Its default value is ‘\u0000’ with the max value being ‘\uffff’ and has a size of 2 bytes.

d. boolean  -boolean datatype can have only two values ‘true’ and ‘false’. It has a default value of ‘false’ and a size of 1 byte. 

e. byte	 -It’s an 8 bit signed two’s complement . The range of values are -128 to 127.

f. short -It’s 2 times smaller than the integer datatype.Its minimum range is -32,768 and maximum range is 32,767.

g. long  -It is a 64 bit integer and ranges from -2^63 to +(2^63)-1.

h. double -It has a range of -2^31 to (2^31)-1.

##Wrapper Classes
wrapper classes are objects encapsulating primitive Java types.

Each Java primitive has a corresponding wrapper:

boolean, byte, short, char, int, long, float, double 
Boolean, Byte, Short, Character, Integer, Long, Float, Double

These are all defined in the java.lang package, hence we don't need to import them manually.

##Methods Of Wrapper Classes
For AutoBoxing
Integer obj1 = new Integer(1);

Integer Obj2 = Integer.valueOf(1);

For Unboxing
int val = object.intValue();

##Operators In java
1. Java Arithmetic Operators

Operator	Operation
+		Addition
-		Subtraction
*		Multiplication
/		Division
%		Modulo Operation (Remainder after division)

2. Java Assignment Operators

Operator	Example		Internally
=		      a = b;		a = b;
+=		    a += b;		a = a + b;
-=		    a -= b;		a = a - b;
*=		    a *= b;		a = a * b;
/=		    a /= b;		a = a / b;
%=		    a %= b;		a = a % b;

3. Java Relational Operators

Operator	Description			          Example
==		    Is Equal To			          3 == 5 returns false
!=		    Not Equal To			        3 != 5 returns true
>		      Greater Than			        3 > 5 returns false
<		      Less Than			            3 < 5 returns true
>=		    Greater Than or Equal To	3 >= 5 returns false
<=		    Less Than or Equal To		  3 <= 5 returns true

4. Java Logical Operators
Operator		        Example				                Meaning
&& (Logical AND)	  expression1 && expression2	  true only if both expression1 and expression2 are true
|| (Logical OR)		  expression1 || expression2	  true if either expression1 or expression2 is true
! (Logical NOT)		  !expression			              true if expression is false and vice versa

5. Java Unary Operators

Operator	Meaning
+		  Unary plus: not necessary to use since numbers are positive without using it
-		  Unary minus: inverts the sign of an expression
++		Increment operator: increments value by 1
--		Decrement operator: decrements value by 1
!		  Logical complement operator: inverts the value of a boolean

6. Java Bitwise Operators

Operator	Description
~		      Bitwise Complement
<<		    Left Shift
>>		    Right Shift
>>>		    Unsigned Right Shift
&		      Bitwise AND
^		      Bitwise exclusive OR

7. Java instanceof Operator

The instanceof operator checks whether an object is an instanceof a particular class or not.It returns true or false.

8.Java Ternary Operator

variable = Expression ? expression1 : expression2
If the Expression is true, expression1 is assigned to the variable.
If the Expression is false, expression2 is assigned to the variable.

## Static Variable
A single copy to be shared by all instances of the class
A static variable can be accessed directly by the class name and doesn’t need any object

## Instance Variable
Different copies to be shared by all instances of the class
An instance variable can be accessed only through object 

## Static Method
A static method can call only other static methods and can not call a non-static method from it.
A static method can be accessed directly by the class name and doesn’t need any object.
A static method cannot refer to "this" or "super" keywords in anyway.

## Instance Method
An instance method can call both static or non-static methods from it.
We must have to call instance method through the object of a class.
An instance method can refer to "this" or "super" for particular instance of a class.
