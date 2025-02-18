# LAB 6
1.	Aim of the program - Write a Java program to generate an ArrayIndexOutofBoundsException and handle it using catch statement.
    - Input: Enter the  numbers -Example: 1 2 3 4 5 ( Suppose array size is 4 )
    - Output: Exception in thread “main” java.lang.ArrayIndexOutOfBoundsException:4

2.	Aim of the program-  Write a Java program to handle an ArithmeticException using try, catch, and finally block.
    - Input: Operand values for division operation mentioned in the program
    - Output: ArithmeticException caught by try-catch-finally block
 
3.	Aim of the program-  Write a Java class which has a method called ProcessInput(). This method checks the number entered by the user. If the entered number is negative then throw an user defined exception called NegativeNumberException, otherwise it displays the double value of the entered number.
    - case-1
        - Input: Enter a number      4
		- Output: Double value:  8
	- case-2
        - Input: Enter a number    -4
		- Output:   Caught the exception<br>
			 Exception occurred:  NegativeNumberException: number should be positive
4.	Aim of the Program: Write a program to create user defined exceptions called HrsException, MinException and SecException. Create a class Time which contains data members hours, minutes, seconds and a method to take a time from user which throws the user defined exceptions if hours (>24 &<0),minutes(>60 &<0),seconds(>60 &<0).
    - case-1
        - Input:  <br>Enter hours: 4<br>
Enter minutes: 54<br>
Enter seconds: 34
	    - Output: Correct Time-> 4:54:34
	- case-2
	    - Input: <br> Enter hours: 30 <br>
Enter minutes: 65 <br>
Enter seconds: 65
	    - Output: Caught the exception<br>
Exception occurred:  InvalidHourException:hour is not greater than 24<br>
Exception occurred:  InvalidMinuteException:hour is not greater than 60<br>
Exception occurred:  InvalidSecondException:hour is not greater than 60

5.	Aim of the Program: Create an user defined exception named CheckArgument to check the number of arguments passed through command line. If the number of arguments is less than four then throw the Check Argument exception, else print the addition of squares of all the four elements.
    - case-1
	    - Input: 4  3  2  1
		- Output : 30
    - case-2
	    - Input: 4  3  2  
	    - Output : Exception occurred - CheckArgument
