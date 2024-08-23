# Calculator-GUI
 
Implementation of  Real Time Calculator using  JAVA program
JAVA CALCULATOR
OVERVIEW:
This is a basic calculator application built using Java Swing. It supports operations with up to four operands and provides a simple graphical user interface (GUI) for basic arithmetic calculations. The calculator can perform addition, subtraction, multiplication, and division.

Features
Basic Arithmetic Operations: Addition, subtraction, multiplication, and division.
Supports Multiple Operands: Handles up to four operands in a single calculation.
Simple GUI: User-friendly interface with buttons for digits (0-9), operators (+, -, *, /), and additional functionality (equals and clear).

Usage
1.Input Numbers: Click the number buttons to input numbers into the display field.
2.Select Operator: Click an operator button (+, -, *, /) to set the operation.
3.Add Operand: Click the number buttons again to add more operands.
4.Calculate Result: Click the "=" button to compute the result.
5.Clear Input: Click the "C" button to clear the display field and reset the calculator.

Code Description
Input Field: A JTextField used to display the current input and results.
Number Buttons: JButton instances for digits 0 through 9.
Operator Buttons: JButton instances for the arithmetic operators (+, -, *, /).
Equal Button: JButton that triggers calculation of the result.
Clear Button: JButton that clears the input field and resets the calculator state.

Code Workflow
Number Input: Appends the clicked number to the input field.
Operator Selection: Stores the current input as an operand and sets the operator for the next calculation.
Calculation: Computes the result based on the stored operands and selected operator.
Clearing: Resets the input field and operator for a new calculation.
