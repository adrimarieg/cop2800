/**********************
Create a Java program with a class named SimpleCalculator. Inside this class, implement the following public static methods:

- double add(double a, double b): Returns the sum of a and b;
- double subtract(double a, double b): Returns the result of a minus b;
- double multiply(double a, double b): Returns the product of a and b;
- double divide(double a, double b): Returns the quotient of a divided by b. If b is 0, return the constant Double.NaN.

Note: Double.NaN is a special constant that is part of the Java library. It represents a value that is Not a Number.

In your main method, allow the user to:

first select an operation by entering a character: + for addition, - for subtraction, * for multiplication, and / for division;
then enter two values that will be used as arguments for the function implementing the selected arithmetic operation.

Finally, your program should print a message in the following format:

Result: [result]
***********************/

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);

        System.out.println("Enter an operation (+, -, *, /):");
        String selection = keyboard.next();

        System.out.println("Enter the first number: ");
        int arg1 = keyboard.nextInt();

        System.out.println("Enter the second number: ");
        int arg2 = keyboard.nextInt();
        
        //double result;

        if (selection.equals("+")) {
            System.out.print("Result: " + add(arg1, arg2));
        } else if (selection.equals("-")) {
            System.out.print("Result: " + subtract(arg1, arg2));
        } else if (selection.equals("*")) {
            System.out.print("Result: " + multiply(arg1, arg2));
        } else if (selection.equals("/")) {
            System.out.print("Result: " + divide(arg1, arg2));
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }
    
    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b){
        return a * b;
    }

    public static double divide(double a, double b){
        if (b == 0) {
            return Double.NaN;
        } else {
            return a / b;
        }
    }
}
