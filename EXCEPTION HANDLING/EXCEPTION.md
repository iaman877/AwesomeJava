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

## Java try block
* Java try block is used to enclose the code that might throw an exception. It must be
used within the method.
* Java try block must be followed by either catch or finally block.
## Java catch block
* Java catch block is used to handle the Exception. It must be used after the try block
only.
* You can use multiple catch block with a single try.
Example 1:
```
1. try{
2. //code that may throw exception
3. }catch(Exception_class_Name ref){} 
```
Example 2:
```
1. try{
2. //code that may throw exception
3. }finally{}
```
### Program: Problem without Try Catch
```
1. public class Testtrycatch1{
2. public static void main(String args[]){
3. int data=50/0;//ArithmeticException
4. System.out.println("rest of the code...");
5. }
6. }
```
Output
![2](https://user-images.githubusercontent.com/49730521/75778697-4ef28300-5d7e-11ea-81ea-61ad37d5f29a.PNG)
