// Refernce: https://www.w3schools.com/java/ref_output_printf.asp
// Created by : Gabriela Zambrano 
// Group:10BDate:
// Topic:
// Date:
// Check the Input-Process-Output steps

import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number:");
        double number1 = scanner.nextDouble();

        System.out.println("Please enter the second number:");
        double number2 = scanner.nextDouble();

        System.out.println("Please enter the third number:");
        double number3 = scanner.nextDouble();

        double sum = number1 + number2 + number3;

        System.out.println("The sum of " + number1 + ", " + number2 + " and " + number3 + " is: " + sum);

        scanner.close();
    }
}





import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number:");
        double number1 = scanner.nextDouble();

        System.out.println("Please enter the second number:");
        double number2 = scanner.nextDouble();

        double product = number1 * number2;

        System.out.println("The product of " + number1 + " and " + number2 + " is: " + product);

        scanner.close();
    }
}