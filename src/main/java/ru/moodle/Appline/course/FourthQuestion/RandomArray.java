package ru.moodle.Appline.course.FourthQuestion;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int[] arrayInt = new int [20];
        int minElement, maxElement, buffer, iter = 0;
        Random rand = new Random();
        /*Randomly filling the array*/
        for (int i = 0; i < 20; i++){
            arrayInt[i] =(int) (Math.random() * 21)-10;
        }

        System.out.println("your array");
        for (int i = 0; i < 20; i++) {
            System.out.print(arrayInt[i]+" ");
        }
        maxElement = minElement = 0;
        while ( iter < 20){
            if (arrayInt[iter]>0){
                minElement = iter;
            } if (arrayInt[iter]<0){
                maxElement = iter;
            } if (maxElement != 0 & minElement != 0){
                iter = 20;
            } else {
                iter++;
            }
        }

        /*Find min and max elements*/
        for (int i = 0; i < 20; i++) {
            if ((arrayInt[i] > 0) & (arrayInt[i] < arrayInt[minElement])){
                minElement = i;
            } if ((arrayInt[i] < 0) & (arrayInt[i] > arrayInt[maxElement])){
                maxElement = i;
            }
        }
        System.out.println("\nminimum positive element = " + arrayInt[minElement] + " maximum negative element = " + arrayInt[maxElement]);

        buffer = arrayInt[minElement];
        arrayInt[minElement] = arrayInt[maxElement];
        arrayInt[maxElement] = buffer;

        System.out.println("your new array");
        for (int i = 0; i < 20; i++) {
            System.out.print(arrayInt[i]+" ");
        }

    }
}
