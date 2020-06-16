package ru.moodle.Appline.course.FourthQuestion;

public class Candy {
    private String nameCandy,feature;
    private int price, weight;

    public String getNameCandy() {
        return nameCandy;
    }

    public void setNameCandy(String nameCandy) {
        this.nameCandy = nameCandy;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Chocolate {" +
                "nameCandy='" + nameCandy + '\'' +
                ", feature='" + feature + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
