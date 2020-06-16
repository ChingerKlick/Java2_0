package ru.moodle.Appline.course.FourthQuestion;

public class GenerateGift {
    public static void main(String[] args) {
        int weightGift, priceGift;

        Candy twix = new Candy();
        Candy mars = new Candy();
        Candy snikers = new Candy();

        twix.setFeature("Two sticks");
        twix.setNameCandy("Twix");
        twix.setPrice(50);
        twix.setWeight(110);

        mars.setFeature("Sweet bliss");
        mars.setNameCandy("Mars");
        mars.setPrice(35);
        mars.setWeight(40);

        snikers.setFeature("There Are Nuts");
        snikers.setNameCandy("Snikers");
        snikers.setPrice(40);
        snikers.setWeight(75);

        System.out.println("Price gift = "+ (twix.getPrice() + mars.getPrice() + snikers.getPrice()));
        System.out.println("Weight gift = "+ (twix.getWeight() + mars.getWeight() + snikers.getWeight()));

        System.out.println(mars.toString());
        System.out.println(twix.toString());
        System.out.println(snikers.toString());

    }
}
