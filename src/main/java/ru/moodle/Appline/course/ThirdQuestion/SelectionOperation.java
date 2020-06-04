package ru.moodle.Appline.course.ThirdQuestion;


import ru.moodle.Appline.course.secondQuestion.Calculator2;

import java.util.Scanner;

public class SelectionOperation {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();
        int selectingАnOperation, i=1;
        // the cycle of program execution
        while (i == 1) {
        Scanner inPut = new Scanner(System.in);
        System.out.print("Select the operation on the calculator = 1. Search for a long word in array 2.   ");
        selectingАnOperation = inPut.nextInt();
        //Selecting the task to run
            if (selectingАnOperation == 1) {
                calc.calc();
            } else if (selectingАnOperation == 2) {
                findLongWord();
            }
            System.out.print("Do you want to repeat choice operation? if Yes = 1, if no 0.    ");
            i = inPut.nextInt();
        }
    }
    //search for the maximum word length
    public static void findLongWord(){
        String maxLengthWord ;
        Scanner inPut = new Scanner(System.in);
        int arrayLength;
        System.out.print("Please, enter the length of array: ");
        arrayLength = inPut.nextInt();
        inPut.nextLine();
        String[] arrayWords = new String[arrayLength];
        for (int i = 0; i < arrayLength; i++){
            System.out.print("Enter your word: ");
            arrayWords[i] = inPut.nextLine();
        }
        maxLengthWord = arrayWords[0];
        for (int i = 0; i < arrayLength; i++){
                if (arrayWords[i].length() > maxLengthWord.length()) {
                    maxLengthWord = arrayWords[i];
            }
        }
        System.out.println("Array words:");
        for (int i = 0; i < arrayLength; i++){
            if (i == arrayLength-1){
                System.out.print(arrayWords[i]);
            } else {
                System.out.print(arrayWords[i] + ", ");
            }
        }
        System.out.println("\nThe longest word: " + maxLengthWord);
    }
}
