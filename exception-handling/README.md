Basic Exception Handling

Exception - an event that occurs during the execution of a program.
Exception Handling - is the process used to change the normal flow of code execution.
Checked exceptions - exception that occurs during compilation.

CHECKED EXCEPTIONS
ClassNotFoundException - The class is not found.
IllegalAccessException - Access to class is denied.
InstantiationException - Attempt to create an object of an abstract class or an interface.
NoSuchMethodException - A requested method does not exist.

Unchecked exceptions (sub class) - are exceptions that occur during execution. These are also known as runtime exceptions (super class of unchecked exceptions).

UNCHECKED EXCEPTIONS
ArithmeticException - occurs when an integer is divided by 0.
ArrayIndexOutOfBoundsException - accessing an invalid index of the array.
ArrayStoreException - assigning a value to an array index that does not match the expected data type.
InputMismatchException - entering a value that does not match the expected data type
NullPointerException - invalid use of a null reference
NumberFormatException - invalid conversion of a string to a numeric format
StringIndexOutOfBoundsException - accessing an invalid index (character) of a string.

try, catch, and finally
try - a block of code that might throw an exception that can be handled by a matching catch block.
catch - is a segment of code that can handle an exception that might be thrown by the try block that precedes it.
finally - contains statement which are executed whether or not an exception is thrown. (not required).

TIP: 
there can only be one try on a try-catch. there can be multiple catch on a try-catch.
there can only be one finally on a try-catch.

user-defined exception - is created by extending the Exception class. 

throw statement - sends an exception out of a block or a method so it can be handled elsewhere.
