# EXCEPTION HANDLING IN JAVA
## Errors :
1. Compile time errors or Syntax errors
> missing ;, misspelling, using variables without declaration, assigning values, underflow, overflow, data type mismatch etc.
2. Runtime errors
> Division by zero, invalid conversion, accessing invalid index of array etc.
## Exception :
* In java, exception is an event that disrupts the normal flow of the
program. It is an object, which is thrown at runtime.
*  Whenever Exceptions occurs java creates an object of Exception class or its
deriving class.
## Exception Handling :
> Exception Handling is a mechanism to handle runtime errors such as ClassNotFound, IO, SQL, Remote etc.
### Common Example of Exceptions:
If we divide any number by zero, there occurs an *ArithmeticException*.
1. int a=50/0;    //ArithmeticException

If we have null value in any variable, performing any operation by the variable occurs an *NullPointerException*.
```
1. String s=null;
2. System.out.println(s.length());    //NullPointerException
```

The wrong formatting of any value, may occur *NumberFormatException*. Suppose
I have a string variable that have characters, converting this variable into digit will
occur NumberFormatException.
```
1. String s="abc";
2. int i=Integer.parseInt(s);//NumberFormatException 
```
If you are inserting any value in the wrong index, it would result
*ArrayIndexOutOfBoundsException* as shown below:
```
int a[]=new int[5];
2. a[10]=50; //ArrayIndexOutOfBoundsException
```
There are 5 keywords used in java exception handling.
1. try
2. catch
3. finally
4. throw
5. throws
