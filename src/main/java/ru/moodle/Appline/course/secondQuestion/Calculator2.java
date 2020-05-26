package ru.moodle.Appline.course.firstQuestion;

import java.util.Scanner;

public class Calculator2 {
    //For test, need use main class.
    public static void main(String[] args) {
        /**
         * A calculator that produces addition, subtraction, multiplication, division.
         */
        double firstNumber, secondNumber;
        int symbol;
        String outputCalc = "y";
        // used cycl to repeat the operation
        while (outputCalc.equals("y")) {
            System.out.println("Please, when you enter double nomber, use delimiter , ");
            Scanner read = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            firstNumber = read.nextDouble();
            read.nextLine();
            System.out.print("Enter the second number: ");
            secondNumber = read.nextDouble();
            read.nextLine();
            System.out.print("Enter the type operation, where: 1 = +, 2 = -, 3 = *, 4 = / : ");
            symbol = read.nextInt();

            switch (symbol) {
                case 1:
                    System.out.printf("Result = %.4f%n", (firstNumber + secondNumber));
                    break;
                case 2:
                    System.out.printf("Result = %.4f%n", (firstNumber - secondNumber));
                    break;
                case 3:
                    System.out.printf("Result = %.4f%n", (firstNumber * secondNumber));
                    break;
                case 4:
                    System.out.printf("Result = %.4f%n", (firstNumber / secondNumber));
                    break;
                default:
                    System.out.println("Please, enter correct type operation");
            }
            System.out.println("Would you like to repeat? Enter y = yes, n = no:");
            outputCalc = read.next();
        }
    }
}
