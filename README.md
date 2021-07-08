# Java_Basics
**Install Packages**
1. JDK(Java Development Kit) 1.11
2. JRE (Java Runtime Environment)1.11

**OS**
Linux(Ubuntu)

**IDE**
Eclipse 


**How to Run the code on terminal**
In java 11 we can directly run the code without using compiler. 
e.g. java Filename.java

## Primitive Data Types in java
main()
In DataType Program I have created Some Variables of Different Types of values.
The range is defined for each and every data type.
If our value will get incremented beyond the largest range value then the output will become smallest range value because it gets round up while incrementing number.

Character:
for char if we assign character to an integer datatype then ASCII value get printed out of that character and vice-versa.
a-z=97-122
A-Z=65-90

boolean:
boolean returns only two values true or false.
Every non zero value is true i.e. ...-3,-2,-1,1,2,3... 
only 0 is false


## Wrapper Classes
wrapper classes are like Chocolate if we wrap up choclate into wrapper then this will become autoboxing.
If we open that wrapper and getting out that choclate then this will become unboxing.

Each Java primitive has a corresponding wrapper:

boolean, byte, short, char, int, long, float, double 
Boolean, Byte, Short, Character, Integer, Long, Float, Double

These are all defined in the java.lang package, hence we don't need to import them manually.

In main()
I have write some primitive data types and passing this as a argument to the wrapper class's constructor by creating object and finally print that object.
    int i=100;
		Integer iObj=new Integer(i);
		System.out.println("Integer Object:"+iObj);

All of the numeric wrapper classes are subclasses of the abstract class Number.
Only Character Class implements java.io.Serializable



## Methods Of Wrapper Classes
main()
   For AutoBoxing
   Integer obj1 = new Integer(1);

   Integer Obj2 = Integer.valueOf(1);

   For Unboxing
   int val = object.intValue();

   We can Convert String to any wrapper classes except String to character.
   Integer intObj = new Integer("AnyStringValue");

   also we can convert wrapper to String by using toString() method.
   String intStr = intObj.toString();


## Operators In java
**class Operators**
main()
//Arithmetic Operators
Taking two variables a and b and perform arithmetic operations(+,-,/,*,%) on that and store answer in ans variable. 

//Assignment Operator
Assign 10 value in a i.e. a=10;
Assign b's value in a i.e. a=b;
Increment b's value by 10 i.e. b+=10 => internally b=b+10

//Unary Operator
If the value is a=10;
++a= 11 (In this case first increment has done in memory and return that value to variable)
a++ =10 (In this case first value returns to the variable and then incrementing the value in memory)

//Relational Operators
Relational operator always returns boolean value.(<,>,<=,>=,==)
    num1=10;
		num2=20;
		boolean ans1;
		ans=num1<num2;
		System.out.println("10<20:"+ans1);//returns true
    
//Bitwise OPerator
Bitwise operator works on logical truth table (&(AND),|(OR),^(XOR))
only float and double values are not used for bitwise operator remaining all are suitable.
    ans=10 & 20;
		System.out.println("10 & 20:"+ans);     1 0 1 0  
                                                     &
                                          1 0 1 0 0
                                          ___________
                                          0 0 0 0 0 = 0
     Hence Answer is 0.
     
**class BitwiseComp**
For Complement we use(~) sign which is equivalent to negation in truth table

**InstanceOf program**
class Facebook
main()
    Created object of Instagram Class
    passing object as an arguement to the static method of Instagram class
    Calling Instance method
    
 class Instagram
 static void posts(Instagram obj)
     to check that obj is instanceOf Instagram or not here I use ternary Operator
     String res=(akankshaa_940 instanceof Instagram)?
     instanceOf operator always returns boolean value.
 


## StaticAndInstance Program
**Class AWing**
   
    static float MaintainanceBill=30000.50f;     //Static Variable
		float LightBill=560.70f;	   //Instance Variable
    
    void PersonalBill() //Instance method
        In this method we can print both instance or static variable
        print(LightBill)
        
     static void ChairManBill()
        In this method only Static variable can print if we have to print instance variable we must have to print it by creating object
         print(MaintainanceBill)
    
**Class BWing**
  Same as AWing Class only values are changed.
  
**Class KrushnaHeights**
main()
  Creating Object of both classes and calling methods.
  Calling Static methods directly by class name
      AWing.ChairManBill();
  for instance methods we have create object
      AWing MateHouse=new AWing();
      MateHouse.LightBill=585.76f;

      MateHouse.PersonalBill();
      
   ## New Features in Java 11
   
   **class NewFeaturesOfJava11**
   main()
   var userID=1234; //userID => int In java11 we need not to write dataTypes for each and every variable
   Strings method
   1)repeat(int)
    to print string repetedly
   2)isBlank()
      to check string is blank or not and return boolean value 
   3)strip()
      Remove white spaces from String
   4)stripLeading()
      Remove white spaces from starting of the string
   5)stripTrailing()
      Remove white spaces from end of the string
   6)lines()
      The lines() method is a static method. It returns a stream of lines extracted from a given multi-line string, separated by line terminators.
   7/isEmpty()
      If a value is not present, returns true, otherwise false.
			

