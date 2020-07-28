package ru.moodle.Appline.course.FourthQuestion;

import ru.moodle.Appline.course.FourthQuestion.Sweets.Candies;
import ru.moodle.Appline.course.FourthQuestion.Sweets.Chocolate;
import ru.moodle.Appline.course.FourthQuestion.Sweets.Marmalade;
import ru.moodle.Appline.course.FourthQuestion.Sweets.Sweets;

public class Gift {
    public static void main(String[] args) {
        Double weight,price;

        Chocolate choco1 = new Chocolate("Twix", 15.5, 70.2, "nougat");
        Chocolate choco2 = new Chocolate("Snikers", 20.0, 60.7, "nuts");
        Marmalade marm1 = new Marmalade("Haribo GOLDBAREN", 140.0, 112.0, "bear");
        Candies candies1 = new Candies("Raffaello", 150.0, 278.5, "coconut");
        Sweets[] presentGift = {choco1,choco2,marm1,candies1};
        weight = 0.0;
        price = 0.0;
        for (Sweets someSweets : presentGift){
            System.out.println(someSweets.toString());
            weight += someSweets.getWeight();
            price += someSweets.getPrice();
        }
        System.out.println("\nGift total weight = " + weight + "g and Gift total price = " + price + "rub.");
    }
}
