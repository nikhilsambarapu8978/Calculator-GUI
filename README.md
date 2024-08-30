# Calculator GUI

## Overview

This is a basic calculator application built using Java Swing. It provides a graphical user interface (GUI) for performing basic arithmetic calculations. The calculator supports operations with up to four operands and can perform addition, subtraction, multiplication, and division.

## Features

- **Basic Arithmetic Operations**: Supports addition, subtraction, multiplication, and division.
- **Supports Multiple Operands**: Handles up to four operands in a single calculation.
- **Simple GUI**: User-friendly interface with buttons for digits (0-9), operators (+, -, *, /), and additional functionalities (equals and clear).

## Usage

1. **Input Numbers**: Click the number buttons to input numbers into the display field.
2. **Select Operator**: Click an operator button (+, -, *, /) to set the operation.
3. **Add Operand**: Click the number buttons again to add more operands.
4. **Calculate Result**: Click the "=" button to compute the result.
5. **Clear Input**: Click the "C" button to clear the display field and reset the calculator.

## Code Description

- **Input Field**: A `JTextField` used to display the current input and results.
- **Number Buttons**: `JButton` instances for digits 0 through 9.
- **Operator Buttons**: `JButton` instances for the arithmetic operators (+, -, *, /).
- **Equal Button**: `JButton` that triggers the calculation of the result.
- **Clear Button**: `JButton` that clears the input field and resets the calculator state.

## Code Workflow

1. **Number Input**: Appends the clicked number to the input field.
2. **Operator Selection**: Stores the current input as an operand and sets the operator for the next calculation.
3. **Calculation**: Computes the result based on the stored operands and selected operator.
4. **Clearing**: Resets the input field and operator for a new calculation.

## How to Run

1. Compile the Java code using a Java compiler (e.g., `javac`):
   ```sh
   javac Calculator.java
